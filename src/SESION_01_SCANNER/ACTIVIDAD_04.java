/*
5.- Un departamento de climatología ha realizado recientemente su conversión
al sistema métrico. Diseñar un algoritmo para realizar las siguientes conversiones: 

a. Asignar aleatoriamente la temperatura dada en la escala Celsius e 
imprimir en su equivalente Fahrenheit (la fórmula de conversión es “F=9/5 ºC+32”). 

b.  Asignar aleatoriamente la cantidad de agua en pulgadas e imprimir su 
equivalente en milímetros (25.5 mm = 1pulgada)
 */
package SESION_01_SCANNER;
import MenuFormulario.Apertura;
import java.text.DecimalFormat;
public class ACTIVIDAD_04 extends javax.swing.JFrame {    
    public ACTIVIDAD_04() {
        initComponents();
        setLocationRelativeTo(null);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcelsius = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblfar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtpulg = new javax.swing.JTextField();
        lblmm = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnAleatorios = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText("CONVERTIDORES AL SIST. MÉTRICO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Convertidor de Celsius a Fahrenheit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 18))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setText("Grados Celsius");

        jLabel4.setText("Grados Fahrenheit");

        jLabel8.setText("°F");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(txtcelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblfar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcelsius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lblfar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 340, 120));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Convertidor de pulgadas a milímetros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 18))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel5.setText("Cant. de pulgadas");

        jLabel7.setText("Cant. en milímetros");

        jLabel9.setText("mm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtpulg, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblmm, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpulg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(lblmm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 340, 120));

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora_48.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setBorderPainted(false);
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora64.png"))); // NOI18N
        btnCalcular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

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
        getContentPane().add(btnAleatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar48.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aleatorio48.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar64.png"))); // NOI18N
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar48.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar48.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar64.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 140, 90));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/climas.gif"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 220, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PASTEL3.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
      float celsius=0,faren;
      DecimalFormat ob=new DecimalFormat("###.###");
      celsius=Float.parseFloat(txtcelsius.getText());
      faren=(float)(((9*celsius)/5) +32);
      lblfar.setText(ob.format(faren));
      
       float pul=0,mm;
       pul=Float.parseFloat(txtpulg.getText());
       mm=(float)(pul*25.5);
       lblmm.setText(ob.format(mm));
 
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAleatoriosActionPerformed
      float celsius,faren;
      DecimalFormat ob=new DecimalFormat("###.###");
      celsius=(float)(Math.random()*1000+1);
      txtcelsius.setText(ob.format(celsius));
      faren=(float)(((9*celsius)/5) +32);
      lblfar.setText(ob.format(faren));  
      
       float pul,mm;
       pul=(float)(Math.random()*1000+1);
       txtpulg.setText(ob.format(pul));
       mm=(float)(pul*25.5);
       lblmm.setText(ob.format(mm));
    }//GEN-LAST:event_btnAleatoriosActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
     txtcelsius.setText("");
     lblfar.setText("");
     lblmm.setText("");
     txtpulg.setText("");
     txtcelsius.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Apertura op=new Apertura();
        op.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACTIVIDAD_04().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblfar;
    private javax.swing.JLabel lblmm;
    private javax.swing.JTextField txtcelsius;
    private javax.swing.JTextField txtpulg;
    // End of variables declaration//GEN-END:variables
}
