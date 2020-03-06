/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;

public class controler {
    
//view.View view = new view.View();

//static double rb12;
//int anexo;
double t1; 
public static double aliquota = 0;
public double aliquota1 = 0;
public double aliqret = 0;
public double valor3 = 0;


    public Double calculaAliquota(double rb12, int anexo){
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
    
    public Double calculaRet(double valor2, double rb12, int anexo){
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
      if (valor3 < 0){ valor3 = valor3 * -1;} //deixar valor 3 positivo
      return this.valor3;
    }

    public Double teste(double t1){
    t1 = t1/2;
    return t1;
    }
}

