/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank;

/**
 *
 * @author user
 */
public class Conta { 
 
    double saldo;
    int agencia;
    int numero;
    String titular;
    
    
 public void deposita(double valor) {
        this.saldo = this.saldo + valor; 
    }
    
}