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

public class lista_para_columna {
   
    public static nodo_contenido_color primero;
    public static nodo_contenido_color ultimo;

    lista_para_columna(){
        this.primero = null;
        this.ultimo = null;
    }

    boolean esta_vacio(){
        if(primero == null)
            return true;
        return false;
    }


    void insertar(nodo_contenido_color nodo_ortogonal){

        if(esta_vacio()){
            this.primero = nodo_ortogonal;
            this.ultimo =  nodo_ortogonal;
        }
        else{
//            if(nodo_ortogonal.fila < this.primero.fila){
//                inserto_al_frente(nodo_ortogonal);
//            }
//            else if(nodo_ortogonal.fila > this.ultimo.fila){
                inserto_al_final(nodo_ortogonal);
//            }
//            else{
//                inserto_en_centro(nodo_ortogonal);
//            }
        }
    }


    void inserto_al_frente(nodo_contenido_color nodo_ortogonal){
        this.primero.arriba = nodo_ortogonal;
        nodo_ortogonal.abajo = primero;
        this.primero = this.primero.arriba;
    }

    void inserto_al_final(nodo_contenido_color nodo_ortogonal){
        this.ultimo.abajo = nodo_ortogonal;
        nodo_ortogonal.arriba = ultimo;
        this.ultimo = this.ultimo.abajo;
    }

//    void inserto_en_centro(nodo_contenido_color nodo_ortogonal){
//        nodo_contenido_color aux1;
//        nodo_contenido_color aux2;
//
//        aux1 = this.primero;
//
//        while(aux1.fila < nodo_ortogonal.fila){
//            aux1 = aux1.abajo;
//        }
//
//        aux2 = aux1.arriba;
//        aux2.abajo = nodo_ortogonal;
//        aux1.arriba = nodo_ortogonal;
//        nodo_ortogonal.abajo = aux1;
//        nodo_ortogonal.arriba = aux2;
//    }

}
