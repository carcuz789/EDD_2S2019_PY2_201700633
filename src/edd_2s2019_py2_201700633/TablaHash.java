/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_2s2019_py2_201700633;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Carcuz
 */
class NodoHash{
    char estado;
    String usuario;
    String contraseña;
    public NodoHash(String usuario, String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
}
public class TablaHash {
    private int tamano;
    private static int[] tamanos;
    private int indiceTam;
    private int ocupados;
    private float porcentajeUtil;
    private float factorUtil;
    private NodoHash [] vectorHash;
    
    
    public TablaHash(){
       this.tamanos = new int [] {7,11,13,17,19,23,29,37,43,47,53,59,67,73,79,83,89,97,103,107,113,127,137,149,157,167,179,197,211,227};
       this.indiceTam = 0;
       this.ocupados =0;
       this.factorUtil = 75.0f;
       this.tamano = tamanos[indiceTam];
       this.vectorHash = new NodoHash[tamano];
       this.porcentajeUtil = calcularPorcentajeUtil();
    }
    private int DobleHashing(String id,int factor){
        int tmp= GenerarClave(id);
        return funcion1(tmp)+(factor*funcion2(tmp)%tamano);
    }
    private int funcion1(int clave){
        return clave%tamano;
    }
    private int funcion2(int clave){
        return 1+ (clave%(tamano-1));
    }
    private int GenerarClave(String id){
        String codigo = "";
        int tmp =0;
        for (int i = 0; i < id.length(); i++) {
            codigo += id.codePointAt(i);
        }
        if(codigo.length()>9){
            return reduccion(codigo);
        } else{
            return Integer.parseInt(codigo);
        }
    }
    private int reduccion(String codigo){
        int tmp=0;
        while(codigo.length()>9){
            String aux="";
            for (int i = 0; i < codigo.length()/2; i++) {
                aux += codigo.charAt(i);
            }
            if (aux.length()>9) {
                tmp=reduccion(aux);
                aux="";
            }else{
                tmp = Integer.parseInt(aux);
                aux="";
            }
            for (int i = codigo.length()/2; i < codigo.length(); i++) {
                aux += codigo.charAt(i);
            }
            if (aux.length()>9) {
                tmp = reduccion(aux);
                aux ="";
            }else{
                tmp= Integer.parseInt(aux);
                aux= "";
            }
            codigo=tmp+"";
        }
        return tmp;
    }
    private float calcularPorcentajeUtil(){
        return (ocupados*100)/tamano;
    }
    public void insertar(String nombreVar,String contra){
        boolean insertado = false;
        if (porcentajeUtil<=75.00f) {
            for (int i = 0; i < tamano; i++) {
                int  posicion = DobleHashing(nombreVar,i);
                if (posicion>tamano) {
                    posicion-=tamano;
                }
                if (vectorHash[posicion]==null|| vectorHash[posicion].estado=='b') {
                    vectorHash[posicion]=new NodoHash(nombreVar,contra);
                    ocupados+=1;
                    porcentajeUtil=calcularPorcentajeUtil();
                    insertado=true;
                    break;
                }else{
                    if (vectorHash[posicion].usuario.equals(nombreVar)) {
                        JOptionPane.showMessageDialog(null, "USUARIO EXISTENTE ->" + nombreVar);
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null,"COLISION EN POSICION ->"+ posicion );
                    }
                }
            }
            if (insertado==true) {
                JOptionPane.showMessageDialog(null,"USUARIO INSERTADO CON EXITO -> "+nombreVar );
            }else{
                JOptionPane.showMessageDialog(null,"USUARIO NO INSERTADO CON EXITO  ->"+ nombreVar );
            }
        }else{
            JOptionPane.showMessageDialog(null,"HACER REHASHING TABLA ESTA A UN PORCENTAJE DE -> "+ porcentajeUtil );
            rehashing();
            insertar(nombreVar,contra);
        }
    }
    private void rehashing(){
        NodoHash [] temp = vectorHash;
        int tamanoTemp = tamano;
        if (indiceTam<tamanos.length) {
            indiceTam+=1;
            if (indiceTam==tamanos.length-1) {
                JOptionPane.showMessageDialog(null,"SE ALCANZO EL MAXIMO DE LA TABLA HASH  " );
            }
        }
        tamano=tamanos[indiceTam];
        vectorHash = new NodoHash[tamano];
        ocupados=0;
        porcentajeUtil= calcularPorcentajeUtil();
        for (int i = 0; i < tamanoTemp; i++) {
            if (temp[i]!=null) {
                insertar(temp[i].usuario,temp[i].contraseña);
            }
        }
        JOptionPane.showMessageDialog(null,"REHASHING REALIZADO CON EXITO" );
    }
    public String extraerNodo(String nombreVar ){
        boolean encontrado = false;
        NodoHash temp =null;
        int pos=0;
        String Contraseña="";
        for (int i = 0; i < tamano; i++) {
            int posicion = DobleHashing(nombreVar,i);
            if (posicion>=tamano) {
                posicion-=tamano;
                pos = posicion;
            }
            if (vectorHash[posicion]!= null) {
                if (vectorHash[posicion].usuario.equals(nombreVar)) {
                    temp = vectorHash[posicion];
                    Contraseña = vectorHash[posicion].contraseña;
                    encontrado = true;
                    break;
                }
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null,"USUARIO ENCONTRADO EN LA POS ->"+pos );            
        }else{
            JOptionPane.showMessageDialog(null,"USUARIO NO ENCONTRADO" );
        }
        return Contraseña;
    }
    public void Imprimir(){
                try {
            String ruta = "tablahash.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("digraph g ");
            bw.write(" subgraph cluster_0 {");
                    for (int i = 0; i < tamano-1; i++) {
                        int k=i+1;
                        bw.write(i+"->"+k+";");
                    }
            bw.write("}");
            
            bw.write("}");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}