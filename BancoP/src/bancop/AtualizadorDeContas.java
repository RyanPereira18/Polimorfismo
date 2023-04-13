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
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    
    public double getSaldoTotal() {
        return saldoTotal;
    }

    
    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    
    public double getSelic() {
        return selic;
    }

    
    public void setSelic(double selic) {
        this.selic = selic;
    }
    
    AtualizadorDeContas(double selic){
        this.selic = selic;
    }
    
    void roda(Conta c){
         System.out.println("Saldo anterior: " + c.getSaldo());
        c.setSaldo((c.getSaldo() + (c.getSaldo() * this.getSelic())));
        System.out.println("Saldo atualizado: " + c.getSaldo());
        this.setSaldoTotal(this.getSaldoTotal() + c.getSaldo());
    }
}
