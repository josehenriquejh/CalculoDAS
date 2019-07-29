
package view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class View3 extends javax.swing.JFrame {
 
    View View = new View();
    static double rb12;
    static double aliquota;
    static int anexo;
    double valor1;
    double valor2;
    double valor3;
    double valor4;
    double valor5;
    double aliq1;
    double aliq2;
    double ret1;
    double ret2;
    double aliqret1 = 0;
    double aliqret2 = 0;
    
    
    public View3() {
        
        initComponents();
        //setDefaultCloseOperation(View3.DISPOSE_ON_CLOSE);
        setTitle("Cálculo de Anexos Diferentes (V. + P.S.)");
        setResizable(false);
    }
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
    
    public void calculaImposto (){
        try{ 
            valor1 = Double.parseDouble(txt2.getText().toString().replace(".","").replace(",","."));
           }            
        catch (Exception E){
            valor1 = 0;
           }
         
        try{
            valor2 = Double.parseDouble(txt3.getText().toString().replace(".","").replace(",","."));
        } catch (Exception E){
            valor2 = 0;
        }
        try{ 
            valor3 = Double.parseDouble(txt6.getText().toString().replace(".","").replace(",","."));
           } 
         catch (Exception E){
             valor3 = 0;
           }
        
        try{ 
            valor4 = Double.parseDouble(txt7.getText().toString().replace(".","").replace(",","."));
           } 
         catch (Exception E){
             valor4 = 0;
           }
        txt10.setText(String.valueOf(View.format(View.rb12)));
        txt11.setText(String.valueOf(View.format(aliqret1)+ "%"));    
        txt12.setText(String.valueOf(View.format(aliqret2)+ "%"));    
        
        if (View.aliquota != 0){
            if(View.rb12 != 0){
        if (valor1 + valor2 + valor3 + valor4 < 4800000){ 
        txt9.setText(String.valueOf(View.format((valor1 * aliq1) + ((valor2 * ret1) * aliq1) + (valor3 * aliq2) + ((valor4 * ret2) * aliq2))));
        txt4.setText(String.valueOf(View.format((valor2 * aliq1) - ((valor2 * ret1) * aliq1))));
        txt8.setText(String.valueOf(View.format((valor4 * aliq2) - ((valor4 * ret2) * aliq2))));
        
        } else {
            JOptionPane.showMessageDialog(null,"Valor Maior que o Limite do Simples Nacional");
            
        }
        } else {
            JOptionPane.showConfirmDialog(null,"");
            }
        } else {
        JOptionPane.showMessageDialog(null, "Receita dos Ultimos 12 Meses Zerada, Volte e Preencha.");
        } 
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new MyTextField();
        txt5 = new MyTextField();
        cb1 = new javax.swing.JComboBox();
        cb2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt6 = new MyTextField();
        txt7 = new MyTextField();
        txt2 = new MyTextField();
        txt3 = new MyTextField();
        jLabel9 = new javax.swing.JLabel();
        txt9 = new MyTextField();
        txt4 = new MyTextField();
        jLabel10 = new javax.swing.JLabel();
        txt8 = new MyTextField();
        jLabel11 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        txt10 = new MyTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt11 = new MyTextField();
        txt12 = new MyTextField();
        btnsair = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel4.setText("jLabel4");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Alíquota:");

        txt1.setNextFocusableComponent(txt2);

        txt5.setNextFocusableComponent(txt6);
        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Anexo I", "Anexo II", "Anexo III", "Anexo IV", "Anexo V" }));
        cb1.setNextFocusableComponent(txt1);
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Anexo I", "Anexo II", "Anexo III", "Anexo IV", "Anexo V" }));
        cb2.setNextFocusableComponent(txt5);
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Alíquota:");

        jLabel3.setText("Venda Sem Substituição:");

        jLabel5.setText("Venda Com Substituição:");

        jLabel7.setText("Venda Sem Substituição:");

        jLabel8.setText("Venda Com Substituição:");

        txt6.setNextFocusableComponent(txt7);

        txt7.setNextFocusableComponent(txt8);

        txt2.setFocusCycleRoot(true);
        txt2.setNextFocusableComponent(txt3);

        txt3.setNextFocusableComponent(txt4);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Valor Total:");

        txt4.setEnabled(false);
        txt4.setNextFocusableComponent(cb2);

        jLabel10.setText("Valor do ICMS Retido:");

        txt8.setEnabled(false);
        txt8.setNextFocusableComponent(btn1);

        jLabel11.setText("Valor do ICMS  Retido:");

        btn1.setText("Calcular DAS");
        btn1.setNextFocusableComponent(txt9);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        txt10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt10.setEnabled(false);

        jLabel12.setText("Receita dos Últimos 12 Meses");

        jLabel13.setText("Alíquota do ICMS:");

        jLabel14.setText("Alíquota do ICMS:");

        txt11.setEnabled(false);

        txt12.setEnabled(false);

        btnsair.setText("Fechar Aba");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn1)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt9, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(34, 34, 34)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addGap(11, 11, 11)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(jLabel9)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnsair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        
    }//GEN-LAST:event_txt5ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        View.anexo = cb2.getSelectedIndex() + 1; 
        View.calculaAliquota(View.rb12);
        txt5.setText(String.valueOf(View.format(View.aliquota * 100) + "%"));
        aliq2 = View.aliquota;
        ret2 = (((View.calculaRet(100))/100));
        aliqret2 = View.aliqret;
        txt10.setText(String.valueOf(View.format(View.rb12)));
        
       if (View.anexo <= 2){
        jLabel7.setText("Venda Sem Substituição:");
        jLabel8.setText("Venda Com Substituição:");
        jLabel11.setText("Valor do ICMS Retido:");
        jLabel14.setText("Alíquota do ICMS:");
        }
        if (View.anexo >= 3) {
        jLabel7.setText("Sem Retenção de ISS:");
        jLabel8.setText("Com Retenção de ISS:");
        jLabel11.setText("Valor do ISS Retido:");
        jLabel14.setText("Alíquota do ISS:");}
        
        
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        View.anexo = cb1.getSelectedIndex() + 1; 
        View.calculaAliquota(View.rb12);
        txt1.setText(String.valueOf(View.format(View.aliquota * 100) + "%"));
        aliq1 = View.aliquota;
        ret1 = (((View.calculaRet(100))/100));
        aliqret1 = View.aliqret;
        txt10.setText(String.valueOf(View.format(View.rb12)));
        
        
        if (View.anexo <= 2){
        jLabel3.setText("Venda Sem Substituição:");
        jLabel5.setText("Venda Com Substituição:");
        jLabel10.setText("Valor do ICMS Retido:");
        jLabel13.setText("Alíquota do ICMS:");
        }
        if (View.anexo >= 3) {
        jLabel3.setText("Sem Retenção de ISS:");
        jLabel5.setText("Com Retenção de ISS:");
        jLabel10.setText("Valor do ISS Retido:");
        jLabel13.setText("Alíquota do ISS:");}
    }//GEN-LAST:event_cb1ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        calculaImposto();
        
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        this.dispose();
        new View().setVisible(true);
        
    }//GEN-LAST:event_btnsairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try { txt10.setText(String.valueOf(View.format(View.rb12))); } catch (Exception E){}
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       new View().setVisible(true);
    }//GEN-LAST:event_formWindowClosing
   
    
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
            java.util.logging.Logger.getLogger(View3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new View3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btnsair;
    private javax.swing.JComboBox cb1;
    private javax.swing.JComboBox cb2;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
