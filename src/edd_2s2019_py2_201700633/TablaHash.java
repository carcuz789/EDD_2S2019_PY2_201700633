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
class NodoHash{
    String usuario;
    String contraseña;
    public NodoHash(String usuario, String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
}
public class TablaHash {
    private int tamaño;
    private static int[] tamaños;
    private int indiceTeam;
    private int ocupados;
    private float porcentajeUtil;
    private float factorUtil;
    private NodoHash [] vectorHash;
}
