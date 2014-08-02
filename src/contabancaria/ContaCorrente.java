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
public class ContaCorrente extends Conta {

    Cliente clientecc;

    public ContaCorrente(Cliente clientecc) {
        this.clientecc = clientecc;
    }

    public ContaCorrente() {
    }

    public void atualiza(double taxa) {
        if (clientecc.getTipoCliente().getNome().equals(TipoCliente.UNIVERSITARIO.getNome())) {
            this.saldo += this.saldo * taxa * 2;
        } else if (clientecc.getTipoCliente().getNome().equals(TipoCliente.CORPORATIVO.getNome())) {
            this.saldo += this.saldo * taxa * 3;
        } else if (clientecc.getTipoCliente().getNome().equals(TipoCliente.EXCLUSIVO.getNome())) {
            this.saldo += this.saldo * taxa * 4;
        }
    }

    public void deposita(double conta) {
        this.saldo += conta - ContaPoupanca.VALOR_DESCONTO_DEPOSITO;
         

    }

    @Override
    public double getBonificacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
