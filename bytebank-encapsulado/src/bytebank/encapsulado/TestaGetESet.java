/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank.encapsulado;

/**
 *
 * @author user
 */
public class TestaGetESet {
    public static void main(String[] args) { 
        Conta conta = new Conta();
        conta.setNumero(1337);
        System.out.println(conta.getNumero()); 
    }
}