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
public class ContaEspecial extends Contas{
    
    int limite;
    private double multa;
    public void descontar(double multa){
        this.multa=multa;
        double cobranca = this.getSaldo()*this.multa;
        double desconto = (cobranca - this.getSaldo());
        JOptionPane.showMessageDialog(null, "SALDO APÓS COBRANÇA DE MULTA: " +desconto+"."+ "\nVALOR DA MULTA: "+cobranca+"");
    }
    
    @Override
    public void tipoConta(){
         JOptionPane.showMessageDialog(null, "CONTA TIPO ESPECIAL.");
    }
    
}
