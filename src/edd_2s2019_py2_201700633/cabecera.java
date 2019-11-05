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
public class cabecera {
    
    public static nodo_cabecera primero;
    public static nodo_cabecera ultimo;
    public static int contador = 0;
    public static int columna_contenido;
    public static String color;

    cabecera(){
        
        this.primero = null;
        this.ultimo = null;
        
    }

    static boolean esta_vacio(){
        
        if(primero == null)
            return true;
        return false;
        
    }

    public static void insertar(nodo_cabecera nodo_ortogonal){
        if(esta_vacio()){
            primero = ultimo = nodo_ortogonal;
        }
        else{
//            if(nodo_ortogonal.x < this.primero.x){
//                inserto_al_frente(nodo_ortogonal);
//            }
//            else if(nodo_ortogonal.x > this.ultimo.x){
                inserto_al_final(nodo_ortogonal);
//            }
//            else{
//                inserto_en_centro(nodo_ortogonal);
//            }
        }
    }


    void inserto_al_frente(nodo_cabecera nodo_ortogonal){
        this.primero.anterior = nodo_ortogonal;
        nodo_ortogonal.siguiente = primero;
        this.primero = this.primero.anterior;
    }

    public static void inserto_al_final(nodo_cabecera nodo_ortogonal){
        ultimo.siguiente = nodo_ortogonal;
        nodo_ortogonal.anterior = ultimo;
        ultimo = ultimo.siguiente;
    }

//    void inserto_en_centro(nodo_cabecera nodo_ortogonal){
//        nodo_cabecera aux1;
//        nodo_cabecera aux2;
//
//        aux1 = this.primero;
//
//    //  CAMBIE COMLUMNA -> X ------------------------------------------------------------------
//        while(aux1.x < nodo_ortogonal.x){
//            aux1 = aux1.siguiente;
//        }
//
//        aux2 = aux1.anterior;
//        aux2.siguiente = nodo_ortogonal;
//        aux1.anterior = nodo_ortogonal;
//        nodo_ortogonal.siguiente = aux1;
//        nodo_ortogonal.anterior = aux2;
//    }



    boolean nodo_existe(String columna){

        if(esta_vacio()){
            System.out.println("Lista de cabecera vacia");
            return false;
        }
        else{
            nodo_cabecera aux = this.primero;

            while(aux != null){

                if(aux.x.equals(columna)){
                    return true;
                }
                else if(aux.siguiente == null){
                    System.out.println("\nNo se encontro cabecera (se creara uno) valor de: "+columna);
                    return false;
                }
                aux = aux.siguiente;
            }
        }
        return false;
    }


    nodo_cabecera busqueda(String columna){

        if(nodo_existe(columna)){
            nodo_cabecera aux = this.primero;

            while(aux.x != columna){
                aux = aux.siguiente;
            }
            return aux;
        }
        else{
            System.out.println("\nNo existe la cabecera\n");
            return (new nodo_cabecera(null));
        }
    }
}
