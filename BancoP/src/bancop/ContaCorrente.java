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
public class ContaCorrente extends Conta{
    public ContaCorrente(){
        super();
    }
    
    @Override
    void atualiza(double taxa){
      this.deposita(this.getSaldo() * (taxa * 2));
    }
    
    public void deposita(double deposito){
        super.deposita(deposito - 1.00);
    }
}
