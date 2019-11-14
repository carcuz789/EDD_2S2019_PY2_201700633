/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_2s2019_py2_201700633;
import edd_2s2019_py2_201700633.AVLTree.*;
import edd_2s2019_py2_201700633.ListaDobEnlazada.*;
/**
 *
 * @author Rodrigo Carcuz
 */

    
public class Listas {

    
    private Listas sig;
    Listas ant;
    private Integer x;
    private Integer y;
    private String usuario;
    private String rutax;
    private String rutay; 
     private String nombredir; 
    private String tipo;
    private AVLTree arbol;
    public Listas(int x,int y,String nombredir,String Usuario,String rutax,String rutay,AVLTree arbol,String tipo) {
        this.x = x;
        this.y =y;
        this.nombredir=nombredir;
        this.usuario= Usuario;
        this.rutax = rutax;
        this.rutay=rutay;
        this.arbol=arbol;
        this.tipo = tipo;
        this.sig = null;
        this.ant = null;
       
    }

    public void InsertarFinal(Listas nodo,int x,int y,String nombredir,String Usuario,String rutax,String rutay,AVLTree arbol,String tipo) {
       int tamanio = tamaño(nodo);
       if(tamanio <= 0){
                      
            sig = new Listas(x,y,nombredir,Usuario,rutax,rutay,arbol,tipo);
            sig.ant=null;
       }else
        if (vacia(nodo)) {
            
            sig.ant =sig.sig ;
            sig = new Listas(x,y,nombredir,Usuario,rutax,rutay,arbol,tipo);

        } else {
            sig.InsertarFinal(nodo,x,y,nombredir,Usuario,rutax,rutay,arbol,tipo);
        }
    }

    public boolean vacia(Listas nodo) {
        return nodo == null && sig == null;
    }

    public String toString(Listas nodo) {
        String res = "[" + restosig(nodo) + "]";
        return res;
    }

    private String restosig(Listas nodo) {
        String res = "";
        if (!vacia(nodo)) {
            res = nodo.usuario;
            if (!sig.vacia(nodo)) {
                res = res + ", " + sig.restosig(nodo);
            }
        }
        System.out.println(ant);
        return res;
    }

    private String restoant(Listas nodo) {
        String res = "";
        if (!vacia(nodo)) {
            res = nodo.usuario;
           if (!ant.vacia(nodo)) {
                res = res + "," + sig.ant.restoant(nodo);           
        }
       
    }
        return res;
    }
    public int tamaño(Listas nodo) {
        if (vacia(nodo)) {
            return 0;
        }
        return 1 + nodo.sig.tamaño(nodo);
    }

    public Listas buscar(Listas nodo,String rutadir,String usuario) {
        if (vacia(nodo)) {
            return null;
        }
        if (nodo.nombredir.equals(rutadir)) {
            if (nodo.usuario.equals(usuario)) {
                return nodo;
                
            }
            
        }
        return nodo.sig.buscar(nodo, rutadir, usuario);
        
    }
//
//    public Object obtener(Listas nodo,String rutadir,String usuario) {
//        if (vacia(nodo)) {
//            return null;
//        }
//        if (pos == 0) {
//            return dato;
//        }
//        return sig.obtener(pos - 1);
//    }

    public void modificar(Listas nodo,String rutadir,String usuario) {
        if (vacia(nodo) ) {
            return;
        }
       if (nodo.nombredir.equals(rutadir)) {
            if (nodo.usuario.equals(usuario)) {
                nodo.nombredir=rutadir;               
                
            } 
    }else {
             Listas aux =nodo.sig;
            modificar(aux,rutadir,usuario);
        }
    }

    public Listas eliminar(Listas nodo,String rutadir,String usuario) {
        String res = null;
        if (!vacia(nodo)) {
            if (nodo.nombredir.equals(rutadir)) {
                if (nodo.usuario.equals(usuario)) {
                     res = nodo.nombredir;
                     nodo.nombredir = nodo.sig.nombredir;
                     nodo.sig = nodo.sig.sig;
                }
               
            } else {
                 nodo.sig.eliminar(nodo,rutadir,usuario);
                 
            }
        }
        return nodo;
    }
}