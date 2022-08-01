/*
DISEÑAR UN PROGRAMA QUE INGRESE N NUMEROS ENTEROS Y LUEGO CALCULE E IMPRIMA:
A) LA CANTIDAD DE NUMEROS PRIMOS
B) LA CANTIDAD DE CAPICUAS
C) LA CANTIDAD DE PERFECTOS
UTILICE METODOS.
 */
package SESION_12_ARCHIVOS;

import MenuFormulario.Apertura;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
public class EJERCICIO_AR1 extends javax.swing.JFrame {

    public EJERCICIO_AR1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSalir1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        atArchivo = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnEscribir = new javax.swing.JButton();
        btnLeer = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Número");

        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadir_48.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadir_48.png"))); // NOI18N
        btnIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadir_64.png"))); // NOI18N
        btnIngresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnIngresar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 59, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Archivando", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel3.setOpaque(false);

        btnSalir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar48.png"))); // NOI18N
        btnSalir1.setBorderPainted(false);
        btnSalir1.setContentAreaFilled(false);
        btnSalir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar48.png"))); // NOI18N
        btnSalir1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar64.png"))); // NOI18N
        btnSalir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        atArchivo.setColumns(20);
        atArchivo.setRows(5);
        jScrollPane2.setViewportView(atArchivo);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nombre del Archivo");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnEscribir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escribir_48.png"))); // NOI18N
        btnEscribir.setText("Escribir");
        btnEscribir.setBorderPainted(false);
        btnEscribir.setContentAreaFilled(false);
        btnEscribir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEscribir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escribir_48.png"))); // NOI18N
        btnEscribir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escribir_64.png"))); // NOI18N
        btnEscribir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscribirActionPerformed(evt);
            }
        });

        btnLeer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLeer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/leer_48.png"))); // NOI18N
        btnLeer.setText("Leer");
        btnLeer.setBorderPainted(false);
        btnLeer.setContentAreaFilled(false);
        btnLeer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLeer.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/leer_48.png"))); // NOI18N
        btnLeer.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/leer_64.png"))); // NOI18N
        btnLeer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar_48.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setBorderPainted(false);
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar_48.png"))); // NOI18N
        btnBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar_64.png"))); // NOI18N
        btnBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnEscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEscribir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLeer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, 280));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Solución", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel2.setOpaque(false);

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora_48.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setBorderPainted(false);
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcular.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora_48.png"))); // NOI18N
        btnCalcular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora64.png"))); // NOI18N
        btnCalcular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar48.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar48.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar64.png"))); // NOI18N
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        atArea.setColumns(20);
        atArea.setRows(5);
        jScrollPane1.setViewportView(atArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCalcular))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 460, -1));

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel5.setText("CALCULO DE NÚMEROS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDO.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 530, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static int pr=0,cp=0,pf=0;
    static String alfa="",beta="",gama="";
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        int num=Integer.parseInt(txtNum.getText());
        txtNum.setText("");
        alfa+=num+"   ";
        atArea.setText(alfa);
        primos(num);
        capi(num);
        perfect(num);
        txtNum.requestFocus();
    }//GEN-LAST:event_btnIngresarActionPerformed
    private static void primos(int xnum) {
        int contador = 0;
        for (int j = 1; j <= xnum; j++) {
            if (xnum % j == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            pr++;
        }
    }

    private static void capi(int xnum) {
        int aux, resto, inv = 0;
        if (xnum > 10) {
            aux = xnum;
            while (aux > 0) {
                resto = aux % 10;
                aux = aux / 10;
                inv = inv * 10 + resto;
            }
        }
        if (inv == xnum) {
            cp++;
        }
    }

    private static void perfect(int xnum) {
        int sum = 0;
        for (int k = 1; k < xnum; k++) {
            if (xnum % k == 0) {
                sum = sum + k;
            }
        }
        if (xnum == sum) {
            pf++;
        }
    }
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        beta="";
        beta+="\nLa cantidad de primos son: "+pr+"\nLa cantidad de numeros capicuas es : "+cp+
                "\nLa cantidad de numeros perfectos es: "+pf+"\n";
        gama=alfa+beta;
        atArea.setText(gama);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        pr=0;cp=0;pf=0;alfa="";beta="";
        atArea.setText("");
        txtNum.setText("");
        txtNum.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        Apertura op=new Apertura();
        op.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnEscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscribirActionPerformed
        String nombrearch=txtNombre.getText();
        File Ffichero=new File(nombrearch);
        atArchivo.setText("");
        try {  //Si no Existe el fichero lo crea
            if(!Ffichero.exists()){
                Ffichero.createNewFile();
                atArchivo.append("Se creo el archivo "+Ffichero+"\n");
            }
            atArchivo.append("Se escribió en el archivo "+Ffichero);
            BufferedWriter Fescribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Ffichero,true)));
            Fescribe.write(gama+"\n");
            Fescribe.close();
        } catch (Exception ex) {
            atArchivo.append(ex.getMessage());
        }
    }//GEN-LAST:event_btnEscribirActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        String nombrearch=txtNombre.getText();
        File Ffichero=new File(nombrearch);
        atArchivo.setText("");
        try {
            if(Ffichero.exists()){
                BufferedReader Flee= new BufferedReader(new FileReader(Ffichero));
                String Slinea;
                atArchivo.append("**********Leyendo Fichero "+Ffichero+"***********\n\n");
                while((Slinea=Flee.readLine())!=null) {
                    atArchivo.append(Slinea+"\n");
                }
                atArchivo.append("*********Fin Leer Fichero "+Ffichero+"**********\n");
                Flee.close();
            }else{
                atArchivo.append("Fichero No Existe "+Ffichero);
            }
        } catch (Exception ex) {
            atArchivo.append(ex.getMessage());
        }
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String nombrearch=txtNombre.getText();
        File Ffichero=new File(nombrearch);
        atArchivo.setText("");
        try {
            if(Ffichero.exists()){
                Ffichero.delete();
                atArchivo.append("Fichero Borrado con Exito");
            }else{
                atArchivo.append("El fichero no existe");
            }
        } catch (Exception ex) {
            atArchivo.append(ex.getMessage());
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EJERCICIO_AR1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EJERCICIO_AR1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EJERCICIO_AR1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EJERCICIO_AR1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EJERCICIO_AR1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atArchivo;
    private javax.swing.JTextArea atArea;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnEscribir;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
