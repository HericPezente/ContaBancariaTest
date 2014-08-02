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
public enum TipoCliente {
    
    UNIVERSITARIO("Uni"),
    CORPORATIVO("Cor"),
    EXCLUSIVO("Exc");
    
    private String nome;
    
    TipoCliente(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
