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
public class lista_para_fila {
    
    public static nodo_contenido_color primero;
    public static nodo_contenido_color ultimo;

    lista_para_fila(){
        this.primero = null;
        this.ultimo = null;
    }

    public static boolean esta_vacio(){
        if(primero == null)
            return true;
        return false;
    }



    void insertar(nodo_contenido_color nodo_ortogonal){
        
//        char [] columna = nodo_ortogonal.columna.trim().toCharArray();
//        char [] palabra_nueva = this.primero.columna.trim().toCharArray();
//        
//        int i=0;
//        while(columna[i] == palabra_nueva[i] ){
//            i++;
//        }
        
//        int dos = (int) columna[i];
//        int uno = (int) palabra_nueva[i];
//            System.out.println("\n ========> "+dos +" -- "+uno);
        if(esta_vacio()){
            this.primero = this.ultimo = nodo_ortogonal;
        }
        else{
//            if(dos < uno){
//                inserto_al_frente(nodo_ortogonal);
//            }
//            else if(dos> uno){
                inserto_al_final(nodo_ortogonal);
//            }
//            else{
//                inserto_en_centro(nodo_ortogonal);
//            }
        }
    }


    void inserto_al_frente(nodo_contenido_color nodo_ortogonal){
        this.primero.izquierda = nodo_ortogonal;
        nodo_ortogonal.derecha = primero;
        this.primero = this.primero.izquierda;
    }

    void inserto_al_final(nodo_contenido_color nodo_ortogonal){
        this.ultimo.derecha = nodo_ortogonal;
        nodo_ortogonal.izquierda = ultimo;
        this.ultimo = this.ultimo.derecha;
    }

//    void inserto_en_centro(nodo_contenido_color nodo_ortogonal){
//        nodo_contenido_color aux1;
//        nodo_contenido_color aux2;
//
//        aux1 = this.primero;
//
//        while(aux1.columna < nodo_ortogonal.columna){
//            aux1 = aux1.derecha;
//        }
//
//        aux2 = aux1.izquierda;
//        aux2.derecha = nodo_ortogonal;
//        aux1.izquierda = nodo_ortogonal;
//        nodo_ortogonal.derecha = aux1;
//        nodo_ortogonal.izquierda = aux2;
//    }
}
