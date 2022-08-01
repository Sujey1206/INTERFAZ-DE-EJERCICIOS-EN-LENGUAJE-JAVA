package SESION_09_PILAS;

import MenuFormulario.Apertura;
import javax.swing.JOptionPane;

public class FORMULARIO_PILAS extends javax.swing.JFrame {

    public FORMULARIO_PILAS() {
        initComponents();
        setLocationRelativeTo(null);
    }

     static int n=0;
     static int pila[]=new int [50];
    static int tope = -1;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbIngresar = new javax.swing.JRadioButton();
        rbMostrar = new javax.swing.JRadioButton();
        rbEliminar = new javax.swing.JRadioButton();
        rbVaciar = new javax.swing.JRadioButton();
        btnInsertar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PILAS EN JAVA");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Números", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setText("Cantidad de elementos de la pila: ");

        jLabel3.setText("Selecione su opción");

        buttonGroup1.add(rbIngresar);
        rbIngresar.setText("Ingresar un elemento");
        rbIngresar.setContentAreaFilled(false);
        rbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIngresarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbMostrar);
        rbMostrar.setText("Mostrar la pila");
        rbMostrar.setContentAreaFilled(false);
        rbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMostrarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEliminar);
        rbEliminar.setText("Eliminar un elemento");
        rbEliminar.setContentAreaFilled(false);
        rbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEliminarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbVaciar);
        rbVaciar.setText("Vaciar pila");
        rbVaciar.setContentAreaFilled(false);
        rbVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVaciarActionPerformed(evt);
            }
        });

        btnInsertar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadir_48.png"))); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.setBorderPainted(false);
        btnInsertar.setContentAreaFilled(false);
        btnInsertar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInsertar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadir_48.png"))); // NOI18N
        btnInsertar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadir_64.png"))); // NOI18N
        btnInsertar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbIngresar)
                                    .addComponent(rbMostrar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbEliminar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbVaciar, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(btnInsertar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(rbIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbVaciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnInsertar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 51, -1, -1));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel1.setText("MENU PILAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        btncerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar48.png"))); // NOI18N
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar48.png"))); // NOI18N
        btncerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar64.png"))); // NOI18N
        btncerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 110, 80));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PASTEL3 (1) (1).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMostrarActionPerformed
        if (EstaPilaVacia()) {
            JOptionPane.showMessageDialog(null,"La pila esta vacia no hay elementos para mostrar","ERROR",0);
        }else{
            String mostrar="";
            for (int i = tope; i >=0 ; i--) {
                mostrar+= pila[i]+" ";
            }
            JOptionPane.showMessageDialog(null, mostrar);
        }
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_rbMostrarActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        Apertura op=new Apertura();
        op.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void rbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIngresarActionPerformed
    
        if (EstaPilaLlena()) {
            JOptionPane.showMessageDialog(null, "La pila esta llena, no se pueden insertar más datos","ERROR",0);
        }else{
          int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero: "));
          tope++;
          pila[tope]=num;
        }
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_rbIngresarActionPerformed

    private void rbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEliminarActionPerformed

        if (EstaPilaVacia()) {
            JOptionPane.showMessageDialog(null,"La pila esta vacia no hay elementos para eliminar","ERROR",0); 
        }else{
            JOptionPane.showMessageDialog(null,"Se eliminó un elemento de la pila","ATENCION",1); 
            tope--;
        }
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_rbEliminarActionPerformed

    private void rbVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVaciarActionPerformed
              tope=-1;
              JOptionPane.showMessageDialog(null,"Esta pila ya esta vacía","ATENCION",1);
              buttonGroup1.clearSelection();
    }//GEN-LAST:event_rbVaciarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
       n=Integer.parseInt(txtcantidad.getText());
       txtcantidad.setEnabled(false);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      txtcantidad.setText("");
      txtcantidad.setEnabled(true);
      txtcantidad.requestFocus();
      buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnLimpiarActionPerformed
public static boolean EstaPilaLlena(){
        if(tope==n-1){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean EstaPilaVacia(){
        if(tope==-1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORMULARIO_PILAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btncerrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbEliminar;
    private javax.swing.JRadioButton rbIngresar;
    private javax.swing.JRadioButton rbMostrar;
    private javax.swing.JRadioButton rbVaciar;
    private javax.swing.JTextField txtcantidad;
    // End of variables declaration//GEN-END:variables
}
