/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contabancaria;

/**
 *
 * @author i03
 */
public  abstract class Conta {
    
    protected double saldo;
    
    /**
     Obtem o saldo da conta
     */

    public double getSaldo() {
        return this.saldo;
    }
    
    public void deposita(double vlr_deposito){
        
       	this.saldo +=vlr_deposito;
    }

    public void sacar(double vlr_sacar){
    
	this.saldo -= vlr_sacar;
    }

    /** public abstract void atualiza(double taxa){
        
	this.saldo += this.saldo * taxa;
    }*/
    
    public abstract  void atualiza(double taxa);
    
    public abstract double getBonificacao();
    
    public void mostra(){
        System.out.println(this.getSaldo());
        System.out.println(this.getBonificacao());
        
    }
    
    
}
