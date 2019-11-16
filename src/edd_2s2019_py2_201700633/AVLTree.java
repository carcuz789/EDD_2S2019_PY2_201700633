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
import java.io.*;
import java.util.*;

public class AVLTree {
    String concatenar="";
    String con="";
    public class Nod {
        private Nod left, right, parent;
        private int height = 1;
        private int value;
        private String Nombre;
        private String Contenido;

        private Nod (int val,String Nombre,String Contenido) {
            this.value = val;
            this.Nombre = Nombre;
            this.Contenido = Contenido;
        }
    }
    public int height (Nod N) {
        if (N == null)
            return 0;
        return N.height;
    }

    public Nod insert(Nod node, int value,String Nombre,String Contenido) {
        /* 1.  Perform the normal BST rotation */
        if (node == null) {
            return(new Nod(value,Nombre,Contenido));
        }

        if (value < node.value)
            node.left  = insert(node.left, value,Nombre,Contenido);
        else
            node.right = insert(node.right, value,Nombre,Contenido);

        /* 2. Update height of this ancestor node */
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        /* 3. Get the balance factor of this ancestor node to check whether
           this node became unbalanced */
        int balance = getBalance(node);

        // If this node becomes unbalanced, then there are 4 cases

        // Left Left Case
        if (balance > 1 && value < node.left.value)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && value > node.right.value)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && value > node.left.value)
        {
            node.left =  leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && value < node.right.value)
        {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        /* return the (unchanged) node pointer */
        return node;
    }

    public Nod rightRotate(Nod y) {
        Nod x = y.left;
        Nod T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right))+1;
        x.height = Math.max(height(x.left), height(x.right))+1;

        // Return new root
        return x;
    }

    public Nod leftRotate(Nod x) {
        Nod y = x.right;
        Nod T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        //  Update heights
        x.height = Math.max(height(x.left), height(x.right))+1;
        y.height = Math.max(height(y.left), height(y.right))+1;

        // Return new root
        return y;
    }

    // Get Balance factor of node N
    public int getBalance(Nod N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    public void preOrder(Nod root) {
        if (root != null) {
            if (root.left!=null) {
              
                con+=root.Nombre.replace(".", "l")+"->"+root.left.Nombre.replace(".", "l")+";\n";
            }
            if (root.right!=null) {
                con+=root.Nombre.replace(".", "l")+"->"+root.right.Nombre.replace(".", "l")+";\n";
            }
            preOrder(root.left);
            // System.out.printf("%d ", root.value);            
            concatenar+=root.Nombre.replace(".", "l")+"[shape=record, label=\"<C0>| nombre : "+root.Nombre+"\n contenido :"+root.Contenido+"|<C1>\"];\n";
            preOrder(root.right);
        }
    }
    public void ImprimirArbolin(Nod root){
        preOrder(root);
        String conexion="";
        int estado=0;
        
          try {
            String ruta = "Avl.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("digraph g {");
            bw.write(concatenar);
            bw.write(con);
            bw.write("}");          
           
            bw.close();
            try {
    // Execute a command without arguments
                    String command = "dot -Tjpg Avl.txt -o AVL.jpg";
                     Process child = Runtime.getRuntime().exec(command);
                     child = Runtime.getRuntime().exec(command);
                } catch (Exception e) {
                }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public Nod minValueNode(Nod node) {
        Nod current = node;
        /* loop down to find the leftmost leaf */
        while (current.left != null)
            current = current.left;
        return current;
    }

    public Nod deleteNode(Nod root, int value) {
        // STEP 1: PERFORM STANDARD BST DELETE

        if (root == null)
            return root;

        // If the value to be deleted is smaller than the root's value,
        // then it lies in left subtree
        if ( value < root.value )
            root.left = deleteNode(root.left, value);

        // If the value to be deleted is greater than the root's value,
        // then it lies in right subtree
        else if( value > root.value )
            root.right = deleteNode(root.right, value);

        // if value is same as root's value, then This is the node
        // to be deleted
        else {
            // node with only one child or no child
            if( (root.left == null) || (root.right == null) ) {

                Nod temp;
                if (root.left != null)
                        temp = root.left;
                else
                    temp = root.right;

                // No child case
                if(temp == null) {
                    temp = root;
                    root = null;
                }
                else // One child case
                    root = temp; // Copy the contents of the non-empty child

                temp = null;
            }
            else {
                // node with two children: Get the inorder successor (smallest
                // in the right subtree)
                Nod temp = minValueNode(root.right);

                // Copy the inorder successor's data to this node
                root.value = temp.value;

                // Delete the inorder successor
                root.right = deleteNode(root.right, temp.value);
            }
        }

        // If the tree had only one node then return
        if (root == null)
            return root;

        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
        //  this node became unbalanced)
        int balance = getBalance(root);

        // If this node becomes unbalanced, then there are 4 cases

        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left =  leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public void print(Nod root) {

        if(root == null) {
            System.out.println("(XXXXXX)");
            return;
        }

        int height = root.height,
            width = (int)Math.pow(2, height-1);

        // Preparing variables for loop.
        List<Nod> current = new ArrayList<Nod>(1),
            next = new ArrayList<Nod>(2);
        current.add(root);

        final int maxHalfLength = 4;
        int elements = 1;

        StringBuilder sb = new StringBuilder(maxHalfLength*width);
        for(int i = 0; i < maxHalfLength*width; i++)
            sb.append(' ');
        String textBuffer;

        // Iterating through height levels.
        for(int i = 0; i < height; i++) {

            sb.setLength(maxHalfLength * ((int)Math.pow(2, height-1-i) - 1));

            // Creating spacer space indicator.
            textBuffer = sb.toString();

            // Print tree node elements
            for(Nod n : current) {

                System.out.print(textBuffer);

                if(n == null) {

                    System.out.print("        ");
                    next.add(null);
                    next.add(null);

                } else {

                    System.out.printf("(%6d)", n.value);
                    next.add(n.left);
                    next.add(n.right);

                }

                System.out.print(textBuffer);

            }

            System.out.println();
            // Print tree node extensions for next level.
            if(i < height - 1) {

                for(Nod n : current) {

                    System.out.print(textBuffer);

                    if(n == null)
                        System.out.print("        ");
                    else
                        System.out.printf("%s      %s",
                                n.left == null ? " " : "/", n.right == null ? " " : "\\");

                    System.out.print(textBuffer);

                }

                System.out.println();

            }

            // Renewing indicators for next run.
            elements *= 2;
            current = next;
            next = new ArrayList<Nod>(elements);

        }

    }

   // public static void main(String args[]) {
     //   AVLTree t = new AVLTree();
      //  Node root = null;
       // while (true) {
         //   System.out.println("(1) Insert");
           // System.out.println("(2) Delete");

            //try {
              //  BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                //String s = bufferRead.readLine();

              //  if (Integer.parseInt(s) == 1) {
                //    System.out.print("Value to be inserted: ");
                  //  root = t.insert(root, Integer.parseInt(bufferRead.readLine()));
                //}
                //else if (Integer.parseInt(s) == 2) {
                  //  System.out.print("Value to be deleted: ");
                   // root = t.deleteNode(root, Integer.parseInt(bufferRead.readLine()));
                //}
                //else {
                  //  System.out.println("Invalid choice, try again!");
                   // continue;
                //}

                //t.print(root);
            //}
            //catch(IOException e) {
              //  e.printStackTrace();
            //}
        //}
    //}
}