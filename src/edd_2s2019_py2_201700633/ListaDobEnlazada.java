/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_2s2019_py2_201700633;
public class ListaDobEnlazada {

    
    private ListaDobEnlazada sig;
    private ListaDobEnlazada ant;
   
    private String nombre;
    private String contenido;
    public ListaDobEnlazada(String nombre,String contenido) {
        this.nombre=nombre;
        this.contenido=contenido;
        this.sig = null;
        this.ant = null;
       
    }

    public void InsertarFinal(ListaDobEnlazada nodo,String nombre,String contenido) {
       int tamanio=tamaño(nodo);
       if(tamanio<=0){
                      
            sig = new ListaDobEnlazada(nombre,contenido);
            sig.ant=null;
       }else
        if (vacia(nodo)) {
            
            sig.ant =sig.sig ;
            sig = new ListaDobEnlazada(nombre,contenido);
        } else {
            sig.InsertarFinal(nodo,nombre,contenido);
        }
    }

    public boolean vacia(ListaDobEnlazada nodo) {
        return nodo == null && sig == null;
    }

    public String toString(ListaDobEnlazada nodo) {
        String res = "[" + restosig(nodo) + "]";
        return res;
    }

    private String restosig(ListaDobEnlazada nodo) {
        String res = "";
        if (!vacia(nodo)) {
            res = nodo.nombre;
            if (!sig.vacia(nodo)) {
                res = res + ", " + sig.restosig(nodo);
            }
        }
        System.out.println(ant);
        return res;
    }

    private String restoant(ListaDobEnlazada nodo) {
        String res = "";
        if (!vacia(nodo)) {
            res = nodo.nombre;
           if (!ant.vacia(nodo)) {
                res = res + "," + sig.ant.restoant(nodo);
           
        }
       
    }
        return res;
    }
    public int tamaño(ListaDobEnlazada nodo) {
        if (vacia(nodo)) {
            return 0;
        }
        return 1 + nodo.sig.tamaño(nodo);
    }

    public ListaDobEnlazada  buscar(ListaDobEnlazada nodo,String nombre,String contenido) {
        if (vacia(nodo)) {
            return null;
        }
        if (nodo.nombre.equals(nombre)) {
           return nodo;
            
        }
        return nodo.sig.buscar(nodo, nombre, contenido);
        
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

    public void modificar(ListaDobEnlazada nodo ,String nombre,String contenido) {
        if (vacia(nodo) ) {
            return;
        }
       if (nodo.nombre.equals(nombre)) {
            nodo.nombre=nombre;
            nodo.contenido=contenido;
        }else {
             ListaDobEnlazada aux =nodo.sig;
            modificar(aux,nombre,contenido);
    }
    }

    public ListaDobEnlazada eliminar(ListaDobEnlazada nodo ,String nombre,String contenido) {
        String res = null;
        if (!vacia(nodo)) {
            if (nodo.nombre.equals(nombre)) {
                if (nodo.contenido.equals(contenido)) {
                     res = nodo.nombre;
                     nodo.nombre = nodo.sig.nombre;
                     nodo.sig = nodo.sig.sig;
                }
               
            } else {
                 nodo.sig.eliminar(nodo,nombre,contenido);
                 
            }
        }
        return nodo;
    }
}