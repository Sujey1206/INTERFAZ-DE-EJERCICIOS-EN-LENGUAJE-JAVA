/*
REALIZAR EL PROGRAMA QUE INGRESE ALEATORIAMENTE LOS DATOS DE TRES PRODUCTOS QUE
UN CLIENTE HA ADQUIRIDO EN UNA BODEGA (PRECIO Y CANTIDAD). SE PIDE CALCULAR E
IMPRIMIR EL IMPORTE A PAGAR POR EL CLIENTE ASI COMO EL VUELTO QUE HA DE RECIBIR.
NO APLIQUE ESTRUCTURAS DE CONTROL
 */
package SESION_01_SCANNER;

import MenuFormulario.Apertura;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
public class ACTIVIDAD_03 extends javax.swing.JFrame {
    DefaultComboBoxModel modelo=new DefaultComboBoxModel();
    public ACTIVIDAD_03() {
        
        initComponents();
        setLocationRelativeTo(null);
        txtcant1.setEnabled(false);
        txtcant2.setEnabled(false);
        txtcant3.setEnabled(false);
        txtingreso.setEnabled(false);
    }
    int band=0,band1=0,band2=0;
    String cadena="";
     float total;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtprecio1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbcant1 = new javax.swing.JComboBox<>();
        txtcant1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbltot1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtprecio2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbcant2 = new javax.swing.JComboBox<>();
        txtcant2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lbltot2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtprecio3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbcant3 = new javax.swing.JComboBox<>();
        txtcant3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbltot3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atImporte = new javax.swing.JTextArea();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtingreso = new javax.swing.JTextField();
        lblvuelto = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnVuelto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText("BODEGA DE PROGRAMACIÓN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Datos del Producto 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 18))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setText("Precio ");

        jLabel5.setText("Cantidad");

        cbcant1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar la cantidad", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Otra cantidad" }));
        cbcant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcant1ActionPerformed(evt);
            }
        });

        txtcant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcant1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Total:");

        jLabel15.setText("S/.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtprecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbcant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtcant1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltot1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtprecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cbcant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel15))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 61, 710, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Datos del Producto 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 18))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel3.setText("Precio");

        jLabel6.setText("Cantidad");

        cbcant2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar la cantidad", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Otra cantidad" }));
        cbcant2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcant2ActionPerformed(evt);
            }
        });

        txtcant2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcant2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Total:");

        jLabel16.setText("S/.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtprecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbcant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtcant2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltot2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(cbcant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel16))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbltot2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 147, 710, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Datos del Producto 3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 18))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel4.setText("Precio");

        jLabel7.setText("Cantidad");

        cbcant3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar la cantidad", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Otra cantidad" }));
        cbcant3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcant3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Total:");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel17.setText("S/.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtprecio3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbcant3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtcant3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltot3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltot3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtprecio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(cbcant3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcant3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel17))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 238, 710, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Importe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 18))); // NOI18N
        jPanel4.setOpaque(false);

        atImporte.setColumns(20);
        atImporte.setRows(5);
        jScrollPane1.setViewportView(atImporte);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 350, 180));

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
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, -1, -1));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 18))); // NOI18N
        jPanel5.setOpaque(false);

        jLabel11.setText("Total de ventas:");

        jLabel13.setText("Dinero ingresado:");

        jLabel14.setText("Vuelto");

        jLabel18.setText("S/.");

        jLabel19.setText("S/.");

        jLabel21.setText("S/.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel19))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblvuelto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel19))
                    .addComponent(lbltotal, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblvuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 260, 140));

        btnVuelto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVuelto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vuelto64.png"))); // NOI18N
        btnVuelto.setText("Vuelto");
        btnVuelto.setBorderPainted(false);
        btnVuelto.setContentAreaFilled(false);
        btnVuelto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVuelto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vuelto72.png"))); // NOI18N
        btnVuelto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVuelto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVueltoActionPerformed(evt);
            }
        });
        getContentPane().add(btnVuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar48.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar64.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar64.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, 130, 80));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oie_5519171kT7hic9.gif"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 330, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PASTEL3 (1).png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 750, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcant2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcant2ActionPerformed
    }//GEN-LAST:event_txtcant2ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        DecimalFormat ob=new DecimalFormat("###.###");
        int cant1,cant2,cant3;
        float precio1,precio2,precio3;
        float tot1,tot2,tot3;
        txtingreso.setEnabled(true);
        precio1=Float.parseFloat(txtprecio1.getText());
        if (band==1) {
            cant1=Integer.parseInt(txtcant1.getText());
        }else{
            cant1=Integer.parseInt(cbcant1.getSelectedItem().toString());
        }
        tot1=precio1*cant1;
        lbltot1.setText(ob.format(tot1)+"");
        
        precio2=Float.parseFloat(txtprecio2.getText());
        if (band1==2 ) {
            cant2=Integer.parseInt(txtcant2.getText());
        }else{
            cant2=Integer.parseInt(cbcant2.getSelectedItem().toString());
        }
        tot2=precio2*cant2;
        lbltot2.setText(ob.format(tot2)+"");
        
        precio3=Float.parseFloat(txtprecio3.getText());
        if (band2==3 ) {
            cant3=Integer.parseInt(txtcant3.getText());
        }else{
            cant3=Integer.parseInt(cbcant3.getSelectedItem().toString());
        }
        tot3=precio3*cant3;
        lbltot3.setText(ob.format(tot3)+"");
        lbltotal.setText(ob.format(tot1+tot2+tot3));
        total=tot1+tot2+tot3;
        txtingreso.requestFocus();
        btnCalcular.setEnabled(false);
        atImporte.append("Del producto 1: \n"+"El precio es: "+ob.format(precio1)+" y la cantidad es: "+cant1+"\nEl total es: "+ob.format(tot1)
        +"\n\nDel producto 2: \n"+"El precio es: "+ob.format(precio2)+" y la cantidad es: "+cant2+"\nEl total es: "+ob.format(tot2)+
        "\n\nDel producto 3: \n"+"El precio es: "+ob.format(precio3)+" y la cantidad es: "+cant3+"\nEl total es: "+ob.format(tot3)+"\n\nEl monto general es: "+(tot1+tot2+tot3));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cbcant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcant1ActionPerformed
         
        if (cbcant1.getSelectedItem().toString().compareTo("Otra cantidad")==0) {
            txtcant1.setEnabled(true);
            band=1;
        }else{
             txtcant1.setEnabled(false);
        }
    }//GEN-LAST:event_cbcant1ActionPerformed

    private void cbcant2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcant2ActionPerformed
         
        if (cbcant2.getSelectedItem().toString().compareTo("Otra cantidad")==0) {
            txtcant2.setEnabled(true);
            band1=2;
        }else{
            txtcant2.setEnabled(false);  
        }
    }//GEN-LAST:event_cbcant2ActionPerformed

    private void cbcant3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcant3ActionPerformed
         if (cbcant3.getSelectedItem().toString().compareTo("Otra cantidad")==0) {
            txtcant3.setEnabled(true);
            band2=3;
        }else{
            txtcant3.setEnabled(false);  
        }
    }//GEN-LAST:event_cbcant3ActionPerformed

    private void txtcant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcant1ActionPerformed

    }//GEN-LAST:event_txtcant1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtprecio1.setText("");
        txtprecio2.setText("");
        txtprecio3.setText("");
        txtcant1.setText("");
        txtcant2.setText("");
        txtcant3.setText("");
        lbltot1.setText("");
        lbltot2.setText("");
        lbltot3.setText("");
        cbcant1.setSelectedIndex(0);
        cbcant2.setSelectedIndex(0);
        cbcant3.setSelectedIndex(0); 
        atImporte.setText("");
        lblvuelto.setText("");
        txtingreso.setText("");
        btnCalcular.setEnabled(true);
        lbltotal.setText("");
        txtprecio1.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVueltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVueltoActionPerformed
        DecimalFormat ob=new DecimalFormat("###.###");
       
        float dingreso=Float.parseFloat(txtingreso.getText());    
        
        if (dingreso>=total) {
           jLabel14.setVisible(true);
           lblvuelto.setVisible(true);
           lblvuelto.setText(ob.format(dingreso-total));
        }else{
           jLabel14.setVisible(false);
           lblvuelto.setVisible(false);
            JOptionPane.showMessageDialog(null,"No ingresó el monto suficiente, intente de nuevo","ERROR",0);
            txtingreso.setText("");
            jLabel14.setVisible(true);
        }
    }//GEN-LAST:event_btnVueltoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Apertura op=new Apertura();
        op.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACTIVIDAD_03().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atImporte;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVuelto;
    private javax.swing.JComboBox<String> cbcant1;
    private javax.swing.JComboBox<String> cbcant2;
    private javax.swing.JComboBox<String> cbcant3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltot1;
    private javax.swing.JLabel lbltot2;
    private javax.swing.JLabel lbltot3;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lblvuelto;
    private javax.swing.JTextField txtcant1;
    private javax.swing.JTextField txtcant2;
    private javax.swing.JTextField txtcant3;
    private javax.swing.JTextField txtingreso;
    private javax.swing.JTextField txtprecio1;
    private javax.swing.JTextField txtprecio2;
    private javax.swing.JTextField txtprecio3;
    // End of variables declaration//GEN-END:variables
  
    

}
