package MenuFormulario;
import ENUNCIADOS.Archivos;
import ENUNCIADOS.ArreglosBid;
import ENUNCIADOS.ArreglosUni;
import ENUNCIADOS.Clases;
import ENUNCIADOS.Colas;
import ENUNCIADOS.EstructuControl;
import ENUNCIADOS.JOption;
import ENUNCIADOS.Jframe;
import ENUNCIADOS.Pilas;
import ENUNCIADOS.Recursividad;
import ENUNCIADOS.Registros;
import ENUNCIADOS.Scanner;
import SESION_01_SCANNER.ACTIVIDAD_01;
import SESION_01_SCANNER.ACTIVIDAD_02;
import SESION_01_SCANNER.ACTIVIDAD_03;
import SESION_01_SCANNER.ACTIVIDAD_04;
import SESION_01_SCANNER.ACTIVIDAD_05;
import SESION_01_SCANNER.ACTIVIDAD_06;
import SESION_01_SCANNER.ACTIVIDAD_07;
import SESION_02_JOPTION.EJERCICIO_J1;
import SESION_02_JOPTION.EJERCICIO_J2;
import SESION_02_JOPTION.EJERCICIO_J3;
import SESION_02_JOPTION.EJERCICIO_J4;
import SESION_02_JOPTION.EJERCICIO_J5;
import SESION_02_JOPTION.EJERCICIO_J6;
import SESION_02_JOPTION.EJERCICIO_J7;
import SESION_03_ESTRUCT.CONTROL.EJERCICIO_EC1;
import SESION_03_ESTRUCT.CONTROL.EJERCICIO_EC2;
import SESION_04_MENU.EJERCICIO_M1;
import SESION_04_MENU.EJERCICIO_M2;
import SESION_05_ARREGLOS.EJERCICIO_AU1;
import SESION_05_ARREGLOS.EJERCICIO_AU2;
import SESION_06_BIDIMENSIONAL.EJERCICIO_AB1;
import SESION_06_BIDIMENSIONAL.EJERCICIO_AB2;
import SESION_06_BIDIMENSIONAL.EJERCICIO_AB3;
import SESION_06_BIDIMENSIONAL.EJERCICIO_AB4;
import SESION_07_JFRAME.EJERCICIO_JF1;
import SESION_07_JFRAME.EJERCICIO_JF2;
import SESION_08_CONS_PARAM.FORMULARIO_Art_CP1;
import SESION_08_CONS_PARAM.FORMULARIO_Atl_CP2;
import SESION_08_GS.FORMULARIO_Alum_GS1;
import SESION_08_GS.FORMULARIO_Atl_GS2;
import SESION_08_GS.FORMULARIO_cli_GS3;
import SESION_09_PILAS.FORMULARIO_PILAS;
import SESION_10_COLAS.FORMULARIO_COLAS;
import SESION_11_RECURSIVIDAD.EJERCICIO_A;
import SESION_11_RECURSIVIDAD.EJERCICIO_B;
import SESION_11_RECURSIVIDAD.EJERCICIO_C;
import SESION_11_RECURSIVIDAD.EJERCICIO_D;
import SESION_11_RECURSIVIDAD.EJERCICIO_E;
import SESION_12_ARCHIVOS.EJERCICIO_AR1;
import SESION_12_ARCHIVOS.EJERCICIO_AR2;
import SESION_12_ARCHIVOS.EJERCICIO_AR3;
import SESION_12_ARCHIVOS.EJERCICIO_AR4;
import java.awt.Color;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
public class Apertura extends javax.swing.JFrame{
   int dia,mes,año;
    public Apertura() {
        initComponents();
        Login_Password login=new Login_Password();
        jLabel5.setText(login.usuario());
        jMenuBar1.setBackground(new Color(0,0,0,0));
        this.setBackground(new Color(230,205,255,255));
        setLocationRelativeTo(null);
        lblfecha.setText(fecha());
        setVisible(true);
    }

