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

public class nodo_lateral {
    
      String y;
      nodo_lateral siguiente;
      nodo_lateral anterior;
      lista_para_fila fila;

    nodo_lateral (String f){
        
        this.y = f;
        fila = new lista_para_fila();
        this.siguiente = null;
        this.anterior = null;
        
    }

}
