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
public class TestaMetodo {
  public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
  contaDoPaulo.saldo = 100;
    contaDoPaulo.deposita(50);

       System.out.println(contaDoPaulo.saldo);
  }
}