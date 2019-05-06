/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb1;

import javax.swing.JOptionPane;

/**
 *
 * @author amanda
 */
public class Contas {
    private String nome;
    private int numero;
    private double saldo;

    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo+valor;
    }
    
    boolean sacar(double valor){
        if(this.saldo>=valor){
            this.saldo-=valor;
            return(true);
        }else{
            return (false);
        }
    }
    
    boolean transferir(int conta1, int conta2, double valor){
        Contas c1 = null;//para a conta q vai transferir
            if(valor <= this.getSaldo()){
            this.saldo -= valor;
            c1.saldo+=valor;
            return(true);
        }else{
            return(false);
            }
    }
    
    public void tipoConta(){
        JOptionPane.showMessageDialog(null, "CONTA TIPO CORRENTE.");
    }
    
}
