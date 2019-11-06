/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_2s2019_py2_201700633;

/**
 *
 * @author Rodrigo Carcuz
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public  class matriz {

    public static List<String> contenido = new ArrayList<String>();
    public static List<String> fila = new ArrayList<String>();
    public static List<String> columna = new ArrayList<String>();
    public static cabecera cab ;
    public static lateral lat ;
    public static int contador;

    matriz(){
        cab = new cabecera();
        lat = new lateral();
    }

    public static void insertar(String f, String c, String color, int costo, int tiempo){
        //cab.contador--;
//        lat.recorrer(fila, columna, color, cab.contador);

        nodo_contenido_color agrega = new nodo_contenido_color(f, c, color, costo, tiempo);

        if(!cab.nodo_existe(c)){
            cab.insertar(new nodo_cabecera(c));
        }
        if(lat.nodo_existe(f) == false){
            lat.insertar(new nodo_lateral(f));
        }

        nodo_cabecera aux_cabecera = cab.busqueda(c);
        nodo_lateral aux_lateral = lat.busqueda(f);

        fila.add(f.trim());
        columna.add(c.trim());
        contenido.add(color+"-"+"Q"+String.valueOf(costo)+"-"+String.valueOf(tiempo)+" minutos");
        aux_cabecera.columna.insertar(agrega);
        aux_lateral.fila.insertar(agrega);
        System.out.print("\n\nse agrego el valor de: "+color);
        System.out.print("\t en le columna: "+columna+"; fila: "+fila);
        contador++;

    }
    
    
    public static void eliminar(String piloto, int costo, int tiempo){
        
        System.out.println("\n ->"+contenido.size());

        String info = (piloto+"-"+"Q"+String.valueOf(costo)+"-"+String.valueOf(tiempo)+" minutos");
        for (int i = 0; i < contenido.size(); i++) {
            if(contenido.get(i).equals(info)){
                contenido.remove(i);
                columna.remove(i);
                fila.remove(i);
                
            }
        }
        
        System.out.println("\n\t ->"+contenido.size());
    }
    
    public static void mostrar(){
        nodo_lateral filas = lateral.primero;
        nodo_cabecera columnas = cabecera.primero;
        nodo_contenido_color color = lista_para_columna.primero;
        
            File f;
            File f2;
            f = new File("matriz.txt");
            f2 = new File("destinos.txt");
            try{
                FileWriter filew = new FileWriter(f);
                BufferedWriter escibiendo = new BufferedWriter(filew);
                PrintWriter codigo = new PrintWriter(escibiendo);  
                
                FileWriter file_mapa = new FileWriter(f2);
                BufferedWriter mapa_des = new BufferedWriter(file_mapa);
                PrintWriter mapa_destinos = new PrintWriter(mapa_des);  
                
                    codigo.append("digraph G {");
                        mapa_destinos.append("graph destinos{\n");
                    codigo.append("\n node [shape=box]");
                    codigo.append("\n Mt[ label = \"Matrix\", width = 1.5, style = filled, fillcolor = firebrick1, group = 1 ];");
                    codigo.append("\n e0[ shape = point, width = 0 ];");
                    codigo.append("\n e1[ shape = point, width = 0 ];");
                    int indice = 0;
                    
    // ---------------------------COMIENZA LATERALES --------------------------------------------------------------
                    while(filas != null){
//                        String a = "U"+Integer.toString(filas.y);
//                        codigo.append(a);
                        codigo.append("U"+filas.y);
                        mapa_destinos.append("U"+ filas.y.replace(' ', '_')+"[label = \" "+filas.y + " \"]; \n");
                        codigo.append(" [label = "); 
                        codigo.append(""+filas.y);
                        codigo.append(" width = 1.5 style = filled, fillcolor = bisque1, group = 1 ];\n");
                        filas = filas.siguiente;
                        indice++;
                    }
                // IMPRIMIENDO PRIMER VUELTA DE ENLACE ENTRE LATERALES -------------------------------------
                    
                    filas = lateral.primero;
                    while(filas != null){
                        codigo.append("U"+filas.y);
                        
                        if(filas.siguiente != null){
                            codigo.append("->");
                        }
                        
                        filas = filas.siguiente;
                    }
                    
                    codigo.append("; \n");
                    
                // IMPRIMIENDO SEGUNDA VUELTA DE ENLACE ENTRE LATERALES -------------------------------------
                    filas = lateral.ultimo;
                    while(filas != null){
                        codigo.append("U"+filas.y);
                        
                        if(filas.anterior != null){
                            codigo.append("->");
                        }
                        
                        filas = filas.anterior;
                    }
                    codigo.append("; \n");
    // ---------------------------FIN DE LATERALES -----------------------------------------------------------------
    
// ***************************************************************************************************************************
// ***************************************************************************************************************************
    
    // ---------------------------COMIENZA CABECERAS ---------------------------------------------------------------
                    int indice_c = 0;
                    while(columnas != null){
//                        String z = "\nA"+Integer.toString(columnas.x);
//                        codigo.append(z);
                        codigo.append("A"+columnas.x);
                        codigo.append(" [label = ");
                        codigo.append(" "+columnas.x);
                        codigo.append(" width = 1.5 style = filled, fillcolor = lightskyblue, group = 2 ];");
                        indice_c++;
                        columnas = columnas.siguiente;
                    }
                    
                // ----------- IMPRIMIENDO PRIMER VUELTRA -----------------------------------------------------------
                
                    columnas = cabecera.primero;
                    while(columnas != null){
                        codigo.append("A"+columnas.x);
                        
                        if(columnas.siguiente != null){
                            codigo.append("->");
                        }
                        
                        columnas = columnas.siguiente;
                    }
                    codigo.append("; \n");
                
                // ----------- IMPRIMIENDO SEGUNDA VUELTRA -----------------------------------------------------------
                    columnas = cabecera.ultimo;
                    while(columnas != null){
                        codigo.append("A"+columnas.x);
                        
                        if(columnas.anterior != null){
                            codigo.append("->");
                        }
                        
                        columnas = columnas.anterior;
                    }
                    codigo.append("; \n");
    // --------------------------- FIN DE CABECERAS ---------------------------------------------------------------
// ******************************************************************************************************************
// ******************************************************************************************************************

                codigo.append("Mt->A"+cabecera.primero.x+"; Mt->U"+lateral.primero.y+";\n");
                codigo.append("A"+cabecera.primero.x+"->Mt; U"+lateral.primero.y+"->Mt;\n");

                int temp = 0;
                codigo.append("{ rank = same; Mt; ");
                columnas = cabecera.primero;
                while(columnas !=null){
//                    codigo.append("A"+Integer.toString(columnas.x)+";");
                    codigo.append("A"+columnas.x+";");
                    mapa_destinos.append("U"+columnas.x.replace(' ', '_')+"[label = \" "+columnas.x + " \"];\n");
                    columnas = columnas.siguiente;
                }
                codigo.append("} \n");
                
                
            // ----- INICIO DE NODOS ORTOGONALES ----------------------------------------------------------------------
            
                int i = 0;
                    
                while(i<indice && i<contenido.size()){
                    codigo.append("L"+i+" [label =");
                    codigo.append("  \" "+contenido.get(i).replace('-', '\n')+" \" width = 1.5, group = 2 ];\n");
                    i++;
                }
            // ----- FIN DE NODOS ORTOGONALES ----------------------------------------------------------------------
            
            // ----- INICIO DE LAS RELACIONES CON LOS NODOS ORTOGONALES --------------------------------------------------------------
            
            int contador = 0;
            
            while(contador < fila.size()){
                codigo.append("U"+fila.get(contador)+" -> L"+contador+"; \n");
                codigo.append("A"+columna.get(contador)+" -> L"+contador+"; \n");
                
                mapa_destinos.append("U"+fila.get(contador).replace(' ', '_') + " -- U"+columna.get(contador).replace(' ', '_')+"\n");
                contador++;
            }
            
            
            
            // ----- FIN DE LAS RELACIONES CON LOS NODOS ORTOGONALES --------------------------------------------------------------
                    
                    
                
                
    // +++++++++++++++++++++ FIN DE LA GRAFICA ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
                    mapa_destinos.append("\n }\n");
                    codigo.append("} \n");
                    codigo.close();
                    mapa_destinos.close();
                escibiendo.close();
                    }
            catch(IOException e){};
    }


}
