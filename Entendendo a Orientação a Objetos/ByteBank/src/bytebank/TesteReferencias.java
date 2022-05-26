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
public class TesteReferencias {

    public static void main(String [] args) { 
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);
    }
}