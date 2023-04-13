/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancop;

/**
 *
 * @author lucyv
 */
public class Cliente {
     private String nome; 
        private String endereco;
        private String cpf;
    
        public void setNome(String nome){ 
            this.nome = nome;
        }
        
        public String getNome(){
            return this.nome;
        }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
