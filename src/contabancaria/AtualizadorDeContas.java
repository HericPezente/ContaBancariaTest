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
public class AtualizadorDeContas {
    	private double saldoTotal=0;

	private double selic;

    

	public AtualizadorDeContas(double selic){
		this.selic=selic;
	}

	public void roda(Conta c){
	
		imprimeSaldoAnterior(c);
		
		c.atualiza(this.getSelic());

		imprimeSaldoAtual(c);

		saldoTotal += c.getSaldo();

	}

        

        public void imprimeSaldoAnterior(Conta c) {
            System.out.println("Saldo anterior:"+c.getSaldo());
        }
        
        public void imprimeSaldoAtual(Conta c) {
            System.out.println("Saldo final:"+c.getSaldo());
        }

	public double getSaldoTotal(){
		return this.saldoTotal;

	}	

	public void setSaldoTotal(double saldoTotal){
		this.saldoTotal += saldoTotal;
	}
        
        public double getSelic() {
        return selic;
    }
        
        
}
