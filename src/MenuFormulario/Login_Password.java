package MenuFormulario;
import java.awt.Color;//Nos permite manejar o establecer colores
import java.awt.event.ActionEvent;//Se usa para dar la acción en la interfaz
import java.awt.event.ActionListener;//se usa para detectar y manejar eventos dentro del actionevent
import javax.swing.JOptionPane;//Nos permite mostrar un dialogo en el que podemos introducir o mostrar la información que queramos
import javax.swing.Timer;//Nos ayudará a ejecutar una funcion cada cierto tiempo
public class Login_Password extends javax.swing.JFrame {
    Timer tiempo;//Variable que servirá para el contador del mensaje de intentos
    Mensajes pc = new Mensajes(); //Objeto para llamar los mensajes de error
    Register regis = new Register();//Objeto para crear nuevos usuarios
    Contraseña contra = new Contraseña();//Objeto para cambiar contraseña de los usuarios
    static int i = 3, segundos = 11, n = 0,cambio=0,pos,reg=0;//Variable i que servirá para numero de intentos
                                                              //Variable segundo que servirá como contador para el tiempo de espera por fallar
                                                              //Variable n que servirá para crear los usuarios nuevos
                                                              //Variable cambio serivrá para que cuando la contraseña se cambio guarde ese cambio en el usuario indicado
                                                              //Variable pos que servirá para ubicar el usuario del cual se cambiará la contraseña
                                                              //Variable reg servirá para que cuando se cree un nuevo usuario guarde ese usuario
    static String usuario[] = new String[25], user;           //Variable usuario para guardar los usuarios y user para ingresar el usuario
    static String password[] = new String[25], pass;          //Variable password para guardar las contraseñas y pass para ingresar las contraseñas

    public Login_Password() {                                 
        initComponents();                                   //Carga todo los objetos que hallas puesto en el JFrame al momento de ejecutar el programa, por eso que va dentro del contructor de la clase.
        this.setBackground(new Color(0, 0, 0, 0));          //Sirve para quitarle el color del jframe
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        txtNombre.setBackground(new Color(0, 0, 0, 0));
        txtContraseña.setBackground(new Color(0, 0, 0, 0));
        usuario[0] = "Equipo 5"; //Inicializamos de la primera posicion al usuario, recordar que tiene un tamaño de 25
        password[0] = "equipo5"; //Inicializamos de la primera posicion al password, recordar que tiene un tamaño de 25
        setLocationRelativeTo(null);//Para centrar la consola
    }

