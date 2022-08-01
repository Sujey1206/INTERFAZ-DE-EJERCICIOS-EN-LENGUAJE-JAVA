package SESION_12_ARCHIVOS;

import MenuFormulario.Apertura;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

/*
REALIZAR EL PROGRAMA QUE INGRESE ALEATORIAMENTE LA BASE Y LA ALTURA DE UN 
TRIANGULO Y LUEGO CALCULE EL AREA CORRESPONDIENTE. 
 */

public class EJERCICIO_AR3 extends javax.swing.JFrame {

    public EJERCICIO_AR3() {
        initComponents();
        setLocationRelativeTo(null);
    }
     String beta="";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        btnAleatorios = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atAreaArchivo = new javax.swing.JTextArea();
        cbnArchivos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtArchivo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA DEL TRIANGULO");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Datos del triángulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Base del triángulo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Altura del triángulo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAltura)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 59, -1, -1));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

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
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Área del triángulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Área del triángulo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar48.png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar48.png"))); // NOI18N
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar64.png"))); // NOI18N
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 130, 90));

        btnAleatorios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAleatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aleatorio48.png"))); // NOI18N
        btnAleatorios.setText("Aleatorios");
        btnAleatorios.setBorderPainted(false);
        btnAleatorios.setContentAreaFilled(false);
        btnAleatorios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAleatorios.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aleatorio48.png"))); // NOI18N
        btnAleatorios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aleatorio_64.png"))); // NOI18N
        btnAleatorios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAleatoriosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAleatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Archivos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel3.setOpaque(false);

        atAreaArchivo.setColumns(20);
        atAreaArchivo.setRows(5);
        jScrollPane1.setViewportView(atAreaArchivo);

        cbnArchivos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbnArchivos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar su opcion", "Escribir un fichero", "Leer fichero", "Eliminar fichero" }));
        cbnArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnArchivosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Escribir el nombre del archivo: ");

        txtArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbnArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(cbnArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 59, 350, -1));

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel5.setText("ÁREA DEL TRIÁNGULO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 11, 274, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDO.jpeg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 750, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
      DecimalFormat ob= new DecimalFormat("##.#");
      float a,b,h;
      h=Integer.parseInt(txtAltura.getText());
      b=Integer.parseInt(txtBase.getText());
      a=(b*h)/2;
      txtArea.setText(ob.format(a));  
      beta+="Del triangulo con base "+b+" y altura "+h+"\nSu area es "+a+"\n";
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAleatoriosActionPerformed
      DecimalFormat ob= new DecimalFormat("##.#");
      float a,b,h;
      h=(float)(Math.random()*1000+1);
      b=(float)(Math.random()*1000+1);
      a=(b*h)/2;
      txtBase.setText(ob.format(b));
      txtAltura.setText(ob.format(h));
      txtArea.setText(ob.format(a));    
      beta+="Del triangulo con base "+b+" y altura "+h+"\nSu area es "+a+"\n";
    }//GEN-LAST:event_btnAleatoriosActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtBase.setText("");
        txtAltura.setText(" ");
        txtArea.setText("");
        cbnArchivos.setSelectedIndex(0);
        txtArchivo.setEnabled(true);
        txtArchivo.setText("");
        atAreaArchivo.setText("");
        txtBase.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Apertura op=new Apertura();
        op.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArchivoActionPerformed
      
    }//GEN-LAST:event_txtArchivoActionPerformed

    private void cbnArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnArchivosActionPerformed
        String decision=cbnArchivos.getSelectedItem().toString();
        String nombrearch;
        nombrearch = txtArchivo.getText();
        File Ffichero = new File(nombrearch);
        
        if (decision.compareTo("Escribir un fichero") == 0) {
            
            try {
                if (!Ffichero.exists()) {
                    Ffichero.createNewFile();
                }
                atAreaArchivo.append("Se creo el archivo "+ Ffichero+" \n");
                BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Ffichero, true)));
                
                Fescribe.write(beta + "\n");
                Fescribe.close();
            } catch (Exception ex) {
                atAreaArchivo.append(ex.getMessage());
            }
            txtArchivo.setEnabled(false);
        }
        if (decision.compareTo("Leer fichero")==0) {
              txtArchivo.setEnabled(false);
              atAreaArchivo.setText("");
             try {
                if (Ffichero.exists()) {

                    BufferedReader Flee = new BufferedReader(new FileReader(Ffichero));
                    String Slinea;
                    atAreaArchivo.append("\n********Leyendo Fichero " + Ffichero + "*********\n\n");

                    while ((Slinea = Flee.readLine()) != null) {

                        atAreaArchivo.append(Slinea+"\n");
                    }
                    atAreaArchivo.append("*******Fin Leer Fichero " + Ffichero + "**********\n");

                    Flee.close();
                } else {
                    atAreaArchivo.append("Fichero No Existe " + Ffichero);
                }
            } catch (Exception ex) {
               atAreaArchivo.append(ex.getMessage());
            }
        }
        if (decision.compareTo("Eliminar fichero")==0) {
              txtArchivo.setEnabled(false);
              atAreaArchivo.setText("");
            try {
                if (Ffichero.exists()) {

                    Ffichero.delete();
                    atAreaArchivo.append("Fichero Borrado con Exito");
                }
            } catch (Exception ex) {

                atAreaArchivo.append(ex.getMessage());
            }
        }               
    }//GEN-LAST:event_cbnArchivosActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new EJERCICIO_AR3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atAreaArchivo;
    private javax.swing.JButton btnAleatorios;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbnArchivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtArchivo;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBase;
    // End of variables declaration//GEN-END:variables
}
