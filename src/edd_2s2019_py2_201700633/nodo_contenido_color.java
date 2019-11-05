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

public class nodo_contenido_color {

      String piloto;
      int costo;
      int tiempo;
      
      String fila, columna;
      nodo_contenido_color arriba;
      nodo_contenido_color abajo;
      nodo_contenido_color derecha;
      nodo_contenido_color izquierda;

    nodo_contenido_color (String fila, String columna, String piloto, int c, int t){
        this.piloto = piloto;
        this.costo = c;
        this.tiempo =t;
        this.columna = columna;
        this.fila = fila;
    }
}