    @SuppressWarnings("unchecked") //Se crea por defecto y es tilizado para suprimir las advertencias del compilador
                                   //Unchecked permite la supresión de las advertencias del compilador generado.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        LblPersona = new javax.swing.JLabel();
        LblUsua = new javax.swing.JLabel();
        LblContra = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btningresar = new javax.swing.JButton();
        lblesperando = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btncerrar = new javax.swing.JButton();
        LblWelcome = new javax.swing.JLabel();
        LblPingui = new javax.swing.JLabel();
        LblBlanco = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCambiarContraseña = new javax.swing.JButton();
        LblAzul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBackground(new java.awt.Color(157, 190, 230));
        jSeparator3.setForeground(new java.awt.Color(157, 190, 230));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 280, 10));

        LblPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Persona.png"))); // NOI18N
        jPanel1.add(LblPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 130, 130));

        LblUsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginPersona.png"))); // NOI18N
        jPanel1.add(LblUsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        LblContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginContra.png"))); // NOI18N
        jPanel1.add(LblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Garamond", 1, 23)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtNombre.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 220, 30));

        lblContraseña.setFont(new java.awt.Font("Garamond", 1, 23)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        txtContraseña.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setBorder(null);
        txtContraseña.setOpaque(false);
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
        });
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 220, 30));

        btningresar.setBackground(new java.awt.Color(255, 255, 255));
        btningresar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btningresar.setForeground(new java.awt.Color(157, 195, 230));
        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btningresar.setBorder(null);
        btningresar.setBorderPainted(false);
        btningresar.setContentAreaFilled(false);
        btningresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btningresar.setFocusPainted(false);
        btningresar.setFocusable(false);
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        jPanel1.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 120, 50));

        lblesperando.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        lblesperando.setForeground(new java.awt.Color(255, 255, 255));
        lblesperando.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblesperando, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 230, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 280, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 270, 10));

        btncerrar.setBackground(new java.awt.Color(255, 255, 255));
        btncerrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btncerrar.setForeground(new java.awt.Color(157, 195, 230));
        btncerrar.setText("X");
        btncerrar.setBorder(null);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncerrar.setFocusPainted(false);
        btncerrar.setFocusable(false);
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        LblWelcome.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        LblWelcome.setForeground(new java.awt.Color(157, 195, 255));
        LblWelcome.setText("WELCOME");
        jPanel1.add(LblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        LblPingui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pinguino.png"))); // NOI18N
        jPanel1.add(LblPingui, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        LblBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))); // NOI18N
        jPanel1.add(LblBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 410, 470));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("¿Usuario nuevo?");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 130, -1));

        btnCambiarContraseña.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCambiarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarContraseña.setText("¿Se olvido su contraseña?");
        btnCambiarContraseña.setBorderPainted(false);
        btnCambiarContraseña.setContentAreaFilled(false);
        btnCambiarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCambiarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 180, -1));

        LblAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Celeste.png"))); // NOI18N
        jPanel1.add(LblAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit(0); //El systemexit sirve para terminar todo en la máquina virtual de Java actual
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        if(cambio!=0){       //Servirá para guardar la contraseña del usuario seleccionado una vez 
            cambiocontraseña(); //Metodo servirá para cambiar la contraseña
            cambio=0;        //Para reiniciar los cambios de contraseña a otros usuarios o al mismo
        }
        if(n!=reg){         //Servirá para guardar el usuario creado una vez 
            usuario[n] = regis.Usuario();   //Crear nuevo usuario
            password[n] = regis.Pass();     //Crear nueva contraseña
            reg++;          //Servirá de contador para las personas registradas 
        }
        user = txtNombre.getText(); //Ingresamos
        pass = String.valueOf(txtContraseña.getPassword()); //Ingresamos las contraseña y el string devuelve el valor primitivo como un tipo de dato cadena
        if (user.isEmpty() && pass.isEmpty()) { //Busca si tiene caracteres
            pc.Condi1();//constructor creado para cuando el usuario y contraseña en pantalla estàn vacios
            pc.setVisible(true);
        } else {
            if (user.isEmpty()) {
                pc.Condi2(); //constructor creado para cuando el usuario en pantalla està vacio
                pc.setVisible(true);
            } else {
                if (pass.isEmpty()) {
                    pc.Condi3(); //constructor creado para cuando la contraseña en pantalla està vacio
                    pc.setVisible(true);
                } else {
                    datosllenos();  //Metodo cuando los campos contra y usuario están llenos
                }
            }
        }
    }//GEN-LAST:event_btningresarActionPerformed

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained

    }//GEN-LAST:event_txtNombreFocusGained

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained

    }//GEN-LAST:event_txtContraseñaFocusGained

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed

    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        regis.setVisible(true); 
        n++;
        dispose();//Si sólo deseas destruir la ventana actual, con el efecto secundario que va a cerrar la maquina virtual
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaActionPerformed
        String Usuario=JOptionPane.showInputDialog(null,"Ingrese el usuario del cual desea cambiar la contraseña: ","Nombre de Usuario",1);
        cambio=0;
        for (int j = 0; j <= n; j++) {
            if(usuario[j].compareTo(Usuario)==0){
                cambio++;
                pos=j;
            }
        }
        if(cambio==0){
            JOptionPane.showMessageDialog(null,"¡¡Error!! Este usuario no existe");
        }else{
            contra.setVisible(true);
            dispose();
        }   
    }//GEN-LAST:event_btnCambiarContraseñaActionPerformed
    
    public void cambiocontraseña(){
        password[pos]=contra.Newpass();
    }
    
    public void datosllenos() {
        int band = 0;
        for (int j = 0; j <= n; j++) {
            if (usuario[j].equals(user) && password[j].equals(pass)) {
                Bienvenida Bien = new Bienvenida();
                Bien.setVisible(true);
                dispose();
                band = 1;
                i = 3;
                break;
            } else {
                band = 0;
            }
        }
        if (band == 0) {
            i--;
            if (i != 0) {
                pc.mens(i);
                pc.setVisible(true);
            }
            limpiar();
            if (i == 0) {
                txtContraseña.setEnabled(false);
                txtNombre.setEnabled(false);
                btningresar.setEnabled(false);
                tiempo = new Timer(1000, new ActionListener() {
                    @Override // forzar al compilador a sobreescribir el metodo correctamente y asi evitar errorres
                    public void actionPerformed(ActionEvent e) {
                        segundos--;
                        lblesperando.setText("Espere " + segundos + " para volver a ingresar");
                        if (segundos == 0) {
                            tiempo.stop();
                            txtContraseña.setEnabled(true);
                            txtNombre.setEnabled(true);
                            btningresar.setEnabled(true);
                            lblesperando.setText("");
                            txtNombre.requestFocus();
                            i = 3;
                            segundos = 11;
                        }
                    }
                });
                tiempo.start();
            }
        }
    }
    public String usuario(){
        return user;
    }

    public void limpiar() {
        txtNombre.setText("");
        txtContraseña.setText("");
        txtNombre.requestFocus();
    }

    public static void main(String args[]) {     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblAzul;
    private javax.swing.JLabel LblBlanco;
    private javax.swing.JLabel LblContra;
    private javax.swing.JLabel LblPersona;
    private javax.swing.JLabel LblPingui;
    private javax.swing.JLabel LblUsua;
    private javax.swing.JLabel LblWelcome;
    private javax.swing.JButton btnCambiarContraseña;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btningresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblesperando;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
