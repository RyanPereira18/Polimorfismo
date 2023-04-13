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
public class ContaPoupança extends Conta{
    ContaPoupança(){
        super();
    }
    
    @Override
    void atualiza(double taxa){
        this.deposita(this.getSaldo() * (taxa * 3));
    }
}
