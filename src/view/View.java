package view;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.*;
import view.View2;

public  class View extends javax.swing.JFrame {
    static double rb12;
    public static int anexo;

    control.controler controler = new control.controler();

    double aliquota = 0;
    double aliquota1 = 0;
    double valor1 = 0;
    double valor2 = 0;
    double imposto = 0;
    double valor3 = 0;
    double aliqret = 0;

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

    class MyJButton extends JButton{
    	 public MyJButton(){
    		 super();
    		 this.addKeyListener(new KeyAdapter() {
    			 public void keyPressed(KeyEvent evt) {
    			 int key = evt.getKeyCode();
    			 if (key == KeyEvent.VK_ENTER)
    			 ((JButton)evt.getSource()).transferFocus();
    			 }});


    	 }
     }

     public void atualizar(){
        if (rb12 != 0){
        txt1.setText(String.valueOf(format(rb12)));
            }
        }

    public View() {
        initComponents();
        setResizable(false);
        setTitle("Cálculo de Alíquota do DAS");
        atualizar();
    }


    public static String format(double x) {
    DecimalFormat df = new DecimalFormat("#,###,##0.00");
    return df.format(x);
    }



/*     public Double calculaAliquota(double rb12){
    if (anexo == 1){
                if (rb12 < 180000){
                aliquota = 0.04;
                } else if (rb12 < 360000){
                aliquota = ((rb12 * 0.073) - 5940)/rb12;
                } else if (rb12 < 720000) {
                aliquota = ((rb12 * 0.095) - 13860)/rb12;
                } else if (rb12 < 1800000) {
                aliquota = ((rb12 * 0.107) - 22500)/rb12;
                } else if (rb12 < 3600000){
                aliquota = ((rb12 * 0.143) - 87300)/rb12;
                } else if (rb12 < 4800000){
                aliquota = ((rb12 * 0.19) - 378000)/rb12;
                } else {
                JOptionPane.showMessageDialog(null, "Valor Maior que o Limite do Simples Nacional");
                }

        } else if (anexo == 2){
            if (rb12 < 180000){
                aliquota = 0.045;
                } else if (rb12 < 360000){
                aliquota = ((rb12 * 0.078) - 5940)/rb12;
                } else if (rb12 < 720000) {
                aliquota = ((rb12 * 0.1) - 13860)/rb12;
                } else if (rb12 < 1800000) {
                aliquota = ((rb12 * 0.112) - 22500)/rb12;
                } else if (rb12 < 3600000){
                aliquota = ((rb12 * 0.147) - 85500)/rb12;
                } else if (rb12 < 4800000){
                aliquota = ((rb12 * 0.3) - 720000)/rb12;
                } else {
                JOptionPane.showMessageDialog(null, "Valor Maior que o Limite do Simples Nacional");
                }
        } else if (anexo == 3){
            if (rb12 < 180000){
                aliquota = 0.06;
                } else if (rb12 < 360000){
                aliquota = ((rb12 * 0.112) - 9360)/rb12;
                } else if (rb12 < 720000) {
                aliquota = ((rb12 * 0.135) - 17640)/rb12;
                } else if (rb12 < 1800000) {
                aliquota = ((rb12 * 0.16) - 35640)/rb12;
                } else if (rb12 < 3600000){
                aliquota = ((rb12 * 0.21) - 125640)/rb12;
                } else if (rb12 < 4800000){
                aliquota = ((rb12 * 0.33) - 648000)/rb12;
                } else {
                JOptionPane.showMessageDialog(null, "Valor Maior que o Limite do Simples Nacional");
                }
        } else if (anexo == 4){
            if (rb12 < 180000){
                aliquota = 0.045;
                } else if (rb12 < 360000){
                aliquota = ((rb12 * 0.09) - 8100)/rb12;
                } else if (rb12 < 720000) {
                aliquota = ((rb12 * 0.102) - 12420)/rb12;
                } else if (rb12 < 1800000) {
                aliquota = ((rb12 * 0.14) - 39780)/rb12;
                } else if (rb12 < 3600000){
                aliquota = ((rb12 * 0.22) - 183780)/rb12;
                } else if (rb12 < 4800000){
                aliquota = ((rb12 * 0.33) - 828000)/rb12;
                } else {
                JOptionPane.showMessageDialog(null, "Valor Maior que o Limite do Simples Nacional");
                }
        } else if (anexo == 5){
            if (rb12 < 180000){
                aliquota = 0.155;
                } else if (rb12 < 360000){
                aliquota = ((rb12 * 0.18) - 4500)/rb12;
                } else if (rb12 < 720000) {
                aliquota = ((rb12 * 0.195) - 9900)/rb12;
                } else if (rb12 < 1800000) {
                aliquota = ((rb12 * 0.205) - 17100)/rb12;
                } else if (rb12 < 3600000){
                aliquota = ((rb12 * 0.23) - 62100)/rb12;
                } else if (rb12 < 4800000){
                aliquota = ((rb12 * 0.305) - 540000)/rb12;
                } else {
                JOptionPane.showMessageDialog(null, "Valor Maior que o Limite do Simples Nacional /n Digite ''.'' caso precise tratar valores decimais");
                }
       } else if (anexo == 6){
        if (rb12 < 180000){
                aliquota = 0.0535;
                aliquota1 = 0.04 * 0.34;
                } else if (rb12 < 360000){
                aliquota = ((rb12 * 0.112) - 9360)/rb12;
                aliquota1 = ((rb12 * 0.073) - 5940)/rb12;
                aliquota1 = aliquota1 * 0.34;
                aliquota = aliquota - (aliquota * 0.32) + aliquota1;
                } else if (rb12 < 720000) {
                aliquota = ((rb12 * 0.135) - 17640)/rb12;
                aliquota1 = ((rb12 * 0.095) - 13860)/rb12;
                aliquota1 = aliquota1 * 0.335;
                aliquota = aliquota - (aliquota * 0.325) + aliquota1;
                } else if (rb12 < 1800000) {
                aliquota = ((rb12 * 0.16) - 35640)/rb12;
                aliquota1 = ((rb12 * 0.107) - 22500)/rb12;
                aliquota1 = aliquota1 * 0.335;
                aliquota = aliquota - (aliquota * 0.325) + aliquota1;
                } else if (rb12 < 3600000){
                aliquota = ((rb12 * 0.21) - 125640)/rb12;
                aliquota1 = ((rb12 * 0.143) - 87300)/rb12;
                aliquota1 = aliquota1 * 0.335;
                aliquota = aliquota - (aliquota * 0.335) + aliquota1;
                } else if (rb12 < 4800000){
                aliquota = ((rb12 * 0.33) - 648000)/rb12;
                aliquota1 = ((rb12 * 0.19) - 378000)/rb12;
                } else {
                JOptionPane.showMessageDialog(null, "Valor Maior que o Limite do Simples Nacional");
                }
        } else if (anexo == 7){
                if (rb12 < 180000){
                aliquota = 0.0535;
                aliquota1 = 0.04 * 0.34;
                } else if (rb12 < 360000){
                aliquota = ((rb12 * 0.112) - 9360)/rb12;
                aliquota1 = ((rb12 * 0.073) - 5940)/rb12;
                aliquota1 = aliquota1 * 0.34;
                aliquota = aliquota - (aliquota * 0.32) + aliquota1;
                } else if (rb12 < 720000) {
                aliquota = ((rb12 * 0.135) - 17640)/rb12;
                aliquota1 = ((rb12 * 0.095) - 13860)/rb12;
                aliquota1 = aliquota1 * 0.335;
                aliquota = aliquota - (aliquota * 0.325) + aliquota1;
                } else if (rb12 < 1800000) {
                aliquota = ((rb12 * 0.16) - 35640)/rb12;
                aliquota1 = ((rb12 * 0.107) - 22500)/rb12;
                aliquota1 = aliquota1 * 0.335;
                aliquota = aliquota - (aliquota * 0.325) + aliquota1;
                } else if (rb12 < 3600000){
                aliquota = ((rb12 * 0.21) - 125640)/rb12;
                aliquota1 = ((rb12 * 0.143) - 87300)/rb12;
                aliquota1 = aliquota1 * 0.335;
                aliquota = aliquota - (aliquota * 0.335) + aliquota1;
                } else if (rb12 < 4800000){
                aliquota = ((rb12 * 0.33) - 648000)/rb12;
                aliquota1 = ((rb12 * 0.19) - 378000)/rb12;
                } else {
                JOptionPane.showMessageDialog(null, "Valor Maior que o Limite do Simples Nacional");
                }
        }
    return aliquota;    
    }

    public Double calculaRet(double valor2){
       if (anexo == 1){
                if (rb12 < 180000){
                valor3 = valor2 * 0.66;
                aliqret = ( 100 - (100 * 0.66)) * aliquota;
                } else if (rb12 < 360000){
                valor3 = valor2 * 0.66;
                aliqret = (100 - (100 * 0.66)) * aliquota;
                } else if (rb12 < 720000) {
                valor3 = valor2 * 0.665 ;
                aliqret = ( 100 - (100 * 0.665)) * aliquota;
                } else if (rb12 < 1800000) {
                valor3 = valor2 * 0.665 ;
                aliqret = ( 100 - (100 * 0.665)) * aliquota;
                } else if (rb12 < 3600000){
                valor3 = valor2 * 0.665;
                aliqret = ( 100 - (100 * 0.665)) * aliquota;
                } else if (rb12 < 4800000){
                valor3 = valor2;
                aliqret = 0;
                JOptionPane.showMessageDialog(null,"O valor da retenção de ICMS é zerado, pois na 6a faixa (3.600.000,00 à 4.800.000,00) a alíquota do ICMS na repartição de tributos é zerada");
                } else {
                JOptionPane.showMessageDialog(null, "Valor Maior que o Limite do Simples Nacional");
                }

        } else if (anexo == 2){
            if (rb12 < 180000){
                valor3 = valor2 * 0.68;
                aliqret = (100 - (100 * 0.68)) * aliquota;
                } else if (rb12 < 360000){
                valor3 = valor2 * 0.68;
                aliqret = (100 - (100 * 0.68)) * aliquota;
                } else if (rb12 < 720000) {
                valor3 = valor2 * 0.68;
                aliqret = (100 - (100 * 0.68)) * aliquota;
                } else if (rb12 < 1800000) {
                valor3 = valor2 * 0.68;
                aliqret = (100 - (100 * 0.68)) * aliquota;
                } else if (rb12 < 3600000){
                valor3 = valor2 * 0.68;
                aliqret = (100 - (100 * 0.68)) * aliquota;
                } else if (rb12 < 4800000){
                valor3 = valor2;
                aliqret = 0;
                JOptionPane.showMessageDialog(null,"O valor da retenção de ICMS é zerado, pois na 6a faixa (3.600.000,00 à 4.800.000,00) a alíquota do ICMS na repartição de tributos é zerada");
                }
           } else if (anexo == 3){
            if (rb12 < 180000){
                valor3 = valor2 * 0.665;
                aliqret = (100 - (100 * 0.665)) * aliquota;
                } else if (rb12 < 360000){
                valor3 = valor2 * 0.68;
                aliqret = (100 - (100 * 0.68)) * aliquota;
                } else if (rb12 < 720000) {
                valor3 = valor2 * 0.675;
                aliqret = (100 - ( 100 * 0.675)) * aliquota;
                } else if (rb12 < 1800000) {
                valor3 = valor2 * 0.675;
                aliqret = (100 - ( 100 * 0.675)) * aliquota;
                } else if (rb12 < 3600000){
                valor3 = valor2 * 0.665;
                aliqret = (100 - (100 * 0.665)) * aliquota;
                } else if (rb12 < 4800000){
                valor3 = valor2;
                aliqret = 0;
                JOptionPane.showMessageDialog(null,"O valor da retenção de ISS é zerado, pois na 6a faixa (3.600.000,00 à 4.800.000,00) a alíquota do ISS na repartição de tributos é zerada");
                } else {
                JOptionPane.showMessageDialog(null, "Valor Maior que o Limite do Simples Nacional");
                }

        } else if (anexo == 4){
            if (rb12 < 180000){
                valor3 = valor2 * 0.555;
                aliqret = (100 - (100 * 0.555)) * aliquota;
                } else if (rb12 < 360000){
                valor3 = valor2 * 0.6;
                aliqret = (100 - (100 * 0.6)) * aliquota;
                } else if (rb12 < 720000) {
                valor3 = valor2 * 0.6;
                aliqret = (100 - (100 * 0.6)) * aliquota;
                } else if (rb12 < 1800000) {
                valor3 = valor2 * 0.6;
                aliqret = (100 - (100 * 0.6)) * aliquota;
                } else if (rb12 < 3600000){
                valor3 = valor2 * 0.6 ;
                aliqret = (100 - (100 * 0.6)) * aliquota;
                } else if (rb12 < 4800000){
                valor3 = valor2;
                aliqret = 0;
                JOptionPane.showMessageDialog(null,"O valor da retenção de ISS é zerado, pois na 6a faixa (3.600.000,00 à 4.800.000,00) a alíquota do ISS na repartição de tributos é zerada");
                }

        } else if (anexo == 5){
            if (rb12 < 180000){
                valor3 = valor2 * 0.86;
                aliqret = (100 - (100 * 0.86)) * aliquota;
                } else if (rb12 < 360000){
                valor3 = valor2 * 0.83;
                aliqret = (100 - (100 * 0.83)) * aliquota;
                } else if (rb12 < 720000) {
                valor3 = valor2 * 0.81;
                aliqret = (100 - (100 * 0.81)) * aliquota;
                } else if (rb12 < 1800000) {
                valor3 = valor2 * 0.79;
                aliqret = (100 - (100 * 0.79)) * aliquota;
                } else if (rb12 < 3600000){
                valor3 = valor2 * 0.765;
                aliqret = (100 - (100 * 0.765)) * aliquota;
                } else if (rb12 < 4800000){
                valor3 = valor2;
                aliqret = 0;
                JOptionPane.showMessageDialog(null,"O valor da retenção de ISS é zerado, pois na 6a faixa (3.600.000,00 à 4.800.000,00) a alíquota do ISS na repartição de tributos é zerada");
                }
       } else if (anexo == 6){
            if (rb12 < 180000){
                //valor3 = valor2 * 0.665;
                valor3 = valor2 - (0.34 * aliquota1);
                aliqret = 100 * aliquota1;
                } else if (rb12 < 360000){
                valor3 = valor2 - (0.34 * aliquota1);
                aliqret = 100 * aliquota1;
                } else if (rb12 < 720000) {
                valor3 = valor2 - (0.335 * aliquota1);
                aliqret = 100 * aliquota1;
                } else if (rb12 < 1800000) {
                valor3 = valor2 - (0.335 * aliquota1);
                aliqret = 100 * aliquota1;
                } else if (rb12 < 3600000){
                valor3 = valor2 - (0.335 * aliquota1);
                aliqret = 100 * aliquota1;
                } else if (rb12 < 4800000){
                valor3 = valor2;
                aliqret = 0;
                JOptionPane.showMessageDialog(null,"O valor da retenção de ISS é zerado, pois na 6a faixa (3.600.000,00 à 4.800.000,00) a alíquota do ISS na repartição de tributos é zerada");
                } else {
                JOptionPane.showMessageDialog(null, "Valor Maior que o Limite do Simples Nacional");
                }
       } else if (anexo == 7) {
            if (rb12 < 180000){
                valor3 = valor2 - (0.34 * aliquota1);
                aliqret = 100 * aliquota1;
                } else if (rb12 < 360000) {
                valor3 = valor2 - (0.34 * aliquota1);
                aliqret = 100 * aliquota1;
                } else if (rb12 < 720000) {
                valor3 = valor2 - (0.335 * aliquota1);
                aliqret = 100 * aliquota1;
                } else if (rb12 < 1800000) {
                valor3 = valor2 - (0.335 * aliquota1);
                aliqret = 100 * aliquota1;
                } else if (rb12 < 3600000) {
                valor3 = valor2 - (0.335 * aliquota1);
                aliqret = 100 * aliquota1;
                } else if (rb12 < 4800000) {
                valor3 = valor2;
                aliqret = 0;
                JOptionPane.showMessageDialog(null,"O valor da retenção de ISS é zerado, pois na 6a faixa (3.600.000,00 à 4.800.000,00) a alíquota do ISS na repartição de tributos é zerada");
                } else {
                JOptionPane.showMessageDialog(null, "Valor Maior que o Limite do Simples Nacional");
                }}
      return valor3;
    }
*/
    public void calculaImposto (){
    try{
            valor1 = Double.parseDouble(txt3.getText().toString().replace(".","").replace(",","."));
           }
        catch (Exception E){
           }

        try{
            valor2 = Double.parseDouble(txt4.getText().toString().replace(".","").replace(",","."));
           }
         catch (Exception E){
           }
        
        if (aliquota != 0){
            if(rb12 != 0){
        if (valor1 + valor2 < 4800000){
        
        if (anexo == 6 || anexo == 7){
        txt5.setText(String.valueOf(format((valor1 * aliquota) + ((controler.calculaRet(valor2, rb12, anexo) * aliquota) - (valor2 * controler.aliquota1))))); 
        txt6.setText(String.valueOf(format(valor2 * controler.aliquota1)));
        } else {
        txt5.setText(String.valueOf(format(valor1 * aliquota + controler.calculaRet(valor2, rb12, anexo) * aliquota)));
        txt6.setText(String.valueOf(format(valor2 * aliquota - controler.valor3 * aliquota)));}}
        
        else {
            JOptionPane.showMessageDialog(null,"Valor Maior que o Limite do Simples Nacional");
            txt5.setText("0,00");
            txt6.setText("0,00");
        }
        valor1 = 0;
        valor2 = 0;
        valor3 = 0;}
        } else {
        JOptionPane.showMessageDialog(null, "Alíquota Zerada");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        txt1 = new MyTextField();
        btn1 = new MyJButton();
        lvl5 = new javax.swing.JLabel();
        txt2 = new MyTextField();
        cb1 = new javax.swing.JComboBox();
        lvl6 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        txt3 = new MyTextField();
        txt4 = new MyTextField();
        txt5 = new MyTextField();
        lbl2 = new javax.swing.JLabel();
        lvl7 = new javax.swing.JLabel();
        btn2 = new MyJButton();
        lbl3 = new javax.swing.JLabel();
        txt6 = new MyTextField();
        lbl8 = new javax.swing.JLabel();
        btnsair = new MyJButton();
        btnreceitas = new MyJButton();
        cb2 = new javax.swing.JCheckBox();
        txt7 = new javax.swing.JTextField();
        lbl4 = new javax.swing.JLabel();

        jLabel4.setText("Ultimos 12 Meses");

        jTextField1.setText("0,00");

        jTextField2.setText("0,00");

        jTextField3.setText("0,00");

        jTextField4.setText("0,00");

        jTextField5.setText("0,00");

        jTextField6.setText("0,00");

        jTextField7.setText("0,00");

        jTextField8.setText("0,00");

        jTextField9.setText("0,00");

        jTextField10.setText("0,00");

        jTextField11.setText("0,00");

        jTextField12.setText("0,00");

        jTextField13.setText("0,00");

        jTextField14.setText("0,00");

        jTextField15.setText("0,00");

        jTextField16.setText("0,00");

        jTextField17.setText("0,00");

        jTextField18.setText("0,00");

        jTextField19.setText("0,00");

        jTextField20.setText("0,00");

        jTextField21.setText("0,00");

        jTextField22.setText("0,00");

        jTextField23.setText("0,00");

        jTextField24.setText("0,00");

        jLabel6.setText("Ano:");

        jLabel7.setText("Ano:");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel4)
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(jTextField11)
                            .addComponent(jTextField12)
                            .addComponent(jTextField7)
                            .addComponent(jTextField9)
                            .addComponent(jTextField8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(jTextField20)
                            .addComponent(jTextField21)
                            .addComponent(jTextField22)
                            .addComponent(jTextField17)
                            .addComponent(jTextField24)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(jTextField14)
                            .addComponent(jTextField19)
                            .addComponent(jTextField23)
                            .addComponent(jTextField16)
                            .addComponent(jTextField15)))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addGap(0, 55, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
                            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jFrame1Layout.createSequentialGroup()
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jFrame1Layout.createSequentialGroup()
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78))
                                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jFrame1Layout.createSequentialGroup()
                                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jFrame1Layout.createSequentialGroup()
                                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(58, 58, 58))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        btn1.setText("Calcular Alíquota");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn1KeyPressed(evt);
            }
        });

        lvl5.setText("Alíquota:");

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Anexo I", "Anexo II", "Anexo III", "Anexo IV", "Anexo V", "Transporte", "Comunicação" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        lvl6.setText("Receita nos últimos 12 Meses:");

        lbl1.setText("Venda Sem Substituição:");

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        txt5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt5.setText("0,00");
        txt5.setEnabled(false);
        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });

        lbl2.setText("Venda Com Substituição:");

        lvl7.setText("Total:");

        btn2.setText("Calcular DAS");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn2KeyPressed(evt);
            }
        });

        lbl3.setText("Valor do ICMS Retido:");

        txt6.setText("0,00");
        txt6.setEnabled(false);

        lbl8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl8.setText("Valores na Competência:");

        btnsair.setText("Sair");
        btnsair.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnsairFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnsairFocusLost(evt);
            }
        });
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        btnreceitas.setText("Especificar Receitas");
        btnreceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreceitasActionPerformed(evt);
            }
        });

        cb2.setText("Venda + Prestação de Serviços");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        txt7.setEnabled(false);
        txt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt7ActionPerformed(evt);
            }
        });

        lbl4.setText("Alíquota do ICMS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb2)
                            .addComponent(lbl8)
                            .addComponent(lbl1)
                            .addComponent(lbl3)
                            .addComponent(lvl6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                        .addComponent(txt6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                        .addComponent(lbl4, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl2)
                                    .addComponent(lvl7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnsair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))))
                            .addComponent(btnreceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lvl5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lvl6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1))
                .addGap(18, 18, 18)
                .addComponent(btnreceitas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(lvl5)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(lbl8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(lbl2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lvl7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsair))
                .addGap(18, 18, 18)
                .addComponent(cb2)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        try{
            rb12 =  Double.parseDouble(txt1.getText().replace(".","").replace(",","."));
        }
        catch (Exception E){
        }

        anexo = cb1.getSelectedIndex() + 1;
        aliquota = controler.calculaAliquota(rb12, anexo);
        txt1.setText(String.valueOf(format(rb12)));
        txt2.setText(String.valueOf(format(aliquota * 100) + "%"));

    }//GEN-LAST:event_btn1ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
    }//GEN-LAST:event_txt1ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
       try{
        rb12 =  Double.parseDouble(txt1.getText().toString().replace(".","").replace(",","."));
        }
        catch (Exception E){
        }
        anexo = cb1.getSelectedIndex() + 1;
        aliquota = controler.calculaAliquota(rb12, anexo);
        txt2.setText(String.valueOf(format(aliquota * 100) + "%"));

        if (anexo <= 2){
        lbl1.setText("Venda Sem Substituição:");
        lbl2.setText("Venda Com Substituição:");
        lbl3.setText("Valor do ICMS Retido:");
        lbl4.setText("Alíquota do ICMS:");
        }
        if (anexo == 3 || anexo == 4 || anexo == 5) {
        lbl1.setText("Sem retenção de ISS:");
        lbl2.setText("Com retenção de ISS:");
        lbl3.setText("Valor do ISS Retido:");
        lbl4.setText("Alíquota do ISS");
        } 
        if (anexo == 6){
        lbl1.setText("Sem retenção de ISS:");    
        lbl2.setText("Com retenção de ISS:");    
        lbl3.setText("Valor do ISS Retido:");    
        lbl4.setText("Alíquota do ISS:");  
        }
        if (anexo == 7){
        lbl1.setText("Sem retenção de ICMS:");
        lbl2.setText("Com retenção de ICMS:");
        lbl3.setText("Valor do ICMS Retido:");
        lbl4.setText("Alíquota do ICMS:");
        }
        calculaImposto();
        txt7.setText(String.valueOf(format(controler.aliqret)+ "%"));
    }//GEN-LAST:event_cb1ActionPerformed
    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed

    }//GEN-LAST:event_txt3ActionPerformed
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        try{
            rb12 =  Double.parseDouble(txt1.getText().toString().replace(".","").replace(",","."));
        }
        catch (Exception E){
        }
        anexo = cb1.getSelectedIndex() + 1;
        controler.calculaAliquota(rb12, anexo);
        txt2.setText(String.valueOf(format(aliquota * 100) + "%"));
        calculaImposto();
        txt7.setText(String.valueOf(format(controler.aliqret)+ "%"));


    }//GEN-LAST:event_btn2ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
    }//GEN-LAST:event_txt5ActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        System.exit(0);

    }//GEN-LAST:event_btnsairActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void btnreceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreceitasActionPerformed
        this.dispose();
        new View2().setVisible(true);

    }//GEN-LAST:event_btnreceitasActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        this.dispose();
        new View3().setVisible(true);
    }//GEN-LAST:event_cb2ActionPerformed

    private void txt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7ActionPerformed

    private void btn1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn1KeyPressed
        InputMap im = btn1.getInputMap();
        im.put( KeyStroke.getKeyStroke( "ENTER" ), "pressed" );
        im.put( KeyStroke.getKeyStroke( "released ENTER" ), "released" );
    }//GEN-LAST:event_btn1KeyPressed

    private void btn2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn2KeyPressed
        InputMap im = btn2.getInputMap();
        im.put( KeyStroke.getKeyStroke( "ENTER" ), "pressed" );
        im.put( KeyStroke.getKeyStroke( "released ENTER" ), "released" );
    }//GEN-LAST:event_btn2KeyPressed

    private void btnsairFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnsairFocusGained
        btnsair.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_btnsairFocusGained

    private void btnsairFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnsairFocusLost
        btnsair.setFont(new java.awt.Font("Tahoma", 0, 11));
    }//GEN-LAST:event_btnsairFocusLost
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new View().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btnreceitas;
    private javax.swing.JButton btnsair;
    private javax.swing.JComboBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lvl5;
    private javax.swing.JLabel lvl6;
    private javax.swing.JLabel lvl7;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    // End of variables declaration//GEN-END:variables
        }
