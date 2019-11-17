/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_2s2019_py2_201700633;

import edd_2s2019_py2_201700633.AVLTree.Nod;
import edd_2s2019_py2_201700633.DLL.Node;
import static edd_2s2019_py2_201700633.Inicio.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.swing.JFileChooser;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.*;


/**
 *
 * @author Rodrigo Carcuz
 */
public class ManejadorArch extends javax.swing.JFrame {
Inicio ini;
private String[] vertical = new String[100];
int ver=0;
 String ArchivoActual="\\";
 String Ruta ="\\";
 String NombreUs ="";
 String Rutax="";
 String Rutay="";
 int x=0;
 int y=0;
   
    /**
     * Creates new form ManejadorArch
     */
    public ManejadorArch(String Usuario) {
        initComponents();
    
        NombreUs = Usuario;
        vertical[ver]="\\";
        ver++;
         //modelo.addRow();
        if (Usuario.equals("admin")) {
            Rutax = "\\";
            Rutay =Ruta;
        }else{
            Rutax = "\\";
            Rutay =Ruta;
        }
        //path actual para crear archivos y crear carpetas
        
        if (Usuario.equals("admin")) {
          //  this.jFileChooser1.setCurrentDirectory(new java.io.File(Ruta));
        }else{
          //  this.jFileChooser1.setCurrentDirectory(new java.io.File(Ruta+Usuario));
        }
        
        if (Usuario.equals("admin")) {
            this.jb_cargausuarios.setVisible(true);
            this.jb_reporteusuarios.setVisible(true);
        }else{
            this.jb_cargausuarios.setVisible(false);
            this.jb_reporteusuarios.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jb_crear = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jb_crearArchivo = new javax.swing.JButton();
        jb_modificarArchivos = new javax.swing.JButton();
        jb_eliminarArchivos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jb_cargausuarios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jb_compartir = new javax.swing.JButton();
        jb_reportesParalosUd = new javax.swing.JButton();
        jb_abrircarpeta = new javax.swing.JButton();
        jb_reporteusuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("USAC FILE DRIVE");

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jLabel2.setText("Carpetas");

        jb_crear.setText("Crear");
        jb_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearActionPerformed(evt);
            }
        });

        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });

        jb_eliminar.setText("Eliminar");
        jb_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jb_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_crear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_eliminar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        jLabel3.setText("Archivos");

        jb_crearArchivo.setText("Crear");
        jb_crearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearArchivoActionPerformed(evt);
            }
        });

        jb_modificarArchivos.setText("Modificar");
        jb_modificarArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarArchivosActionPerformed(evt);
            }
        });

        jb_eliminarArchivos.setText("Eliminar");

        jButton1.setText("Download");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_crearArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_modificarArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jb_eliminarArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_crearArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_modificarArchivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_eliminarArchivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jb_cargausuarios.setText("Carga Usuarios");
        jb_cargausuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cargausuariosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setBackground(new java.awt.Color(0, 82, 255));

        jb_compartir.setText("Compartir");
        jb_compartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_compartirActionPerformed(evt);
            }
        });

        jb_reportesParalosUd.setText("Reportes");
        jb_reportesParalosUd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_reportesParalosUdActionPerformed(evt);
            }
        });

        jb_abrircarpeta.setText("Abrir Carpeta");
        jb_abrircarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_abrircarpetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_compartir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_reportesParalosUd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_abrircarpeta, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_compartir)
                .addGap(18, 18, 18)
                .addComponent(jb_reportesParalosUd)
                .addGap(18, 18, 18)
                .addComponent(jb_abrircarpeta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jb_reporteusuarios.setText("Reporte Usuarios");
        jb_reporteusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_reporteusuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_cargausuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_reporteusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_cargausuarios)
                    .addComponent(jb_reporteusuarios))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cargausuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cargausuariosActionPerformed
        // TODO add your handling code here:
        String ruta="";
        JFileChooser File = new JFileChooser("C:\\Users\\Rodrigo Carcuz\\Desktop\\");
        int opcion = File.showOpenDialog(this);
        if (opcion==JFileChooser.APPROVE_OPTION) {
            String nombreArch = File.getSelectedFile().getPath();
            ruta = File.getSelectedFile().toString();
            
        }
         BufferedReader br = null;
        try {
           //Crear un objeto BufferedReader al que se le pasa 
           //   un objeto FileReader con el nombre del fichero
           br = new BufferedReader(new FileReader(ruta));
           //Leer la primera línea, guardando en un String
           String texto = br.readLine();
           //Repetir mientras no se llegue al final del fichero
           while(texto != null)
           {
               //Hacer lo que sea con la línea leída
               
                 String[] Var=texto.split(",");        
                 String Contra= getSHA256(Var[1]);
                 String nombre=Var[0];
                 
               try{
                   insertar(nombre,Contra);
               }catch(Exception e){
                 System.out.println("no insertado");
               }
               //insertar(nombre,Contra);
               //crear una carpeta con cada nombre
               
               //Leer la siguiente línea
               texto = br.readLine();
           }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null)
                    br.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jb_cargausuariosActionPerformed

    private void jb_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearActionPerformed
        // TODO add your handling code here:
         String Usu = JOptionPane.showInputDialog("INGRESE EL NOMBRE DE LA CARPETA");
         this.Rutax=Usu;
         AVLTree arbol = new AVLTree();
         Nod nodo = null;
         x++;
         y++;
         
         if (ini.ListaGen.Existe(ListaGen.head,NombreUs,Usu)== false) {
         vertical[ver]=Usu;
             ver++;
         ini.ListaGen.push(x,y,Usu,this.NombreUs,Rutax,Rutay,arbol, "C",nodo);
         DefaultTableModel  modelo=(DefaultTableModel) this.jTable1.getModel();
         modelo.addRow(new Object[]{Usu,"CARPETA"});       
        }else{
               JOptionPane.showMessageDialog(null,"!CARPETA EXISTENTE¡");
         }
      
    }//GEN-LAST:event_jb_crearActionPerformed
    public void crearGrafo(){
         Node last=null;
         Node node =ListaGen.head;
         String conexiones="";
              try {
            String ruta = "grafo.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("digraph g {");
            bw.write("rankdir=LR;");
            bw.write("node[shape=record]");
            
            //hacer nodos
            while(node!=null){
                if (node.usuario.equals(NombreUs)) {
                    if (node.tipo.equals("C")) {
                                               
                        if (!node.rutay.equals(node.rutax)) {
                            bw.write("H"+node.nombredir+"C1 [label=\""+node.nombredir+"\"];");
                            if (node.rutay.equals("\\")) {
                                conexiones+="HC1 ->"+"H"+node.nombredir+"C1 ;\n" ;
                              last = node; 
                              node = node.next;
                            }
                            else{
                                conexiones+="H"+node.rutay+"C1 ->"+"H"+node.nombredir+"C1 ;\n" ;
                              last = node; 
                              node = node.next;
                            } 
                        }else{
                            if (!node.nombredir.equals("\\")) {
                               bw.write("H"+node.nombredir+"C1 [label=\""+node.nombredir+"\"];");
                               last = node; 
                               node = node.next; 
                            }else{
                               bw.write("H"+"C1 [label=\""+"\\\\"+"\"];");
                               last = node; 
                               node = node.next; 
                            }
                            
                        }
                    }else{
                        last = node; 
                        node = node.next; 
                    }
                }else{
                     last = node; 
                     node = node.next; 
                }
            }
            //conectar los nodos 
            bw.write(conexiones);
            bw.write("}");          
           
            bw.close();
            try {
    // Execute a command without arguments
                    String command = "dot -Tjpg grafo.txt -o grafon.jpg";
                     Process child = Runtime.getRuntime().exec(command);
                     child = Runtime.getRuntime().exec(command);
                } catch (Exception e) {
                }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
    
    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        // TODO add your handling code here:
         String Arch = JOptionPane.showInputDialog("INGRESE LA CARPETA A MODIFICAR");
         String NEWArch = JOptionPane.showInputDialog("INGRESE EL NUEVO NOMBRE DE LA CARPETA");
         ini.ListaGen.modificarCAR(ListaGen.head, NombreUs, Arch, NEWArch);
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jb_eliminarActionPerformed

    private void jb_crearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearArchivoActionPerformed
        // TODO add your handling code here:
        String Arch = JOptionPane.showInputDialog("1.CARGA MASIVA \n 2.CARGA INDIVIDUAL");
        switch(Arch){
            case "1":
                    String ruta="";
        JFileChooser File = new JFileChooser("C:\\Users\\Rodrigo Carcuz\\Desktop\\");
        int opcion = File.showOpenDialog(this);
        if (opcion==JFileChooser.APPROVE_OPTION) {
            String nombreArch = File.getSelectedFile().getPath();
            ruta = File.getSelectedFile().toString();
            
        }
         BufferedReader br = null;
        try {
           //Crear un objeto BufferedReader al que se le pasa 
           //   un objeto FileReader con el nombre del fichero
           br = new BufferedReader(new FileReader(ruta));
           //Leer la primera línea, guardando en un String
           String texto = br.readLine();
           //Repetir mientras no se llegue al final del fichero
           while(texto != null)
           {
               //Hacer lo que sea con la línea leída
               
                 String[] Var=texto.split(",");        
                 String contenido= Var[1];
                 String nombre=Var[0].trim();
              
                 if (ini.ListaGen.Existe(ListaGen.head,NombreUs,nombre)== false) {
                    //buscar el arbol e ingressar
                        
                        if (ini.ListaGen.RetornaNodo(ListaGen.head, NombreUs, ArchivoActual)!=null) {
                              Node nodo =ini.ListaGen.RetornaNodo(ListaGen.head, NombreUs, ArchivoActual);                             
                              int valor = GenerarClave(nombre);
                              nodo.Nodoarbol=nodo.arbol.insert(nodo.Nodoarbol, valor, nombre, contenido);
                        }else{
                            JOptionPane.showMessageDialog(null,"ARBLO AVL NO ENCONTRADO" );
                    }
                 ini.ListaGen.push(x,y,nombre,this.NombreUs,Rutay,Rutay,null, contenido,null);
                  DefaultTableModel  modelo=(DefaultTableModel) this.jTable1.getModel();
                 modelo.addRow(new Object[]{nombre,"ARCHIVO"});
                }else{                        
                      JOptionPane.showMessageDialog(null,"!ARCHIVO EXISTENTE¡");
                    }
              
               texto = br.readLine();
           }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null)
                    br.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
                break;
            case "2":
                 String NombreArch = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL ARCHIVO A CREAR");
                 String CONTENIDO = JOptionPane.showInputDialog("INGRESE EL CONTENIDO");    
                 //Rutax=NombreArch;
                if (ini.ListaGen.Existe(ListaGen.head,NombreUs,NombreArch)== false) {
                    //buscar el arbol e ingressar
                      
                        if (ini.ListaGen.RetornaNodo(ListaGen.head, NombreUs, ArchivoActual)!=null) {
                              Node nodo =ini.ListaGen.RetornaNodo(ListaGen.head, NombreUs, ArchivoActual);                             
                              int valor = GenerarClave(NombreArch);
                              nodo.Nodoarbol=nodo.arbol.insert(nodo.Nodoarbol, valor, NombreArch, CONTENIDO);
                        }else{
                            JOptionPane.showMessageDialog(null,"ARBLO AVL NO ENCONTRADO" );
                    }
                 ini.ListaGen.push(x,y,NombreArch,this.NombreUs,Rutay,Rutay,null, CONTENIDO,null);
                  DefaultTableModel  modelo=(DefaultTableModel) this.jTable1.getModel();
                 modelo.addRow(new Object[]{NombreArch,"ARCHIVO"});
                }else{                        
                      JOptionPane.showMessageDialog(null,"!ARCHIVO EXISTENTE¡");
                    }
                break;
        }        
    }//GEN-LAST:event_jb_crearArchivoActionPerformed

    private void jb_reportesParalosUdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_reportesParalosUdActionPerformed
        // TODO add your handling code here:
        ini.ListaGen.printlist(ListaGen.head);   
        crearGrafo();
        ARBOLIN();
        Ortogonal();
    }//GEN-LAST:event_jb_reportesParalosUdActionPerformed

    private void jb_abrircarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_abrircarpetaActionPerformed
        // TODO add your handling code here
        //editar ruta x y ruta y
         String NombreArch = JOptionPane.showInputDialog("INGRESE LA CARPETA A IR");
         Rutay=NombreArch;
         ArchivoActual=NombreArch;
          DefaultTableModel  modelo=(DefaultTableModel) this.jTable1.getModel();
         modelo.setRowCount(0);
         Node last=null;
         Node node =ListaGen.head;
         while(node!=null){
             if (node.usuario.equals(NombreUs)) {
                 if (node.rutay.equals(NombreArch)) {
                     
                     if (!"C".equals(node.tipo)) {
                         if (node.nombredir.equals("\\")) {
                             last = node; 
                        node = node.next; 
                         }else{
                              modelo.addRow(new Object[]{node.nombredir,"ARCHIVO"});
                              last = node; 
                              node = node.next; 
                         }                       
                     }else{
                          modelo.addRow(new Object[]{node.nombredir,"CARPETA"});
                          last = node; 
                          node = node.next; 
                     }
   
             }else{
                     last = node; 
                     node = node.next; 
                 }
             }else{
                 last = node; 
                 node = node.next; 
             }
             
         }
        
    }//GEN-LAST:event_jb_abrircarpetaActionPerformed
    public void ARBOLIN(){
        if (ini.ListaGen.RetornaNodo(ListaGen.head, NombreUs, ArchivoActual)!=null) {
            Node aux = ini.ListaGen.RetornaNodo(ListaGen.head, NombreUs, ArchivoActual);
            AVLTree arb = aux.arbol;
            Nod nodo=aux.Nodoarbol;
            arb.ImprimirArbolin(nodo);
        }else{
              JOptionPane.showMessageDialog(null,"ARBLO AVL NO ENCONTRADO" );
        }
        
    }
    public void Ortogonal(){
         try {
            String ruta = "ortogonal.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("digraph g {");
            bw.write("rankdir=LR;");
            bw.write("node[shape=record]");
            
            bw.write("subgraph cluster1 {");
            bw.write("  rank=same;");
            int i=0;
            bw.write("NC[label=\"(*)\"];");
            //escribir los nodos para despues conectarlos a x and y
            
           
            String conc="NC->";
             do {
                 if (!vertical[i].equals("\\")) {
                    bw.write("y"+vertical[i]+"[label=\""+vertical[i]+"\"];");
                 }else{
                     bw.write("y"+"[label=\""+vertical[i]+vertical[i]+"\"];");
                 }               
             
                 if (vertical[i+1]!=null) {
                     if (!vertical[i].equals("\\")) {
                     conc+="y"+vertical[i]+"->";
                 }else{
                     conc+="y"+"->";
                 } 
                     
                 }else{
                     conc+="y"+vertical[i]; 
                 }
                     i++;
             } while (vertical[i]!=null);
             conc+="[constraint=false];";
            bw.write(conc);
            bw.write("}");  
            String conc2="NC->";
                i=0;
             do {
                 if (!vertical[i].equals("\\")) {
                    bw.write("x"+vertical[i]+"[label=\""+vertical[i]+"\"];");
                 }else{
                     bw.write("x"+"[label=\""+vertical[i]+vertical[i]+"\"];");
                 }               
             
                 if (vertical[i+1]!=null) {
                     if (!vertical[i].equals("\\")) {
                     conc2+="x"+vertical[i]+"->";
                 }else{
                     conc2+="x"+"->";
                 } 
                     
                 }else{
                     conc2+="x"+vertical[i]; 
                 }
                     i++;
             } while (vertical[i]!=null);
             conc2+=";";  
             String nodos= ini.ListaGen.RetornarNodos(ListaGen.head,NombreUs);   
             bw.write(nodos);
             bw.write(conc2);
             int k=0;
             do {
                 String conexiones =ini.ListaGen.RetornarConexionNodoscony(ListaGen.head,NombreUs,vertical[k]);
                 if (conexiones!="false") {
                      bw.write(conexiones.substring(0, conexiones.length()-2)+";");
                 }              
                 
                 k++;
                 
             } while (vertical[k]!=null);

             //bw.write(conexiones);
            bw.write("}");  
            bw.close();
            try {
    // Execute a command without arguments
                    String command = "dot -Tjpg ortogonal.txt -o ortogonal.jpg";
                     Process child = Runtime.getRuntime().exec(command);
                     child = Runtime.getRuntime().exec(command);
                } catch (Exception e) {
                }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void jb_reporteusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_reporteusuariosActionPerformed
        // TODO add your handling code here:
         ini.Tabla.Imprimir();
         try {
    // Execute a command without arguments
                    String command = "C:\\Users\\Rodrigo Carcuz\\Desktop\\EDD_2S2019_PY2_201700633\\HashTable.jpg";
                     Runtime.getRuntime().exec(command);
                     
                } catch (Exception e) {
                     JOptionPane.showMessageDialog(null,"NO SE ENCONTRO LA IMAGEN" );
                }
    }//GEN-LAST:event_jb_reporteusuariosActionPerformed

    private void jb_compartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_compartirActionPerformed
        // TODO add your handling code here:
         String us = JOptionPane.showInputDialog("INGRESE EL USUARIO A COMPARTIR");
         String arch=JOptionPane.showInputDialog("INGRESE EL NOMBRE ARCHIVO A COMPARTIR");
         String contenido =ini.ListaGen.Contenido(ListaGen.head,NombreUs,arch);
         if (ini.ListaGen.Existe(ListaGen.head,NombreUs,arch)== true) {
              ListaGen.push(x,y,arch,us,"\\","\\",null,contenido,null);
        }else{
               JOptionPane.showMessageDialog(null,"ARCHIVO NO EXISTE" );
         }
        
    }//GEN-LAST:event_jb_compartirActionPerformed

    private void jb_modificarArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarArchivosActionPerformed
        // TODO add your handling code here:
        String Arch = JOptionPane.showInputDialog("INGRESE EL ARCHIVO A MODIFICAR");
         String NEWArch = JOptionPane.showInputDialog("INGRESE EL NUEVO NOMBRE DEL ARCHIVO");
         ini.ListaGen.modificarCAR(ListaGen.head, NombreUs, Arch, NEWArch);
    }//GEN-LAST:event_jb_modificarArchivosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String DES = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL ARCHIVO A DESCARGAR");
    try {
        ini.ListaGen.descargar(ListaGen.head, NombreUs, DES);
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null,"ARCHIVO NO ENCONTRADO");
    }
    }//GEN-LAST:event_jButton1ActionPerformed
 public static String getSHA256(String input){

	String toReturn = null;
	try {
	    MessageDigest digest = MessageDigest.getInstance("SHA-256");
	    digest.reset();
	    digest.update(input.getBytes("utf8"));
	    toReturn = String.format("%064x", new BigInteger(1, digest.digest()));
	} catch (Exception e) {
	    e.printStackTrace();
	}
	
	return toReturn;
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_abrircarpeta;
    private javax.swing.JButton jb_cargausuarios;
    private javax.swing.JButton jb_compartir;
    private javax.swing.JButton jb_crear;
    private javax.swing.JButton jb_crearArchivo;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_eliminarArchivos;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_modificarArchivos;
    private javax.swing.JButton jb_reportesParalosUd;
    private javax.swing.JButton jb_reporteusuarios;
    // End of variables declaration//GEN-END:variables

    private void insertar(String nombre, String Contra) {
          ini.Tabla.insertar(nombre, Contra);
          AVLTree arbol = new AVLTree();
          Nod nodo=null;
          ini.ListaGen.append(0,0,"\\",nombre,"\\","\\",arbol,"C",nodo);        
          
        }
     private int GenerarClave(String id){
        String codigo = "";
        int tmp =0;
        for (int i = 0; i < id.length(); i++) {
            codigo += id.codePointAt(i);
        }
        if(codigo.length()>9){
            return reduccion(codigo);
        } else{
            return Integer.parseInt(codigo);
        }
    }
    private int reduccion(String codigo){
        int tmp=0;
        while(codigo.length()>9){
            String aux="";
            for (int i = 0; i < codigo.length()/2; i++) {
                aux += codigo.charAt(i);
            }
            if (aux.length()>9) {
                tmp=reduccion(aux);
                aux="";
            }else{
                tmp = Integer.parseInt(aux);
                aux="";
            }
            for (int i = codigo.length()/2; i < codigo.length(); i++) {
                aux += codigo.charAt(i);
            }
            if (aux.length()>9) {
                tmp = reduccion(aux);
                aux ="";
            }else{
                tmp= Integer.parseInt(aux);
                aux= "";
            }
            codigo=tmp+"";
        }
        return tmp;
    }
}
