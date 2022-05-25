/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank.composto;

/**
 *
 * @author user
 */
  public class Conta { 
    private double saldo ;
    int agencia; 
    int numero; 
    Cliente titular = new Cliente();
    
    
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

  public boolean saca(double valor) { 
    if(this.saldo >= valor) { 
        this.saldo -= valor; 
        return true;
    } else {
        return false;
    }
}
  
  public boolean transfere(double valor, Conta destino) { 
        if(this.saldo >= valor) { 
            this.saldo -= valor; 
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
  }
  
  
    public double pegaSaldo() { 
        return this.saldo;
    }
  }

