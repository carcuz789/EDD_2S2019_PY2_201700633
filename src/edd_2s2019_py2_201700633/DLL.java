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
public class DLL { 
    Node head; // head of list 
  
    /* Doubly Linked list Node*/
    class Node { 
        
    public Integer x;
    public Integer y;
    public String usuario;
    public String rutax;
    public String rutay; 
    public String nombredir; 
    public String tipo;
    public AVLTree arbol;
        Node prev; 
        Node next; 
  
        // Constructor to create a new node 
        // next and prev is by default initialized as null 
        Node(int x,int y,String nombredir,String Usuario,String rutax,String rutay,AVLTree arbol,String tipo){
        this.x = x;
        this.y =y;
        this.nombredir=nombredir;
        this.usuario= Usuario;
        this.rutax = rutax;
        this.rutay=rutay;
        this.arbol=arbol;
        this.tipo = tipo;
        }
    } 
  
    // Adding a node at the front of the list 
    public void push(int x,int y,String nombredir,String Usuario,String rutax,String rutay,AVLTree arbol,String tipo) 
    { 
        /* 1. allocate node  
        * 2. put in the data */
        Node new_Node = new Node(x,y,nombredir,Usuario,rutax,rutay,arbol,tipo); 
  
        /* 3. Make next of new node as head and previous as NULL */
        new_Node.next = head; 
        new_Node.prev = null; 
  
        /* 4. change prev of head node to new node */
        if (head != null) 
            head.prev = new_Node; 
  
        /* 5. move the head to point to the new node */
        head = new_Node; 
    } 
  
    /* Given a node as prev_node, insert a new node after the given node */
    public void InsertAfter(Node prev_Node, int x,int y,String nombredir,String Usuario,String rutax,String rutay,AVLTree arbol,String tipo) 
    { 
  
        /*1. check if the given prev_node is NULL */
        if (prev_Node == null) { 
            System.out.println("The given previous node cannot be NULL "); 
            return; 
        } 
  
        /* 2. allocate node  
        * 3. put in the data */
        Node new_node = new Node(x,y,nombredir,Usuario,rutax,rutay,arbol,tipo); 
  
        /* 4. Make next of new node as next of prev_node */
        new_node.next = prev_Node.next; 
  
        /* 5. Make the next of prev_node as new_node */
        prev_Node.next = new_node; 
  
        /* 6. Make prev_node as previous of new_node */
        new_node.prev = prev_Node; 
  
        /* 7. Change previous of new_node's next node */
        if (new_node.next != null) 
            new_node.next.prev = new_node; 
    } 
  
    // Add a node at the end of the list 
    void append(int x,int y,String nombredir,String Usuario,String rutax,String rutay,AVLTree arbol,String tipo) 
    { 
        /* 1. allocate node  
        * 2. put in the data */
        Node new_node = new Node(x,y,nombredir,Usuario,rutax,rutay,arbol,tipo); 
  
        Node last = head; /* used in step 5*/
  
        /* 3. This new node is going to be the last node, so 
        * make next of it as NULL*/
        new_node.next = null; 
  
        /* 4. If the Linked List is empty, then make the new 
        * node as head */
        if (head == null) { 
            new_node.prev = null; 
            head = new_node; 
            return; 
        } 
  
        /* 5. Else traverse till the last node */
        while (last.next != null) 
            last = last.next; 
  
        /* 6. Change the next of last node */
        last.next = new_node; 
  
        /* 7. Make last node as previous of new node */
        new_node.prev = last; 
    } 
  
    // This function prints contents of linked list starting from the given node 
    public void printlist(Node node) 
    { 
        Node last = null; 
        System.out.println("Traversal in forward Direction"); 
        while (node != null) { 
            System.out.print(node.nombredir + " "+node.usuario+" rutx "+node.rutax+" ruty "+node.rutax+" ->"); 
            last = node; 
            node = node.next; 
        } 
//        System.out.println(); 
//        System.out.println("Traversal in reverse direction"); 
//        while (last != null) { 
//            System.out.print(last.nombredir + " "+node.usuario+" ->"); 
//            last = last.prev; 
//        } 
    } 
    public  boolean Existe(Node node,String usuario,String nombrearch){
         Node last = null;
         int estado=0;
          while (node != null) { 
              if (node.usuario.equals(usuario)) {
                  if (node.nombredir.equals(nombrearch)) {
                      estado=1;
                  }
              }
            last = node; 
            node = node.next; 
        }
          if (estado==0) {
            return false;
        }else{
              return true;
          }
    }
    public String Contenido(Node node,String usuario,String nombrearch){
         Node last = null;
         int estado=0;
          while (node != null) { 
              if (node.usuario.equals(usuario)) {
                  if (node.nombredir.equals(nombrearch)) {
                      estado=1;
                  }
              }
            last = node; 
            node = node.next; 
        }
          if (estado==0) {
            return "false";
        }else{
              return node.tipo;
          }
    }
}
  