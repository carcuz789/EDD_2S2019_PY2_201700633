/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_2s2019_py2_201700633;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.swing.JFileChooser;
import java.io.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Rodrigo Carcuz
 */
public class ManejadorArch extends javax.swing.JFrame {
Inicio ini;
 String Ruta ="C:\\RAIZ\\";
 String NombreUs ="";
 String PathActual="";
 
 
    /**
     * Creates new form ManejadorArch
     */
    public ManejadorArch(String Usuario) {
        initComponents();
        NombreUs = Usuario;
        
        if (Usuario.equals("admin")) {
            PathActual = Ruta+"\\";
        }else{
            PathActual = Ruta+Usuario+"\\";
        }
        //path actual para crear archivos y crear carpetas
        
        if (Usuario.equals("admin")) {
            this.jFileChooser1.setCurrentDirectory(new java.io.File(Ruta));
        }else{
            this.jFileChooser1.setCurrentDirectory(new java.io.File(Ruta+Usuario));
        }
        
        if (Usuario.equals("admin")) {
            this.jb_cargausuarios.setVisible(true);
        }else{
            this.jb_cargausuarios.setVisible(false);
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
        jb_subir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jb_crearArchivo = new javax.swing.JButton();
        jb_modificarArchivos = new javax.swing.JButton();
        jb_eliminarArchivos = new javax.swing.JButton();
        jb_subirArchivo = new javax.swing.JButton();
        jb_cargausuarios = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();

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

        jb_subir.setText("Subir");
        jb_subir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_subirActionPerformed(evt);
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
                    .addComponent(jb_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_subir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_subir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jb_eliminarArchivos.setText("Eliminar");

        jb_subirArchivo.setText("Subir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_crearArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_modificarArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jb_eliminarArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_subirArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_subirArchivo)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jb_cargausuarios.setText("Carga Usuarios");
        jb_cargausuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cargausuariosActionPerformed(evt);
            }
        });

        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\RAIZ"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_cargausuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jb_cargausuarios))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
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
        String CarpetaCrear= JOptionPane.showInputDialog("INGRESE EL NOMBRE DE LA CARPETA");
          File folder = new File(this.PathActual+ CarpetaCrear);
          if (folder.exists()) {
              JOptionPane.showMessageDialog(null,"YA EXISTE ESTE DIRECTORIO");
        }else{
              folder.mkdir();
          }
        
        
    }//GEN-LAST:event_jb_crearActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        // TODO add your handling code here:
        String CarpetaMod = this.PathActual;
        String CarpModif = JOptionPane.showInputDialog("INGRESE LA CARPETA A MODIFICAR");
        String CarModif = JOptionPane.showInputDialog("INGRESE EL NUEVO NOMBRE DE LA CARPETA");
        File oldFile = new File(CarpetaMod+CarpModif);
        File newFile = new File(CarpetaMod+CarModif);
        if (oldFile.renameTo(newFile)) {
            JOptionPane.showMessageDialog(null, "CARPETA MODIFICADA EXITOSAMENTE");
        }else{
            JOptionPane.showMessageDialog(null, "ERROR EN MODIFICAR CARPETA ");
        }
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
        // TODO add your handling code here:
        String directorio = JOptionPane.showInputDialog("INGRESE LA CARPETA A ELIMINAR");
        String rutcom = this.PathActual+directorio;
        File rut = new File(rutcom);
        if (rut.delete()) {
            JOptionPane.showMessageDialog(null, "CARPETA ELIMINADA CORRECTAMENTE");
        }else{
            JOptionPane.showMessageDialog(null, "ERROR EN ELIMINAR CARPETA");
        }
    }//GEN-LAST:event_jb_eliminarActionPerformed

    private void jb_subirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_subirActionPerformed
        // TODO add your handling code here:
        String Usu = JOptionPane.showInputDialog("INGRESE EL USUARIO PARA COMPARTIR LA CARPETA");
        
    }//GEN-LAST:event_jb_subirActionPerformed

    private void jb_crearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearArchivoActionPerformed
        // TODO add your handling code here:
        String Arch = JOptionPane.showInputDialog("1.CARGA MASIVA \n 2.CARGA INDIVIDUAL");
        switch(Arch){
            case "1":
                
                break;
            case "2":
                String NombArch = JOptionPane.showInputDialog("INGRESE EL NOMBRE DE EL ARCHIVO");
                String RutaARCHi = this.PathActual + NombArch;
                try{
                    File fi = new File(RutaARCHi);
                    if (fi.exists()) {
                        JOptionPane.showMessageDialog(null,"ARCHIVO YA EXISTE ");
                    }else{
                        fi.createNewFile();
                    }
                     FileWriter fw = new FileWriter(fi);
                     String Cont = JOptionPane.showInputDialog("INGRESE EL CONTENIDO DEL ARCHIVO");
                     BufferedWriter bw = new BufferedWriter(fw);
                     bw.write(Cont);
                     bw.close();
                    
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"ERROR AL CREAR ARCHIVO ");
                }
                
                break;
        }
        
    }//GEN-LAST:event_jb_crearArchivoActionPerformed
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
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_cargausuarios;
    private javax.swing.JButton jb_crear;
    private javax.swing.JButton jb_crearArchivo;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_eliminarArchivos;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_modificarArchivos;
    private javax.swing.JButton jb_subir;
    private javax.swing.JButton jb_subirArchivo;
    // End of variables declaration//GEN-END:variables

    private void insertar(String nombre, String Contra) {
          ini.Tabla.insertar(nombre, Contra);
          File folder = new File(this.Ruta+nombre);
          if (folder.exists()) {
              JOptionPane.showMessageDialog(null,"YA EXISTE ESTE DIRECTORIO");
        }else{
              folder.mkdir();
          }
          
        }
}
