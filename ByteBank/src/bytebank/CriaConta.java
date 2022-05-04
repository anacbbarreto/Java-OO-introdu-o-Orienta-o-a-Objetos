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
public class CriaConta {
    
        public static void main(String[] args) {
<<<<<<< HEAD
   
         Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200; 
        System.out.println(primeiraConta.saldo); 
=======
  Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
>>>>>>> b7202a9a992861b85a02aca26fb7a6a7f792bf0e

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

<<<<<<< HEAD
        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;
=======
        Conta segundaConta = primeiraConta;
        segundaConta.saldo = 50;
>>>>>>> b7202a9a992861b85a02aca26fb7a6a7f792bf0e

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);

        segundaConta.agencia = 146;
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

            System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta está na agencia " + segundaConta.agencia);

        if(primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        } else {
            System.out.println("contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
