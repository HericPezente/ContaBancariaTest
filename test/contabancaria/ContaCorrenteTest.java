/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contabancaria;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public class ContaCorrenteTest {
    
    private ContaCorrente conta;
    //public ContaCorrenteTest() {
    //}

    //@Test
    //public void testSomeMethod() {
    //}
    
    @Before
    public void inicializar(){
        Cliente c=new Cliente("Epaminongas", TipoCliente.UNIVERSITARIO);
        conta= new ContaCorrente(c);
        conta.deposita(1000);
    }
    
    
    @Test
    public void naoDeveAtualizarSaldoTaxaNegativa(){
        conta.atualiza(-0.01);
        Assert.assertEquals(1019.898,conta.getSaldo(),0);
    }
     /*   
    @Test
    public void deveAtualizarSaldo(){
        conta.atualiza(0.50);
        Assert.assertEquals(2000,conta.getSaldo(),0);
    }
    
    @Test
    public void deveDepositarValor(){
        conta.deposita(1000);
        Assert.assertEquals(2000,conta.getSaldo(),0);
    }
    
    @Test
    public void deveSacarValor(){
        conta.sacar(100);
        Assert.assertEquals(899.9,conta.getSaldo(),0);
    }
   
    
    @Test
    public void deveAtualizarSaldo(){
        conta.atualiza(0.01);
        Assert.assertEquals(1019.898,conta.getSaldo(),0);
    }
    
    
    @Test
    public void naodeveDepositarValorNegativo(){
        conta.deposita(200);
        Assert.assertEquals(1199.8,conta.getSaldo(),0);
    }
    
    
    @Test
    public void naoDeveSacarValorNegativo(){
        conta.sacar(200);
        Assert.assertEquals(799.9,conta.getSaldo(),0);
        Assert.
    }
    */
    
    
}