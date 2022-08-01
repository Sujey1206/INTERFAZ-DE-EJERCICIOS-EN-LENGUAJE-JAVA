package MenuFormulario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class Bienvenida extends javax.swing.JFrame {
    Timer tiempo,tiempo2;
    int i=0,j=0;
    String mostrar="",mostrar2="";
    @SuppressWarnings("empty-statement")
    public Bienvenida() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
        String letras[]= {"B","I","E","N","V","E","N","I","D","O"," ","A","L"," ","S","I","S","T","E","M","A"};
        tiempo = new Timer(120, new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                            mostrar+=letras[i];
                            txtbienvenido.setText(mostrar);
                            i++;
                        if(i==21){
                           Login_Password login=new Login_Password();
                           txtequipo5.setText(login.usuario());
                           tiempo.stop();
                           accion2();
                        }
                    } 
                });
        tiempo.start();
    }
    public void accion2(){
        tiempo2 = new Timer(500, new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                               txtCargando.setText("cargando");
                               mostrar2+="."+" ";
                               txtcargando2.setText(mostrar2);
                               j++;
                               if(j==6){
                                   Apertura pc = new Apertura();
                                   pc.setVisible(true);
                                   dispose();
                                   tiempo2.stop();
                               }
                        } 
                    });
        tiempo2.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtbienvenido = new javax.swing.JLabel();
        txtequipo5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCargando = new javax.swing.JLabel();
        txtcargando2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtbienvenido.setBackground(new java.awt.Color(255, 255, 255));
        txtbienvenido.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        txtbienvenido.setForeground(new java.awt.Color(102, 102, 102));
        txtbienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtbienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 290, 23));

        txtequipo5.setBackground(new java.awt.Color(255, 255, 255));
        txtequipo5.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        txtequipo5.setForeground(new java.awt.Color(102, 102, 102));
        txtequipo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtequipo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 290, 25));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(157, 166, 167));
        jLabel1.setText("******************************************");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PinRev.gif"))); // NOI18N
        jLabel5.setFocusable(false);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 110, 90));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(157, 166, 167));
        jLabel2.setText("******************************************");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        txtCargando.setBackground(new java.awt.Color(255, 255, 255));
        txtCargando.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        txtCargando.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtCargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 82, 19));

        txtcargando2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtcargando2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtcargando2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 40, 19));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pin.gif"))); // NOI18N
        jLabel4.setFocusable(false);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoBienvi.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCargando;
    private javax.swing.JLabel txtbienvenido;
    private javax.swing.JLabel txtcargando2;
    private javax.swing.JLabel txtequipo5;
    // End of variables declaration//GEN-END:variables
}
