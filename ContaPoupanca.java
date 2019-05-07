/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb1;

import javax.swing.JOptionPane;

/**
 *
 * @author amand
 */
public class ContaPoupanca extends Contas{

    private double taxa;
    
    public void reajustar(double taxa){
        this.taxa = taxa;
        double reajuste = ((this.getSaldo()*this.taxa));
        JOptionPane.showMessageDialog(null, "REAJUSTE REALIZADO COM SUCESSO!\nNOVO SALDO: "+reajuste);
    }
    public  void reajustar(){
        double reajuste;
        reajuste = (this.getSaldo()*0.1);
        JOptionPane.showMessageDialog(null, "REAJUSTE REALIZADO COM A TAXA PADRÃO(10%): " +reajuste);
        
    }
    
    @Override
    public void tipoConta(){
        JOptionPane.showMessageDialog(null, "CONTA TIPO POUPANÇA");
    }          
}
