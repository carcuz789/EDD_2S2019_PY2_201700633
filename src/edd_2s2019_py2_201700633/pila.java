/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_2s2019_py2_201700633;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Rodrigo Carcuz
 */
public class pila { 
  
    StackNode root; 
  
    static class StackNode { 
        
        String operacion;
        String tipo;
        String fecha;
        String hora;
        String Usuario;
        StackNode next; 
  
        StackNode(String operacion,String tipo,String fecha,String hora,String usuario) 
        { 
            this.Usuario = usuario;
            this.fecha = fecha;
            this.tipo=tipo;
            this.operacion=operacion;
            this.hora=hora;
            
        } 
    } 
  
    public boolean isEmpty() 
    { 
        if (root == null) { 
            return true; 
        } 
        else
            return false; 
    } 
  
    public void push(String operacion,String tipo,String fecha,String hora,String usuario) 
    { 
        StackNode newNode = new StackNode(operacion,tipo,fecha,hora,usuario); 
  
        if (root == null) { 
            root = newNode; 
        } 
        else { 
            StackNode temp = root; 
            root = newNode; 
            newNode.next = temp; 
        } 
       // System.out.println(data + " pushed to stack"); 
    } 
  
//    public int pop() 
//    { 
//        int popped = Integer.MIN_VALUE; 
//        if (root == null) { 
//            System.out.println("Stack is Empty"); 
//        } 
//        else { 
//            popped = root.data; 
//            root = root.next; 
//        } 
//        return popped; 
//    } 
  
//    public int peek() 
//    { 
//        if (root == null) { 
//            System.out.println("Stack is empty"); 
//            return Integer.MIN_VALUE; 
//        } 
//        else { 
//            return root.data; 
//        } 
//    } 
  public void imprimirpila(){
      try {
            String ruta = "pila.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("digraph g {");
            bw.write("node[shape=record]");
            String conexiones="";
            StackNode temp = root; 
                    while(temp!=null) {
                                   
                       temp=temp.next;
                    }
            bw.write(conexiones);
            bw.write("}");          
           
            bw.close();
            try {
    // Execute a command without arguments
                    String command = "dot -Tjpg pila.txt -o BitacoraPila.jpg";
                     Process child = Runtime.getRuntime().exec(command);
                     child = Runtime.getRuntime().exec(command);
                } catch (Exception e) {
                }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
  }
} 