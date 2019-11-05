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

/**
 *
 * @author Usuario
 */
public class lateral {

    public static nodo_lateral primero;
    public static nodo_lateral ultimo;

    lateral(){
        this.primero = null;
        this.ultimo = null;
    }

    public static boolean esta_vacio(){
        if(primero == null)
            return true;
        return false;
    }



     void recorrer(int fila, int columna, String color, int columnas){


     /*
            ofstream m;
            m.open("matriz.txt",ios::app);

                    m<<"\n<TR> ";
                    m<<"\n<TD>"<<fila<<"</TD>";


                for(int i=1; i<columna; i++){
                        m<<"\n<TD BGCOLOR=\"white\"></TD>";
                }

                m<<"\n<TD BGCOLOR=\""<< color <<"\" ></TD>";


                    m<<"\n</TR> ";
            m.close();

        */
    }




    public static void insertar(nodo_lateral nodo_ortogonal){
        if(esta_vacio()){
            primero = ultimo = nodo_ortogonal;
        }
        else{
//            if(nodo_ortogonal.y < this.primero.y){
//                inserto_al_frente(nodo_ortogonal);
//            }
//            else if(nodo_ortogonal.y > this.ultimo.y){
                inserto_al_final(nodo_ortogonal);
//            }
//            else{
//                inserto_en_centro(nodo_ortogonal);
//            }
        }

    }


    void inserto_al_frente(nodo_lateral nodo_ortogonal){
        this.primero.anterior = nodo_ortogonal;
        nodo_ortogonal.siguiente = primero;
        this.primero = this.primero.anterior;
    }

    public static void inserto_al_final(nodo_lateral nodo_ortogonal){
        ultimo.siguiente = nodo_ortogonal;
        nodo_ortogonal.anterior = ultimo;
        ultimo = ultimo.siguiente;
    }

//    void inserto_en_centro(nodo_lateral nodo_ortogonal){
//        nodo_lateral aux1;
//        nodo_lateral aux2;
//
//        aux1 = this.primero;
//
//    //  CAMBIE FILA -> Y ------------------------------------------------------------------
//        while(aux1.y < nodo_ortogonal.y){
//            aux1 = aux1.siguiente;
//        }
//
//        aux2 = aux1.anterior;
//        aux2.siguiente = nodo_ortogonal;
//        aux1.anterior = nodo_ortogonal;
//        nodo_ortogonal.siguiente = aux1;
//        nodo_ortogonal.anterior = aux2;
//    }



    boolean nodo_existe(String fila){

        if(esta_vacio()){
            System.out.println("Lista de laterales vacia");
            return false;
        }
        else{
            nodo_lateral aux = this.primero;

            while(aux != null){

                if(aux.y.equals(fila)){
                    return true;
                }
                else if(aux.siguiente == null){
                    System.out.println("\nNo se encontro lateral (se creara uno) valor de: "+fila);
                    return false;
                }
            
                aux = aux.siguiente;
            }
        }
        return false;
        }
    


    nodo_lateral busqueda(String fila){

        if(nodo_existe(fila)){
            nodo_lateral aux = this.primero;

            while(aux.y != fila){
                aux = aux.siguiente;
            }
            return aux;
        }
        else{
            System.out.println("\nNo existe la cabecera\n");
            return (new nodo_lateral(null));
        }
    }
}

