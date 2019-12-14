/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldocliente;
import java.util.Scanner;
/**
 *
 * @author DoControl19
 */
public class SaldoCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float saldoAtual, debito, credito, result;
        String numConta;
        System.out.println("######### Saldo Cliente #########");
        System.out.println("");
        System.out.println("Entre com o número da conta");
        numConta = teclado.nextLine();
        System.out.println("Entre com o saldo Atual");
        saldoAtual = teclado.nextFloat();
        System.out.println("Entre com o débito da conta");
        debito = teclado.nextFloat();
        System.out.println("Entre com o crédito da conta");
        credito = teclado.nextFloat();
        
        result = saldoAtual - debito + credito;
        System.out.printf("o Saldo da conta %s é de R$ %.2f \n", numConta, result);
        
    }
    
}
