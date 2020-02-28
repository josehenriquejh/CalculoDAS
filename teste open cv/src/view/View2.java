/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
//import static javafx.application.Application.launch;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
/**
 *
 * @author Administrador
 */
public class View2 extends javax.swing.JFrame {
    
    int ano1;
    int ano2;
    static double jan1;
    static double fev1;
    static double mar1;
    static double abr1;
    static double mai1;
    static double jun1;
    static double jul1;
    static double ago1;
    static double set1;
    static double out1;
    static double nov1;
    static double dez1;
    static double jan2;
    static double fev2;
    static double mar2;
    static double abr2;
    static double mai2;
    static double jun2;
    static double jul2;
    static double ago2;
    static double set2;
    static double out2;
    static double nov2;
    static double dez2;
    static double rb12;
    /**
     * Creates new form View2
     */
    
    class MyTextField extends JTextField{
    	 public MyTextField(){
    		 super();
    		 this.addKeyListener(new KeyAdapter() {
    			 public void keyPressed(KeyEvent evt) {
    			 int key = evt.getKeyCode();
    			 if (key == KeyEvent.VK_ENTER)
    			 ((JTextField)evt.getSource()).transferFocus();
    			 }});
    	 }
     }	
    
   
    
    public View2() {
        initComponents();
        setResizable(false);
        setTitle("Especificar Receitas Mês a Mês (Somente as 12 Últimas Serão Contabilizadas)");
        preencher();
        
    }
    public void salvar() {
    try {
    jan1 = Double.parseDouble(txtjan1.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ jan1 = 0;} try {
    fev1 = Double.parseDouble(txtfev1.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ fev1 = 0;} try {
    mar1 = Double.parseDouble(txtmar1.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ mar1 = 0;} try {
    abr1 = Double.parseDouble(txtabr1.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ abr1 = 0;} try {
    mai1 = Double.parseDouble(txtmai1.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ mai1 = 0;} try {
    jun1 = Double.parseDouble(txtjun1.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ jun1 = 0;} try {
    jul1 = Double.parseDouble(txtjul1.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ jul1 = 0;} try {
    ago1 = Double.parseDouble(txtago1.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ ago1 = 0;} try {
    set1 = Double.parseDouble(txtset1.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ set1 = 0;} try {
    out1 = Double.parseDouble(txtout1.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ out1 = 0;} try {
    nov1 = Double.parseDouble(txtnov1.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ nov1 = 0;} try {
    dez1 = Double.parseDouble(txtdez1.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ dez1 = 0;} try {
    jan2 = Double.parseDouble(txtjan2.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ jan2 = 0;} try {
    fev2 = Double.parseDouble(txtfev2.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ fev2 = 0;} try {
    mar2 = Double.parseDouble(txtmar2.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ mar2 = 0;} try {
    abr2 = Double.parseDouble(txtabr2.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ abr2 = 0;} try {
    mai2 = Double.parseDouble(txtmai2.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ mai2 = 0;} try {
    jun2 = Double.parseDouble(txtjun2.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ jun2 = 0;} try {
    jul2 = Double.parseDouble(txtjul2.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ jul2 = 0;} try {
    ago2 = Double.parseDouble(txtago2.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ ago2 = 0;} try {
    set2 = Double.parseDouble(txtset2.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ set2 = 0;} try {
    out2 = Double.parseDouble(txtout2.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ out2 = 0;} try {
    nov2 = Double.parseDouble(txtnov2.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ nov2 = 0;} try {
    dez2 = Double.parseDouble(txtdez2.getText().toString().replace(".","").replace(",","."));} catch (Exception E){ dez2 = 0;} 
    
    }
    public void preencher(){
                
           
        if (jan1 != 0) {txtjan1.setText(String.valueOf(View.format(jan1)));} else txtjan1.setText("");
        if (fev1 != 0) {txtfev1.setText(String.valueOf(View.format(fev1)));} else txtfev1.setText("");
        if (mar1 != 0) {txtmar1.setText(String.valueOf(View.format(mar1)));} else txtmar1.setText("");
        if (abr1 != 0) {txtabr1.setText(String.valueOf(View.format(abr1)));} else txtabr1.setText("");
        if (mai1 != 0) {txtmai1.setText(String.valueOf(View.format(mai1)));} else txtmai1.setText("");
        if (jun1 != 0) {txtjun1.setText(String.valueOf(View.format(jun1)));} else txtjun1.setText("");
        if (jul1 != 0) {txtjul1.setText(String.valueOf(View.format(jul1)));} else txtjul1.setText("");
        if (ago1 != 0) {txtago1.setText(String.valueOf(View.format(ago1)));} else txtago1.setText("");
        if (set1 != 0) {txtset1.setText(String.valueOf(View.format(set1)));} else txtset1.setText("");
        if (out1 != 0) {txtout1.setText(String.valueOf(View.format(out1)));} else txtout1.setText("");
        if (nov1 != 0) {txtnov1.setText(String.valueOf(View.format(nov1)));} else txtnov1.setText("");
        if (dez1 != 0) {txtdez1.setText(String.valueOf(View.format(dez1)));} else txtdez1.setText("");
        if (jan2 != 0) {txtjan2.setText(String.valueOf(View.format(jan2)));} else txtjan2.setText("");
        if (fev2 != 0) {txtfev2.setText(String.valueOf(View.format(fev2)));} else txtfev2.setText("");
        if (mar2 != 0) {txtmar2.setText(String.valueOf(View.format(mar2)));} else txtmar2.setText("");
        if (abr2 != 0) {txtabr2.setText(String.valueOf(View.format(abr2)));} else txtabr2.setText("");
        if (mai2 != 0) {txtmai2.setText(String.valueOf(View.format(mai2)));} else txtmai2.setText("");
        if (jun2 != 0) {txtjun2.setText(String.valueOf(View.format(jun2)));} else txtjun2.setText("");
        if (jul2 != 0) {txtjul2.setText(String.valueOf(View.format(jul2)));} else txtjul2.setText("");
        if (ago2 != 0) {txtago2.setText(String.valueOf(View.format(ago2)));} else txtago2.setText("");
        if (set2 != 0) {txtset2.setText(String.valueOf(View.format(set2)));} else txtset2.setText("");
        if (out2 != 0) {txtout2.setText(String.valueOf(View.format(out2)));} else txtout2.setText("");
        if (nov2 != 0) {txtnov2.setText(String.valueOf(View.format(nov2)));} else txtnov2.setText("");
        if (dez2 != 0) {txtdez2.setText(String.valueOf(View.format(dez2)));} else txtdez2.setText("");
        
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtjan1 = new MyTextField();
        txtfev1 = new MyTextField();
        txtmar1 = new MyTextField();
        txtabr1 = new MyTextField();
        txtmai1 = new MyTextField();
        txtjun1 = new MyTextField();
        txtjul1 = new MyTextField();
        txtago1 = new MyTextField();
        txtset1 = new MyTextField();
        txtout1 = new MyTextField();
        txtnov1 = new MyTextField();
        txtdez1 = new MyTextField();
        jLabel11 = new javax.swing.JLabel();
        txtano1 = new MyTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtjan2 = new MyTextField();
        txtfev2 = new MyTextField();
        txtmar2 = new MyTextField();
        txtabr2 = new MyTextField();
        txtmai2 = new MyTextField();
        txtjun2 = new MyTextField();
        txtjul2 = new MyTextField();
        txtago2 = new MyTextField();
        txtset2 = new MyTextField();
        txtout2 = new MyTextField();
        txtnov2 = new MyTextField();
        txtdez2 = new MyTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtano2 = new MyTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btncalc = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        txtrb12 = new MyTextField();
        jLabel40 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        jLabel14.setText("Julho:");

        jLabel15.setText("Novembro:");

        jLabel16.setText("Dezembro:");

        jLabel17.setText("Junho:");

        jLabel18.setText("Maio:");

        jLabel19.setText("Outubro:");

        jLabel20.setText("Agosto:");

        jLabel21.setText("Ano:");

        jLabel22.setText("Janeiro:");

        jLabel23.setText("Fevereiro:");

        jLabel24.setText("Março:");

        jLabel25.setText("Abril:");

        jLabel26.setText("Setembro:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Janeiro:");

        jLabel2.setText("Fevereiro:");

        jLabel3.setText("Março:");

        jLabel4.setText("Abril:");

        jLabel5.setText("Maio:");

        jLabel6.setText("Junho:");

        jLabel7.setText("Dezembro:");

        jLabel8.setText("Novembro:");

        jLabel9.setText("Julho:");

        jLabel10.setText("Agosto:");

        jLabel12.setText("Outubro:");

        txtjan1.setFocusCycleRoot(true);
        txtjan1.setNextFocusableComponent(txtfev1);
        txtjan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjan1ActionPerformed(evt);
            }
        });

        txtfev1.setNextFocusableComponent(txtmar1);

        txtmar1.setNextFocusableComponent(txtabr1);

        txtabr1.setNextFocusableComponent(txtmai1);

        txtmai1.setNextFocusableComponent(txtjun1);

        txtjun1.setNextFocusableComponent(txtjul1);

        txtjul1.setNextFocusableComponent(txtago1);

        txtago1.setNextFocusableComponent(txtset1);

        txtset1.setNextFocusableComponent(txtout1);

        txtout1.setNextFocusableComponent(txtnov1);

        txtnov1.setNextFocusableComponent(txtdez1);

        txtdez1.setNextFocusableComponent(txtjan2);

        jLabel11.setText("Setembro:");

        txtano1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtano1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Ano:");

        txtjan2.setNextFocusableComponent(txtfev2);

        txtfev2.setNextFocusableComponent(txtmar2);

        txtmar2.setNextFocusableComponent(txtabr2);

        txtabr2.setNextFocusableComponent(txtmai2);

        txtmai2.setNextFocusableComponent(txtjun2);

        txtjun2.setNextFocusableComponent(txtjul2);

        txtjul2.setNextFocusableComponent(txtago2);

        txtago2.setNextFocusableComponent(txtset2);

        txtset2.setNextFocusableComponent(txtout2);

        txtout2.setNextFocusableComponent(txtnov2);

        txtnov2.setNextFocusableComponent(txtdez2);

        txtdez2.setNextFocusableComponent(btncalc);

        jLabel27.setText("Julho:");

        jLabel28.setText("Novembro:");

        jLabel29.setText("Dezembro:");

        jLabel30.setText("Junho:");

        jLabel31.setText("Maio:");

        jLabel32.setText("Outubro:");

        jLabel33.setText("Agosto:");

        jLabel34.setText("Ano:");

        txtano2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtano2ActionPerformed(evt);
            }
        });

        jLabel35.setText("Janeiro:");

        jLabel36.setText("Fevereiro:");

        jLabel37.setText("Março:");

        jLabel38.setText("Abril:");

        jLabel39.setText("Setembro:");

        btncalc.setText("Calcular RB12");
        btncalc.setNextFocusableComponent(txtrb12);
        btncalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcActionPerformed(evt);
            }
        });

        btnsair.setText("Fechar Aba");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        txtrb12.setNextFocusableComponent(btnsair);
        txtrb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrb12ActionPerformed(evt);
            }
        });

        jLabel40.setText("RB12:");

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setText("Consultar Rb12");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel1))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtmai1)
                                            .addComponent(txtabr1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtfev1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                                    .addComponent(txtjan1)))
                                            .addComponent(txtmar1)
                                            .addComponent(txtjun1))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtano1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnov1)
                                            .addComponent(txtout1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtago1)
                                                    .addComponent(txtjul1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtset1)
                                            .addComponent(txtdez1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel37)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel35))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtmai2)
                                            .addComponent(txtabr2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtfev2)
                                                    .addComponent(txtjan2)))
                                            .addComponent(txtmar2)
                                            .addComponent(txtjun2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtano2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel27)
                                                .addComponent(jLabel32)
                                                .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel39))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnov2)
                                            .addComponent(txtout2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtago2)
                                                    .addComponent(txtjul2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtset2)
                                            .addComponent(txtdez2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btncalc)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtrb12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(btnsair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtano2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtjul2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtago2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel33))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtset2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel39))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtout2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel32))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtnov2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel28))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtdez2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel29)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel27)
                                            .addComponent(txtjan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel35))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtfev2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel36))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtmar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel37))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtabr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel38))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtmai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel31))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtjun2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel30)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtano1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtjul1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtago1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtset1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtout1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtnov1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtdez1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(txtjan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtfev1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtmar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtabr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtmai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtjun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator7)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncalc)
                    .addComponent(btnsair)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtrb12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40))
                    .addComponent(jButton1))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btncalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcActionPerformed
        salvar();
    
        if (dez2 != 0){
            rb12 = dez2 + nov2 + out2 + set2 + ago2 + jul2 + jun2 + mai2 + abr2 + mar2 + fev2 + jan2;
        } else if (nov2 != 0) {
            rb12 = nov2 + out2 + set2 + ago2 + jul2 + jun2 + mai2 + abr2 + mar2 + fev2 + jan2 + dez1;
        } else if (out2 != 0) {
            rb12 = out2 + set2 + ago2 + jul2 + jun2 + mai2 + abr2 + mar2 + fev2 + jan2 + dez1 + nov1;
        } else if (set2 != 0) {
            rb12 = set2 + ago2 + jul2 + jun2 + mai2 + abr2 + mar2 + fev2 + jan2 + dez1 + nov1 + out1;
        } else if (ago2 != 0) {
            rb12 = ago2 + jul2 + jun2 + mai2 + abr2 + mar2 + fev2 + jan2 + dez1 + nov1 + out1 + set1;
        } else if (jul2 != 0) {
            rb12 = jul2 + jun2 + mai2 + abr2 + mar2 + fev2 + jan2 + dez1 + nov1 + out1 + set1 + ago1;
        } else if (jun2 != 0) {
            rb12 = jun2 + mai2 + abr2 + mar2 + fev2 + jan2 + dez1 + nov1 + out1 + set1 + ago1 + jul1;
        } else if (mai2 != 0) {
            rb12 = mai2 + abr2 + mar2 + fev2 + jan2 + dez1 + nov1 + out1 + set1 + ago1 + jul1 + jun1;
        } else if (abr2 != 0) {
            rb12 = abr2 + mar2 + fev2 + jan2 + dez1 + nov1 + out1 + set1 + ago1 + jul1 + jun1 + mai1;
        } else if (mar2 != 0) {
            rb12 = mar2 + fev2 + jan2 + dez1 + nov1 + out1 + set1 + ago1 + jul1 + jun1 + mai1 + abr1;
        } else if (fev2 != 0) {
            rb12 = fev2 + jan2 + dez1 + nov1 + out1 + set1 + ago1 + jul1 + jun1 + mai1 + abr1 + mar1;
        } else if (jan2 != 0) {
            rb12 = jan2 + dez1 + nov1 + out1 + set1 + ago1 + jul1 + jun1 + mai1 + abr1 + mar1 + fev1;
        } else {
            rb12 = dez1 + nov1 + out1 + set1 + ago1 + jul1 + jun1 + mai1 + abr1 + mar1 + fev1 + jan1;
        }
        
        View.rb12 = rb12;
        
                
        try { txtano1ActionPerformed(evt);
        } catch (Exception E){
        }
        try { txtano2ActionPerformed(evt);
        } catch (Exception E){
        }
        txtrb12.setText(String.valueOf(View.format(rb12)));
        
       
       
        
    }//GEN-LAST:event_btncalcActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        this.dispose();
        new View().setVisible(true);
        
        
    }//GEN-LAST:event_btnsairActionPerformed

    private void txtano1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtano1ActionPerformed
       try { ano1 = Integer.parseInt(txtano1.getText().toString());
       } catch (Exception E) {
       //JOptionPane.showMessageDialog(null, "Ano Inválido");
       }
       ano2 = ano1 + 1;
       txtano2.setText(String.valueOf(ano2));
    }//GEN-LAST:event_txtano1ActionPerformed

    private void txtano2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtano2ActionPerformed
        try { ano2 = Integer.parseInt(txtano2.getText().toString());
        } catch (Exception E) {
        //JOptionPane.showMessageDialog(null, "Ano Inválido");
        }
        ano1 = ano2 - 1;
        txtano1.setText(String.valueOf(ano1));
    }//GEN-LAST:event_txtano2ActionPerformed

    private void txtjan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjan1ActionPerformed
        
    }//GEN-LAST:event_txtjan1ActionPerformed

    private void txtrb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrb12ActionPerformed
       
    }//GEN-LAST:event_txtrb12ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       new View().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            //new View5();//.setVisible(true);
            View4.testlaunch();
        } catch (Exception ex) {
            Logger.getLogger(View2.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new View2().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalc;
    private javax.swing.JButton btnsair;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField txtabr1;
    private javax.swing.JTextField txtabr2;
    private javax.swing.JTextField txtago1;
    private javax.swing.JTextField txtago2;
    private javax.swing.JTextField txtano1;
    private javax.swing.JTextField txtano2;
    private javax.swing.JTextField txtdez1;
    private javax.swing.JTextField txtdez2;
    private javax.swing.JTextField txtfev1;
    private javax.swing.JTextField txtfev2;
    private javax.swing.JTextField txtjan1;
    private javax.swing.JTextField txtjan2;
    private javax.swing.JTextField txtjul1;
    private javax.swing.JTextField txtjul2;
    private javax.swing.JTextField txtjun1;
    private javax.swing.JTextField txtjun2;
    private javax.swing.JTextField txtmai1;
    private javax.swing.JTextField txtmai2;
    private javax.swing.JTextField txtmar1;
    private javax.swing.JTextField txtmar2;
    private javax.swing.JTextField txtnov1;
    private javax.swing.JTextField txtnov2;
    private javax.swing.JTextField txtout1;
    private javax.swing.JTextField txtout2;
    private javax.swing.JTextField txtrb12;
    private javax.swing.JTextField txtset1;
    private javax.swing.JTextField txtset2;
    // End of variables declaration//GEN-END:variables
}