    public String fecha(){
        Date fecha=new Date();//creando una nueva instancia de la clase date
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PanelEje = new javax.swing.JPanel();
        lblfecha = new javax.swing.JLabel();
        btnScannEnun = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnJOptionEnun = new javax.swing.JButton();
        btnEstrucConEnun = new javax.swing.JButton();
        btnReporteEnun = new javax.swing.JButton();
        btnArregloUEnun = new javax.swing.JButton();
        btnArregloBidEnun = new javax.swing.JButton();
        btnJFrameEnun = new javax.swing.JButton();
        btnClasesEnun = new javax.swing.JButton();
        btnPilaEnun = new javax.swing.JButton();
        btnColasEnun = new javax.swing.JButton();
        btnRecursividadEnun = new javax.swing.JButton();
        btnArchivosEnun = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu12 = new javax.swing.JMenu();
        opVolver = new javax.swing.JMenuItem();
        opSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        opScannEjer1 = new javax.swing.JMenuItem();
        opScannEjer2 = new javax.swing.JMenuItem();
        opScannEjer3 = new javax.swing.JMenuItem();
        opScannEjer4 = new javax.swing.JMenuItem();
        opScannEjer5 = new javax.swing.JMenuItem();
        opScannEjer6 = new javax.swing.JMenuItem();
        opScannEjer7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opJopEjer1 = new javax.swing.JMenuItem();
        opJopEjer2 = new javax.swing.JMenuItem();
        opJopEjer3 = new javax.swing.JMenuItem();
        opJopEjer4 = new javax.swing.JMenuItem();
        opJopEjer5 = new javax.swing.JMenuItem();
        opJopEjer6 = new javax.swing.JMenuItem();
        opJopEjer7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opEstrucEjer1 = new javax.swing.JMenuItem();
        opEstrucEjer2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        opRepEjer1 = new javax.swing.JMenuItem();
        opRepEjer2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        opArregUEjer1 = new javax.swing.JMenuItem();
        opArregUEjer2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        opArregBEjer1 = new javax.swing.JMenuItem();
        opArregBEjer2 = new javax.swing.JMenuItem();
        opArregBEjer3 = new javax.swing.JMenuItem();
        opArregBEjer4 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        opFrameEjer1 = new javax.swing.JMenuItem();
        opFrameEjer2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        opGSEjer1 = new javax.swing.JMenuItem();
        opGSEjer2 = new javax.swing.JMenuItem();
        opGSEjer3 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        opCPEjer1 = new javax.swing.JMenuItem();
        opCPEjer2 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        opPilaEjer1 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        opColaEjer1 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        opRecuEjer1 = new javax.swing.JMenuItem();
        opRecuEjer2 = new javax.swing.JMenuItem();
        opRecuEjer3 = new javax.swing.JMenuItem();
        opRecuEjer4 = new javax.swing.JMenuItem();
        opRecuEjer5 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        opArchEjer1 = new javax.swing.JMenuItem();
        opArchEjer2 = new javax.swing.JMenuItem();
        opArchEjer3 = new javax.swing.JMenuItem();
        opArchEjer4 = new javax.swing.JMenuItem();

        jMenuItem20.setText("jMenuItem20");

        jMenuItem11.setText("jMenuItem11");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 205, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(195, 209, 235));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/usuario (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 140, 130));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(81, 75, 75));
        jLabel3.setText("BIENVENIDO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(81, 75, 75));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(81, 75, 75));
        jLabel4.setText("INTEGRANTES:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(81, 75, 75));
        jLabel6.setText("1) Gamarra Hilarion, Giancarlo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 194, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(81, 75, 75));
        jLabel7.setText("2) Gutierrez Sotomayor, Jeremy");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(81, 75, 75));
        jLabel8.setText("3) Huaman Encalada, Alexandra");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(81, 75, 75));
        jLabel9.setText("4) Lavado Julian, Alex");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 196, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logoUnfv.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(81, 75, 75));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Universidad Nacional");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 138, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(81, 75, 75));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Federico Villarreal");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 490, -1, -1));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 550));

        PanelEje.setOpaque(false);

        lblfecha.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(102, 102, 102));
        lblfecha.setText("DD/MM/YY");

        btnScannEnun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnScannEnun.setForeground(new java.awt.Color(102, 102, 102));
        btnScannEnun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Scanner96.png"))); // NOI18N
        btnScannEnun.setText("Scanner");
        btnScannEnun.setBorderPainted(false);
        btnScannEnun.setContentAreaFilled(false);
        btnScannEnun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnScannEnun.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnScannEnun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnScannEnun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Scanner128.png"))); // NOI18N
        btnScannEnun.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Scanner96.png"))); // NOI18N
        btnScannEnun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnScannEnun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScannEnunActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("ENUNCIADOS");

        btnJOptionEnun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnJOptionEnun.setForeground(new java.awt.Color(102, 102, 102));
        btnJOptionEnun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JOP72.png"))); // NOI18N
        btnJOptionEnun.setText("JOption");
        btnJOptionEnun.setBorderPainted(false);
        btnJOptionEnun.setContentAreaFilled(false);
        btnJOptionEnun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnJOptionEnun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJOptionEnun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JOP96.png"))); // NOI18N
        btnJOptionEnun.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JOP72.png"))); // NOI18N
        btnJOptionEnun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnJOptionEnun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJOptionEnunActionPerformed(evt);
            }
        });

        btnEstrucConEnun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEstrucConEnun.setForeground(new java.awt.Color(102, 102, 102));
        btnEstrucConEnun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/control72.png"))); // NOI18N
        btnEstrucConEnun.setText("Estructura de Control");
        btnEstrucConEnun.setBorderPainted(false);
        btnEstrucConEnun.setContentAreaFilled(false);
        btnEstrucConEnun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEstrucConEnun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstrucConEnun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/control96.png"))); // NOI18N
        btnEstrucConEnun.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/control72.png"))); // NOI18N
        btnEstrucConEnun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEstrucConEnun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrucConEnunActionPerformed(evt);
            }
        });

        btnReporteEnun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReporteEnun.setForeground(new java.awt.Color(102, 102, 102));
        btnReporteEnun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reporte.png"))); // NOI18N
        btnReporteEnun.setText("Reporte");
        btnReporteEnun.setBorderPainted(false);
        btnReporteEnun.setContentAreaFilled(false);
        btnReporteEnun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReporteEnun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporteEnun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReporteN.png"))); // NOI18N
        btnReporteEnun.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reporte.png"))); // NOI18N
        btnReporteEnun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporteEnun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteEnunActionPerformed(evt);
            }
        });

        btnArregloUEnun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnArregloUEnun.setForeground(new java.awt.Color(102, 102, 102));
        btnArregloUEnun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Array72.png"))); // NOI18N
        btnArregloUEnun.setText("Arreglo Unidimensional");
        btnArregloUEnun.setBorderPainted(false);
        btnArregloUEnun.setContentAreaFilled(false);
        btnArregloUEnun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnArregloUEnun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArregloUEnun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Array96.png"))); // NOI18N
        btnArregloUEnun.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Array72.png"))); // NOI18N
        btnArregloUEnun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnArregloUEnun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArregloUEnunActionPerformed(evt);
            }
        });

        btnArregloBidEnun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnArregloBidEnun.setForeground(new java.awt.Color(102, 102, 102));
        btnArregloBidEnun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bidimensional.png"))); // NOI18N
        btnArregloBidEnun.setText("Arreglo Bidimensional");
        btnArregloBidEnun.setBorderPainted(false);
        btnArregloBidEnun.setContentAreaFilled(false);
        btnArregloBidEnun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnArregloBidEnun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArregloBidEnun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BidimensionalN.png"))); // NOI18N
        btnArregloBidEnun.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bidimensional.png"))); // NOI18N
        btnArregloBidEnun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnArregloBidEnun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArregloBidEnunActionPerformed(evt);
            }
        });

        btnJFrameEnun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnJFrameEnun.setForeground(new java.awt.Color(102, 102, 102));
        btnJFrameEnun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/form72.png"))); // NOI18N
        btnJFrameEnun.setText("JFrame");
        btnJFrameEnun.setBorderPainted(false);
        btnJFrameEnun.setContentAreaFilled(false);
        btnJFrameEnun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnJFrameEnun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJFrameEnun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/form96.png"))); // NOI18N
        btnJFrameEnun.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/form72.png"))); // NOI18N
        btnJFrameEnun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnJFrameEnun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJFrameEnunActionPerformed(evt);
            }
        });

        btnClasesEnun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClasesEnun.setForeground(new java.awt.Color(102, 102, 102));
        btnClasesEnun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Class.png"))); // NOI18N
        btnClasesEnun.setText("Clases");
        btnClasesEnun.setBorderPainted(false);
        btnClasesEnun.setContentAreaFilled(false);
        btnClasesEnun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClasesEnun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClasesEnun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ClassN.png"))); // NOI18N
        btnClasesEnun.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Class.png"))); // NOI18N
        btnClasesEnun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClasesEnun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasesEnunActionPerformed(evt);
            }
        });

        btnPilaEnun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPilaEnun.setForeground(new java.awt.Color(102, 102, 102));
        btnPilaEnun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pilas72.png"))); // NOI18N
        btnPilaEnun.setText("Pilas");
        btnPilaEnun.setBorderPainted(false);
        btnPilaEnun.setContentAreaFilled(false);
        btnPilaEnun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPilaEnun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPilaEnun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pilas96.png"))); // NOI18N
        btnPilaEnun.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pilas72.png"))); // NOI18N
        btnPilaEnun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPilaEnun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilaEnunActionPerformed(evt);
            }
        });

        btnColasEnun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnColasEnun.setForeground(new java.awt.Color(102, 102, 102));
        btnColasEnun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ColaN.png"))); // NOI18N
        btnColasEnun.setText("Colas");
        btnColasEnun.setBorderPainted(false);
        btnColasEnun.setContentAreaFilled(false);
        btnColasEnun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnColasEnun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnColasEnun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ColaG.png"))); // NOI18N
        btnColasEnun.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ColaN.png"))); // NOI18N
        btnColasEnun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnColasEnun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColasEnunActionPerformed(evt);
            }
        });

        btnRecursividadEnun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRecursividadEnun.setForeground(new java.awt.Color(102, 102, 102));
        btnRecursividadEnun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursivo.png"))); // NOI18N
        btnRecursividadEnun.setText("Recursividad");
        btnRecursividadEnun.setBorderPainted(false);
        btnRecursividadEnun.setContentAreaFilled(false);
        btnRecursividadEnun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRecursividadEnun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRecursividadEnun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RecursivoN.png"))); // NOI18N
        btnRecursividadEnun.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursivo.png"))); // NOI18N
        btnRecursividadEnun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRecursividadEnun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecursividadEnunActionPerformed(evt);
            }
        });

        btnArchivosEnun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnArchivosEnun.setForeground(new java.awt.Color(102, 102, 102));
        btnArchivosEnun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Archivo.png"))); // NOI18N
        btnArchivosEnun.setText("Archivos");
        btnArchivosEnun.setBorderPainted(false);
        btnArchivosEnun.setContentAreaFilled(false);
        btnArchivosEnun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnArchivosEnun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArchivosEnun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ArchivoN.png"))); // NOI18N
        btnArchivosEnun.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Archivo.png"))); // NOI18N
        btnArchivosEnun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnArchivosEnun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivosEnunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEjeLayout = new javax.swing.GroupLayout(PanelEje);
        PanelEje.setLayout(PanelEjeLayout);
        PanelEjeLayout.setHorizontalGroup(
            PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEjeLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEjeLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEjeLayout.createSequentialGroup()
                        .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnArregloUEnun)
                            .addGroup(PanelEjeLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnReporteEnun)
                                    .addComponent(btnScannEnun, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEjeLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnArregloBidEnun))
                            .addGroup(PanelEjeLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnJOptionEnun)
                                    .addComponent(btnColasEnun))))
                        .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelEjeLayout.createSequentialGroup()
                                .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelEjeLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnJFrameEnun)
                                            .addComponent(btnPilaEnun)))
                                    .addGroup(PanelEjeLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(btnEstrucConEnun, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRecursividadEnun, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnArchivosEnun, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(btnClasesEnun))
                        .addGap(26, 26, 26))))
        );
        PanelEjeLayout.setVerticalGroup(
            PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEjeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEjeLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEjeLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRecursividadEnun, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPilaEnun, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelEjeLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnColasEnun, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEjeLayout.createSequentialGroup()
                        .addComponent(btnScannEnun, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReporteEnun, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(btnJFrameEnun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClasesEnun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJOptionEnun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(PanelEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnArregloUEnun, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(btnArregloBidEnun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEstrucConEnun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnArchivosEnun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(PanelEje, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 780, 570));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuFormulario/APERTURA.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 570));

        jMenu12.setBackground(new java.awt.Color(230, 205, 255));
        jMenu12.setText("Opciones   ");
        jMenu12.setActionCommand("Opciones  ");
        jMenu12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu12.setOpaque(true);

        opVolver.setText("CERRAR SESION");
        opVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opVolverActionPerformed(evt);
            }
        });
        jMenu12.add(opVolver);

        opSalir.setText("SALIR");
        opSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSalirActionPerformed(evt);
            }
        });
        jMenu12.add(opSalir);

        jMenuBar1.add(jMenu12);

        jMenu1.setBackground(new java.awt.Color(230, 205, 255));
        jMenu1.setText(" Scanner ");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenu1.setOpaque(true);

        opScannEjer1.setText("Ejercicio 1");
        opScannEjer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opScannEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opScannEjer1ActionPerformed(evt);
            }
        });
        jMenu1.add(opScannEjer1);

        opScannEjer2.setText("Ejercicio 2");
        opScannEjer2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opScannEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opScannEjer2ActionPerformed(evt);
            }
        });
        jMenu1.add(opScannEjer2);

        opScannEjer3.setText("Ejercicio 3");
        opScannEjer3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opScannEjer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opScannEjer3ActionPerformed(evt);
            }
        });
        jMenu1.add(opScannEjer3);

        opScannEjer4.setText("Ejercicio 4");
        opScannEjer4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opScannEjer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opScannEjer4ActionPerformed(evt);
            }
        });
        jMenu1.add(opScannEjer4);

        opScannEjer5.setText("Ejercicio 5");
        opScannEjer5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opScannEjer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opScannEjer5ActionPerformed(evt);
            }
        });
        jMenu1.add(opScannEjer5);

        opScannEjer6.setText("Ejercicio 6");
        opScannEjer6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opScannEjer6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opScannEjer6ActionPerformed(evt);
            }
        });
        jMenu1.add(opScannEjer6);

        opScannEjer7.setText("Ejercicio 7");
        opScannEjer7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opScannEjer7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opScannEjer7ActionPerformed(evt);
            }
        });
        jMenu1.add(opScannEjer7);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(230, 205, 255));
        jMenu2.setText("   JOption  ");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu2.setOpaque(true);

        opJopEjer1.setText("Ejercicio 1");
        opJopEjer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opJopEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opJopEjer1ActionPerformed(evt);
            }
        });
        jMenu2.add(opJopEjer1);

        opJopEjer2.setText("Ejercicio 2");
        opJopEjer2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opJopEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opJopEjer2ActionPerformed(evt);
            }
        });
        jMenu2.add(opJopEjer2);

        opJopEjer3.setText("Ejercicio 3");
        opJopEjer3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opJopEjer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opJopEjer3ActionPerformed(evt);
            }
        });
        jMenu2.add(opJopEjer3);

        opJopEjer4.setText("Ejercicio 4");
        opJopEjer4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opJopEjer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opJopEjer4ActionPerformed(evt);
            }
        });
        jMenu2.add(opJopEjer4);

        opJopEjer5.setText("Ejercicio 5");
        opJopEjer5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opJopEjer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opJopEjer5ActionPerformed(evt);
            }
        });
        jMenu2.add(opJopEjer5);

        opJopEjer6.setText("Ejercicio 6");
        opJopEjer6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opJopEjer6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opJopEjer6ActionPerformed(evt);
            }
        });
        jMenu2.add(opJopEjer6);

        opJopEjer7.setText("Ejercicio 7");
        opJopEjer7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opJopEjer7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opJopEjer7ActionPerformed(evt);
            }
        });
        jMenu2.add(opJopEjer7);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(230, 205, 255));
        jMenu3.setText("  Estruc. Control   ");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu3.setOpaque(true);

        opEstrucEjer1.setText("Ejercicio 1");
        opEstrucEjer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opEstrucEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEstrucEjer1ActionPerformed(evt);
            }
        });
        jMenu3.add(opEstrucEjer1);

        opEstrucEjer2.setText("Ejercicio 2");
        opEstrucEjer2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opEstrucEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEstrucEjer2ActionPerformed(evt);
            }
        });
        jMenu3.add(opEstrucEjer2);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(230, 205, 255));
        jMenu4.setForeground(new java.awt.Color(51, 51, 51));
        jMenu4.setText("   Reporte   ");
        jMenu4.setActionCommand("  Reporte   ");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu4.setOpaque(true);

        opRepEjer1.setText("Ejercicio 1");
        opRepEjer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opRepEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRepEjer1ActionPerformed(evt);
            }
        });
        jMenu4.add(opRepEjer1);

        opRepEjer2.setText("Ejercicio 2");
        opRepEjer2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opRepEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRepEjer2ActionPerformed(evt);
            }
        });
        jMenu4.add(opRepEjer2);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(230, 205, 255));
        jMenu5.setText("Arreglo Unidimensional       ");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu5.setOpaque(true);

        opArregUEjer1.setText("Ejercicio 1");
        opArregUEjer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opArregUEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opArregUEjer1ActionPerformed(evt);
            }
        });
        jMenu5.add(opArregUEjer1);

        opArregUEjer2.setText("Ejercicio 2");
        opArregUEjer2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opArregUEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opArregUEjer2ActionPerformed(evt);
            }
        });
        jMenu5.add(opArregUEjer2);

        jMenuBar1.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(230, 205, 255));
        jMenu6.setText("Arreglos Bidimensional       ");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu6.setOpaque(true);

        opArregBEjer1.setText("Ejercicio 1");
        opArregBEjer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opArregBEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opArregBEjer1ActionPerformed(evt);
            }
        });
        jMenu6.add(opArregBEjer1);

        opArregBEjer2.setText("Ejercicio 2");
        opArregBEjer2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opArregBEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opArregBEjer2ActionPerformed(evt);
            }
        });
        jMenu6.add(opArregBEjer2);

        opArregBEjer3.setText("Ejercicio 3");
        opArregBEjer3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opArregBEjer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opArregBEjer3ActionPerformed(evt);
            }
        });
        jMenu6.add(opArregBEjer3);

        opArregBEjer4.setText("Ejercicio 4");
        opArregBEjer4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opArregBEjer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opArregBEjer4ActionPerformed(evt);
            }
        });
        jMenu6.add(opArregBEjer4);

        jMenuBar1.add(jMenu6);

        jMenu14.setBackground(new java.awt.Color(230, 205, 255));
        jMenu14.setText("JFrame  ");
        jMenu14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu14.setOpaque(true);

        opFrameEjer1.setText("Ejercicio 1");
        opFrameEjer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opFrameEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFrameEjer1ActionPerformed(evt);
            }
        });
        jMenu14.add(opFrameEjer1);

        opFrameEjer2.setText("Ejercicio 2");
        opFrameEjer2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opFrameEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFrameEjer2ActionPerformed(evt);
            }
        });
        jMenu14.add(opFrameEjer2);

        jMenuBar1.add(jMenu14);

        jMenu7.setBackground(new java.awt.Color(230, 205, 255));
        jMenu7.setText("Clases  ");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu7.setOpaque(true);

        jMenu11.setText("Getter y Setter");
        jMenu11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        opGSEjer1.setText("Ejercicio 1");
        opGSEjer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opGSEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGSEjer1ActionPerformed(evt);
            }
        });
        jMenu11.add(opGSEjer1);

        opGSEjer2.setText("Ejercicio 2");
        opGSEjer2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opGSEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGSEjer2ActionPerformed(evt);
            }
        });
        jMenu11.add(opGSEjer2);

        opGSEjer3.setText("Ejercicio 3");
        opGSEjer3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opGSEjer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGSEjer3ActionPerformed(evt);
            }
        });
        jMenu11.add(opGSEjer3);

        jMenu7.add(jMenu11);

        jMenu13.setText("Const. Parametrizado");
        jMenu13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        opCPEjer1.setText("Ejercicio 1");
        opCPEjer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opCPEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCPEjer1ActionPerformed(evt);
            }
        });
        jMenu13.add(opCPEjer1);

        opCPEjer2.setText("Ejercicio 2");
        opCPEjer2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opCPEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCPEjer2ActionPerformed(evt);
            }
        });
        jMenu13.add(opCPEjer2);

        jMenu7.add(jMenu13);

        jMenuBar1.add(jMenu7);

        jMenu8.setBackground(new java.awt.Color(230, 205, 255));
        jMenu8.setText("Pilas  ");
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu8.setOpaque(true);

        opPilaEjer1.setText("Ejercicio 1");
        opPilaEjer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opPilaEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPilaEjer1ActionPerformed(evt);
            }
        });
        jMenu8.add(opPilaEjer1);

        jMenuBar1.add(jMenu8);

        jMenu9.setBackground(new java.awt.Color(230, 205, 255));
        jMenu9.setText("Colas  ");
        jMenu9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu9.setOpaque(true);

        opColaEjer1.setText("Ejercicio 1");
        opColaEjer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opColaEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opColaEjer1ActionPerformed(evt);
            }
        });
        jMenu9.add(opColaEjer1);

        jMenuBar1.add(jMenu9);

        jMenu10.setBackground(new java.awt.Color(230, 205, 255));
        jMenu10.setText("Recursividad    ");
        jMenu10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu10.setOpaque(true);

        opRecuEjer1.setText("Ejercicio 1");
        opRecuEjer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opRecuEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRecuEjer1ActionPerformed(evt);
            }
        });
        jMenu10.add(opRecuEjer1);

        opRecuEjer2.setText("Ejercicio 2");
        opRecuEjer2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opRecuEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRecuEjer2ActionPerformed(evt);
            }
        });
        jMenu10.add(opRecuEjer2);

        opRecuEjer3.setText("Ejercicio 3");
        opRecuEjer3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opRecuEjer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRecuEjer3ActionPerformed(evt);
            }
        });
        jMenu10.add(opRecuEjer3);

        opRecuEjer4.setText("Ejercicio 4");
        opRecuEjer4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opRecuEjer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRecuEjer4ActionPerformed(evt);
            }
        });
        jMenu10.add(opRecuEjer4);

        opRecuEjer5.setText("Ejercicio 5");
        opRecuEjer5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opRecuEjer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRecuEjer5ActionPerformed(evt);
            }
        });
        jMenu10.add(opRecuEjer5);

        jMenuBar1.add(jMenu10);

        jMenu15.setBackground(new java.awt.Color(230, 205, 255));
        jMenu15.setText("Archivos   ");
        jMenu15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu15.setOpaque(true);

        opArchEjer1.setText("Ejercicio 1");
        opArchEjer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opArchEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opArchEjer1ActionPerformed(evt);
            }
        });
        jMenu15.add(opArchEjer1);

        opArchEjer2.setText("Ejercicio 2");
        opArchEjer2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opArchEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opArchEjer2ActionPerformed(evt);
            }
        });
        jMenu15.add(opArchEjer2);

        opArchEjer3.setText("Ejercicio 3");
        opArchEjer3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opArchEjer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opArchEjer3ActionPerformed(evt);
            }
        });
        jMenu15.add(opArchEjer3);

        opArchEjer4.setText("Ejercicio 4");
        opArchEjer4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opArchEjer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opArchEjer4ActionPerformed(evt);
            }
        });
        jMenu15.add(opArchEjer4);

        jMenuBar1.add(jMenu15);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opScannEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opScannEjer1ActionPerformed
        ACTIVIDAD_01 S1=new ACTIVIDAD_01();
        S1.setVisible(true);
        dispose();
    }//GEN-LAST:event_opScannEjer1ActionPerformed

    private void opScannEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opScannEjer2ActionPerformed
        ACTIVIDAD_02 S2=new ACTIVIDAD_02();
        S2.setVisible(true);
        dispose();
    }//GEN-LAST:event_opScannEjer2ActionPerformed

    private void opScannEjer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opScannEjer5ActionPerformed
        ACTIVIDAD_05 S5=new ACTIVIDAD_05();
        S5.setVisible(true);
        dispose();
    }//GEN-LAST:event_opScannEjer5ActionPerformed

    private void opJopEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opJopEjer2ActionPerformed
        EJERCICIO_J2 J2=new EJERCICIO_J2();
        J2.setVisible(true);
        dispose();
    }//GEN-LAST:event_opJopEjer2ActionPerformed

    private void opJopEjer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opJopEjer3ActionPerformed
        EJERCICIO_J3 J3=new EJERCICIO_J3();
        J3.setVisible(true);
        dispose();
    }//GEN-LAST:event_opJopEjer3ActionPerformed

    private void opJopEjer7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opJopEjer7ActionPerformed
        EJERCICIO_J7 J7=new EJERCICIO_J7();
        J7.setVisible(true);
        dispose();
    }//GEN-LAST:event_opJopEjer7ActionPerformed

    private void opEstrucEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEstrucEjer2ActionPerformed
        EJERCICIO_EC2 EC2=new EJERCICIO_EC2();
        EC2.setVisible(true);
        dispose();
    }//GEN-LAST:event_opEstrucEjer2ActionPerformed

    private void opArregUEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opArregUEjer2ActionPerformed
        EJERCICIO_AU2 AU2=new EJERCICIO_AU2();
        AU2.setVisible(true);
        dispose();
    }//GEN-LAST:event_opArregUEjer2ActionPerformed

    private void opRecuEjer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRecuEjer5ActionPerformed
        EJERCICIO_E R5=new EJERCICIO_E();
        R5.setVisible(true);
        dispose();
    }//GEN-LAST:event_opRecuEjer5ActionPerformed

    private void opArchEjer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opArchEjer3ActionPerformed
        EJERCICIO_AR3 AR3=new EJERCICIO_AR3();
        AR3.setVisible(true);
        dispose();
    }//GEN-LAST:event_opArchEjer3ActionPerformed

    private void opScannEjer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opScannEjer3ActionPerformed
        ACTIVIDAD_03 S3=new ACTIVIDAD_03();
        S3.setVisible(true);
        dispose();
    }//GEN-LAST:event_opScannEjer3ActionPerformed

    private void opScannEjer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opScannEjer4ActionPerformed
        ACTIVIDAD_04 S4=new ACTIVIDAD_04();
        S4.setVisible(true);
        dispose();
    }//GEN-LAST:event_opScannEjer4ActionPerformed

    private void opScannEjer6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opScannEjer6ActionPerformed
        ACTIVIDAD_06 S6=new ACTIVIDAD_06();
        S6.setVisible(true);
        dispose();
    }//GEN-LAST:event_opScannEjer6ActionPerformed

    private void opScannEjer7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opScannEjer7ActionPerformed
        ACTIVIDAD_07 S7=new ACTIVIDAD_07();
        S7.setVisible(true);
        dispose();
    }//GEN-LAST:event_opScannEjer7ActionPerformed

    private void opJopEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opJopEjer1ActionPerformed
        EJERCICIO_J1 J1=new EJERCICIO_J1();
        J1.setVisible(true);
        dispose();
    }//GEN-LAST:event_opJopEjer1ActionPerformed

    private void opJopEjer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opJopEjer4ActionPerformed
        EJERCICIO_J4 J4=new EJERCICIO_J4();
        J4.setVisible(true);
        dispose();
    }//GEN-LAST:event_opJopEjer4ActionPerformed

    private void opJopEjer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opJopEjer5ActionPerformed
        EJERCICIO_J5 J5=new EJERCICIO_J5();
        J5.setVisible(true);
        dispose();
    }//GEN-LAST:event_opJopEjer5ActionPerformed

    private void opJopEjer6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opJopEjer6ActionPerformed
        EJERCICIO_J6 J6=new EJERCICIO_J6();
        J6.setVisible(true);
        dispose();
    }//GEN-LAST:event_opJopEjer6ActionPerformed

    private void opEstrucEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEstrucEjer1ActionPerformed
        EJERCICIO_EC1 EC1=new EJERCICIO_EC1();
        EC1.setVisible(true);
        dispose();
    }//GEN-LAST:event_opEstrucEjer1ActionPerformed

    private void opRepEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRepEjer1ActionPerformed
        EJERCICIO_M1 M1=new EJERCICIO_M1();
        M1.setVisible(true);
        dispose();
    }//GEN-LAST:event_opRepEjer1ActionPerformed

    private void opRepEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRepEjer2ActionPerformed
        EJERCICIO_M2 M2=new EJERCICIO_M2();
        M2.setVisible(true);
        dispose();
    }//GEN-LAST:event_opRepEjer2ActionPerformed

    private void opArregUEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opArregUEjer1ActionPerformed
        EJERCICIO_AU1 AU1=new EJERCICIO_AU1();
        AU1.setVisible(true);
        dispose();
    }//GEN-LAST:event_opArregUEjer1ActionPerformed

    private void opArregBEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opArregBEjer1ActionPerformed
        EJERCICIO_AB1 AB1=new EJERCICIO_AB1();
        AB1.setVisible(true);
        dispose();
    }//GEN-LAST:event_opArregBEjer1ActionPerformed

    private void opArregBEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opArregBEjer2ActionPerformed
        EJERCICIO_AB2 AB2=new EJERCICIO_AB2();
        AB2.setVisible(true);
        dispose();
    }//GEN-LAST:event_opArregBEjer2ActionPerformed

    private void opArregBEjer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opArregBEjer3ActionPerformed
        EJERCICIO_AB3 AB3=new EJERCICIO_AB3();
        AB3.setVisible(true);
        dispose();
    }//GEN-LAST:event_opArregBEjer3ActionPerformed

    private void opArregBEjer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opArregBEjer4ActionPerformed
        EJERCICIO_AB4 AB4=new EJERCICIO_AB4();
        AB4.setVisible(true);
        dispose();
    }//GEN-LAST:event_opArregBEjer4ActionPerformed

    private void opFrameEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFrameEjer1ActionPerformed
        EJERCICIO_JF1 JF1=new EJERCICIO_JF1();
        JF1.setVisible(true);
        dispose();
    }//GEN-LAST:event_opFrameEjer1ActionPerformed

    private void opFrameEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFrameEjer2ActionPerformed
        EJERCICIO_JF2 JF2=new EJERCICIO_JF2();
        JF2.setVisible(true);
        dispose();
    }//GEN-LAST:event_opFrameEjer2ActionPerformed

    private void opGSEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGSEjer1ActionPerformed
        FORMULARIO_Alum_GS1 GS1=new FORMULARIO_Alum_GS1();
        GS1.setVisible(true);
        dispose();
    }//GEN-LAST:event_opGSEjer1ActionPerformed

    private void opGSEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGSEjer2ActionPerformed
        FORMULARIO_Atl_GS2 GS2=new FORMULARIO_Atl_GS2();
        GS2.setVisible(true);
        dispose();
    }//GEN-LAST:event_opGSEjer2ActionPerformed

    private void opGSEjer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGSEjer3ActionPerformed
        FORMULARIO_cli_GS3 GS3=new FORMULARIO_cli_GS3();
        GS3.setVisible(true);
        dispose();
    }//GEN-LAST:event_opGSEjer3ActionPerformed

    private void opCPEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCPEjer1ActionPerformed
        FORMULARIO_Art_CP1 CP1=new FORMULARIO_Art_CP1();
        CP1.setVisible(true);
        dispose();
    }//GEN-LAST:event_opCPEjer1ActionPerformed

    private void opCPEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCPEjer2ActionPerformed
        FORMULARIO_Atl_CP2 CP2=new FORMULARIO_Atl_CP2();
        CP2.setVisible(true);
        dispose();
    }//GEN-LAST:event_opCPEjer2ActionPerformed

    private void opPilaEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPilaEjer1ActionPerformed
        FORMULARIO_PILAS P1=new FORMULARIO_PILAS();
        P1.setVisible(true);
        dispose();
    }//GEN-LAST:event_opPilaEjer1ActionPerformed

    private void opColaEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opColaEjer1ActionPerformed
        FORMULARIO_COLAS C1=new FORMULARIO_COLAS();
        C1.setVisible(true);
        dispose();
    }//GEN-LAST:event_opColaEjer1ActionPerformed

    private void opRecuEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRecuEjer1ActionPerformed
        EJERCICIO_A R1=new EJERCICIO_A();
        R1.setVisible(true);
        dispose();
    }//GEN-LAST:event_opRecuEjer1ActionPerformed

    private void opRecuEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRecuEjer2ActionPerformed
        EJERCICIO_B R2=new EJERCICIO_B();
        R2.setVisible(true);
        dispose();
    }//GEN-LAST:event_opRecuEjer2ActionPerformed

    private void opRecuEjer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRecuEjer3ActionPerformed
        EJERCICIO_C R3=new EJERCICIO_C();
        R3.setVisible(true);
        dispose();
    }//GEN-LAST:event_opRecuEjer3ActionPerformed

    private void opRecuEjer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRecuEjer4ActionPerformed
        EJERCICIO_D R4=new EJERCICIO_D();
        R4.setVisible(true);
        dispose();
    }//GEN-LAST:event_opRecuEjer4ActionPerformed

    private void opArchEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opArchEjer1ActionPerformed
        EJERCICIO_AR1 AR1=new EJERCICIO_AR1();
        AR1.setVisible(true);
        dispose();
    }//GEN-LAST:event_opArchEjer1ActionPerformed

    private void opArchEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opArchEjer2ActionPerformed
        EJERCICIO_AR2 AR2=new EJERCICIO_AR2();
        AR2.setVisible(true);
        dispose();
    }//GEN-LAST:event_opArchEjer2ActionPerformed

    private void opArchEjer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opArchEjer4ActionPerformed
        EJERCICIO_AR4 AR4=new EJERCICIO_AR4();
        AR4.setVisible(true);
        dispose();
    }//GEN-LAST:event_opArchEjer4ActionPerformed

    private void opVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opVolverActionPerformed
        Login_Password up=new Login_Password();
        up.setVisible(true);
        dispose();
    }//GEN-LAST:event_opVolverActionPerformed

    private void opSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSalirActionPerformed
        dispose();
    }//GEN-LAST:event_opSalirActionPerformed

    private void btnJOptionEnunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJOptionEnunActionPerformed
        JOption jo=new JOption();
        jo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnJOptionEnunActionPerformed

    private void btnRecursividadEnunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecursividadEnunActionPerformed
        Recursividad rc=new Recursividad();
        rc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRecursividadEnunActionPerformed

    private void btnScannEnunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScannEnunActionPerformed
        Scanner scan=new Scanner();
        scan.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnScannEnunActionPerformed

    private void btnColasEnunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColasEnunActionPerformed
        Colas cl=new Colas();
        cl.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnColasEnunActionPerformed

    private void btnPilaEnunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilaEnunActionPerformed
        Pilas pl=new Pilas();
        pl.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPilaEnunActionPerformed

    private void btnReporteEnunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteEnunActionPerformed
        Registros rt=new Registros();
        rt.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReporteEnunActionPerformed

    private void btnJFrameEnunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJFrameEnunActionPerformed
        Jframe jf=new Jframe();
        jf.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnJFrameEnunActionPerformed

    private void btnClasesEnunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasesEnunActionPerformed
        Clases cs=new Clases();
        cs.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnClasesEnunActionPerformed

    private void btnArregloUEnunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArregloUEnunActionPerformed
        ArreglosUni au=new ArreglosUni();
        au.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnArregloUEnunActionPerformed

    private void btnArregloBidEnunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArregloBidEnunActionPerformed
        ArreglosBid ab=new ArreglosBid();
        ab.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnArregloBidEnunActionPerformed

    private void btnEstrucConEnunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrucConEnunActionPerformed
        EstructuControl ec=new EstructuControl();
        ec.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEstrucConEnunActionPerformed

    private void btnArchivosEnunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivosEnunActionPerformed
        Archivos ar=new Archivos();
        ar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnArchivosEnunActionPerformed
    
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
            java.util.logging.Logger.getLogger(Apertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apertura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelEje;
    private javax.swing.JButton btnArchivosEnun;
    private javax.swing.JButton btnArregloBidEnun;
    private javax.swing.JButton btnArregloUEnun;
    private javax.swing.JButton btnClasesEnun;
    private javax.swing.JButton btnColasEnun;
    private javax.swing.JButton btnEstrucConEnun;
    private javax.swing.JButton btnJFrameEnun;
    private javax.swing.JButton btnJOptionEnun;
    private javax.swing.JButton btnPilaEnun;
    private javax.swing.JButton btnRecursividadEnun;
    private javax.swing.JButton btnReporteEnun;
    private javax.swing.JButton btnScannEnun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JMenuItem opArchEjer1;
    private javax.swing.JMenuItem opArchEjer2;
    private javax.swing.JMenuItem opArchEjer3;
    private javax.swing.JMenuItem opArchEjer4;
    private javax.swing.JMenuItem opArregBEjer1;
    private javax.swing.JMenuItem opArregBEjer2;
    private javax.swing.JMenuItem opArregBEjer3;
    private javax.swing.JMenuItem opArregBEjer4;
    private javax.swing.JMenuItem opArregUEjer1;
    private javax.swing.JMenuItem opArregUEjer2;
    private javax.swing.JMenuItem opCPEjer1;
    private javax.swing.JMenuItem opCPEjer2;
    private javax.swing.JMenuItem opColaEjer1;
    private javax.swing.JMenuItem opEstrucEjer1;
    private javax.swing.JMenuItem opEstrucEjer2;
    private javax.swing.JMenuItem opFrameEjer1;
    private javax.swing.JMenuItem opFrameEjer2;
    private javax.swing.JMenuItem opGSEjer1;
    private javax.swing.JMenuItem opGSEjer2;
    private javax.swing.JMenuItem opGSEjer3;
    private javax.swing.JMenuItem opJopEjer1;
    private javax.swing.JMenuItem opJopEjer2;
    private javax.swing.JMenuItem opJopEjer3;
    private javax.swing.JMenuItem opJopEjer4;
    private javax.swing.JMenuItem opJopEjer5;
    private javax.swing.JMenuItem opJopEjer6;
    private javax.swing.JMenuItem opJopEjer7;
    private javax.swing.JMenuItem opPilaEjer1;
    private javax.swing.JMenuItem opRecuEjer1;
    private javax.swing.JMenuItem opRecuEjer2;
    private javax.swing.JMenuItem opRecuEjer3;
    private javax.swing.JMenuItem opRecuEjer4;
    private javax.swing.JMenuItem opRecuEjer5;
    private javax.swing.JMenuItem opRepEjer1;
    private javax.swing.JMenuItem opRepEjer2;
    private javax.swing.JMenuItem opSalir;
    private javax.swing.JMenuItem opScannEjer1;
    private javax.swing.JMenuItem opScannEjer2;
    private javax.swing.JMenuItem opScannEjer3;
    private javax.swing.JMenuItem opScannEjer4;
    private javax.swing.JMenuItem opScannEjer5;
    private javax.swing.JMenuItem opScannEjer6;
    private javax.swing.JMenuItem opScannEjer7;
    private javax.swing.JMenuItem opVolver;
    // End of variables declaration//GEN-END:variables

}
