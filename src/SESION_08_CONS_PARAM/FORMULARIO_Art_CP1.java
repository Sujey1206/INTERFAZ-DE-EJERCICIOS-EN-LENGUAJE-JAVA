/*
REALICE UN PROGRAMA QUE INGRESE LOS DATOS DE LOS ARTICULOS DE UN ALMACEN: 
CODIGO, DESCRIPCION. TIPO DE ARTICULO (ALFA, BETA O GAMMA), COSTO UNITARIO, 
CANTIDAD, COSTO DE MANTENIMIENTO (SOLO  PARA BETA), COSTO DE TRASLADO 
(SOLO ALFA Y BETA). SE PIDE INFORME Y AL PIE DEL REPORTE DEBERA IMPRIMIR 
EL PROMEDIO DE LOS COSTOS TOTALES POR TIPO DE ARTICULO. APLIQUE FORMULARIO
 */
package SESION_08_CONS_PARAM;

import MenuFormulario.Apertura;

public class FORMULARIO_Art_CP1 extends javax.swing.JFrame {
    float totA=0,totB=0,totG=0;
    int cantA=0,cantB=0,cantG=0;
    public FORMULARIO_Art_CP1() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbtipo = new javax.swing.JComboBox<>();
        txtdescrip = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtcostuni = new javax.swing.JTextField();
        txtcanti = new javax.swing.JTextField();
        txtcostman = new javax.swing.JTextField();
        txtcosttras = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atReporte = new javax.swing.JTextArea();
        btnlimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblpromA = new javax.swing.JLabel();
        lblpromB = new javax.swing.JLabel();
        lblpromG = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Datos del articulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setText("Código:");

        jLabel3.setText("Descripcion:");

        jLabel4.setText("Tipo de artículo: ");

        jLabel5.setText("Costo unitario:");

        jLabel6.setText("Cantidad:");

        jLabel7.setText("Costo de mantenimiento:");

        jLabel8.setText("Costo de traslado:");

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Alfa", "Beta", "Gamma" }));
        cbtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipoActionPerformed(evt);
            }
        });

        jLabel9.setText("TOTAL:");

        jLabel10.setText("S/.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                .addComponent(txtdescrip, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtcostuni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                .addComponent(txtcanti, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtcosttras, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addComponent(txtcostman)
                                .addComponent(lbltotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addGap(81, 81, 81))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcostuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcanti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcostman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcosttras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addComponent(lbltotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 56, -1, -1));

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora_48.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setBorderPainted(false);
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.setFocusTraversalPolicyProvider(true);
        btnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcular.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora_48.png"))); // NOI18N
        btnCalcular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora64.png"))); // NOI18N
        btnCalcular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Reporte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel2.setOpaque(false);

        atReporte.setColumns(20);
        atReporte.setRows(5);
        jScrollPane1.setViewportView(atReporte);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 56, 360, -1));

        btnlimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar48.png"))); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.setBorderPainted(false);
        btnlimpiar.setContentAreaFilled(false);
        btnlimpiar.setFocusTraversalPolicyProvider(true);
        btnlimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar48.png"))); // NOI18N
        btnlimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar64.png"))); // NOI18N
        btnlimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar48.png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setFocusTraversalPolicyProvider(true);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar48.png"))); // NOI18N
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar64.png"))); // NOI18N
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 110, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Promedios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel11.setText("Promedio de los articulos ALFA");

        jLabel12.setText("Promedio de los articulos BETA");

        jLabel13.setText("Promedio de los articulos GAMMA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblpromB, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(lblpromA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblpromG, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(lblpromA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(lblpromB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(lblpromG, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, 160));

        jLabel18.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel18.setText("ALMACÉN PROGRAMACIÓN");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 13, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PASTEL3 (1) (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
      String cod = "",desc = "",tipo = "";
      int cant;  
      float cu,cm = 0,ct = 0;  
      cod=txtcodigo.getText();
      desc=txtdescrip.getText();
      tipo=cbtipo.getSelectedItem().toString();
      cant=Integer.parseInt(txtcanti.getText());
      cu=Float.parseFloat(txtcostuni.getText());
      if (tipo.compareTo("Alfa")==0) {
            cm=0;
            ct=Float.parseFloat(txtcosttras.getText());
        }
        if (tipo.compareTo("Beta")==0) {
           ct=Float.parseFloat(txtcosttras.getText()); 
           cm=Float.parseFloat(txtcostman.getText());
        }
        if (tipo.compareTo("Gamma")==0) {
            ct=0;
            cm=0;
        }
      
      Articulos art=new Articulos(cod,desc,tipo,cant,cu,cm,ct);      
      lbltotal.setText(art.costo_total()+"");
      calcular(art.costo_total(),tipo,cant);
      atReporte.append(art+"\n");
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cbtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoActionPerformed
        String elemento=cbtipo.getSelectedItem().toString();
        if (elemento.compareTo("Alfa")==0) {
            txtcostman.setEnabled(false);
            txtcosttras.setEnabled(true);
        }
        if (elemento.compareTo("Beta")==0) {
            txtcostman.setEnabled(true);
            txtcosttras.setEnabled(true);
        }
        if (elemento.compareTo("Gamma")==0) {
            txtcostman.setEnabled(false);
            txtcosttras.setEnabled(false);
        }
    }//GEN-LAST:event_cbtipoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Apertura op=new Apertura();
        op.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
       txtcodigo.setText("");
       txtdescrip.setText("");
       cbtipo.setSelectedIndex(0);
       txtcanti.setText("");
       txtcostuni.setText("");
       txtcostman.setText("");
       txtcosttras.setText("");
       lbltotal.setText("");
       txtcostman.setEnabled(true);
       txtcosttras.setEnabled(true);
       txtcodigo.requestFocus();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORMULARIO_Art_CP1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atReporte;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblpromA;
    private javax.swing.JLabel lblpromB;
    private javax.swing.JLabel lblpromG;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTextField txtcanti;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcostman;
    private javax.swing.JTextField txtcosttras;
    private javax.swing.JTextField txtcostuni;
    private javax.swing.JTextField txtdescrip;
    // End of variables declaration//GEN-END:variables

    private void calcular(float costo_total, String tipo,int c) {
       if (tipo.compareTo("Alfa")==0) {
            totA+=costo_total;
            cantA+=c;
        }
        if (tipo.compareTo("Beta")==0) {
            totB+=costo_total;
            cantB+=c;
        }
        if (tipo.compareTo("Gamma")==0) {
            totG+=costo_total;
            cantG+=c;
        }   
        
        if (cantA==0) {
            lblpromA.setText("No hay stock");
        }else{
             lblpromA.setText((totA/cantA)+"");
        }
        if (cantB==0) {
            lblpromB.setText("No hay stock");
        }else{
            lblpromB.setText((totB/cantB)+"");
        }
         
        if (cantG==0) {
            lblpromG.setText("No hay stock");
        }else{
            lblpromG.setText((totG/cantG)+"");
        }
        
    }
}
