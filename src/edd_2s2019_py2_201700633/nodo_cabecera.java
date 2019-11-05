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

public class nodo_cabecera {

      String x;
      nodo_cabecera siguiente;
      nodo_cabecera anterior;
      lista_para_columna columna;

    nodo_cabecera (String col){
        this.x = col;
        columna = new lista_para_columna();
        this.siguiente = null;
        this.anterior = null;
    }
}
