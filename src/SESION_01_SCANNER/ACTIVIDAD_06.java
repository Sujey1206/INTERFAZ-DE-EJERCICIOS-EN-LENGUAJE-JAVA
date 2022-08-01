/*
 4.- Convertir una cantidad de segundos asignadas aleatoriamente a su
equivalente en días, horas, minutos y segundos.
 */
package SESION_01_SCANNER;
import MenuFormulario.Apertura;
import java.text.DecimalFormat;
public class ACTIVIDAD_06 extends javax.swing.JFrame {
     DecimalFormat ob = new DecimalFormat("##.#");
    public ACTIVIDAD_06() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtseg = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblseg = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        lblhoras = new javax.swing.JLabel();
        lbldias = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnAleatorios = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA DE SEGUNDOS");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText("CONVERTIDOR DE SEGUNDOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Convertidor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setText("Ingrese los segundos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 99, Short.MAX_VALUE)
                .addComponent(txtseg, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 330, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Convertidor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel3.setText("Segundos:");

        jLabel4.setText("Minutos:");

        jLabel5.setText("Horas:");

        jLabel6.setText("Dias: ");

        lblseg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblhoras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbldias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setText("seg");

        jLabel8.setText("min");

        jLabel9.setText("hrs");

        jLabel11.setText("d");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblseg, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(lblmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblhoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbldias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblseg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lblmin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                        .addComponent(lblhoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                        .addComponent(lbldias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel11))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 164, 230, -1));

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
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        btnAleatorios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAleatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aleatorio48.png"))); // NOI18N
        btnAleatorios.setText("Aleatorios");
        btnAleatorios.setAutoscrolls(true);
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
        getContentPane().add(btnAleatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar48.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar48.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar64.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 120, 80));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/S1-6.gif"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, 140));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PASTEL3.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        float s, min,horas,dias,seg;
        txtseg.setEnabled(true);
        s=Integer.parseInt(txtseg.getText());
         
        seg=(float)s%60;  // Para los segundos
        min=s%3600/60;    //Para los minutos
        horas=s%86400/3600;  //Para las horas 
        dias=(int)s/86400;   //Para los dias
        
        lblseg.setText(ob.format(seg));
        lblmin.setText(ob.format(min));
        lblhoras.setText(ob.format(horas));
        lbldias.setText(ob.format(dias));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAleatoriosActionPerformed
        float s, min,horas,dias,seg;
        s=(float)(Math.random()*1000+1);
        txtseg.setText(ob.format(s));
        txtseg.setEnabled(false);
        seg=(float)s%60;  // Para los segundos
        min=s%3600/60;    //Para los minutos
        horas=s%86400/3600;  //Para las horas 
        dias=(int)s/86400;   //Para los dias
        
        lblseg.setText(ob.format(seg));
        lblmin.setText(ob.format(min));
        lblhoras.setText(ob.format(horas));
        lbldias.setText(ob.format(dias));
    }//GEN-LAST:event_btnAleatoriosActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtseg.setText("");
        lblseg.setText("");
        lblmin.setText("");
        lblhoras.setText("");
        lbldias.setText("");
        txtseg.setEnabled(true);
        txtseg.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Apertura op=new Apertura();
        op.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACTIVIDAD_06().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAleatorios;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbldias;
    private javax.swing.JLabel lblhoras;
    private javax.swing.JLabel lblmin;
    private javax.swing.JLabel lblseg;
    private javax.swing.JTextField txtseg;
    // End of variables declaration//GEN-END:variables
}
