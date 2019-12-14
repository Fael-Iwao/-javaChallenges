/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postocombustivel;

import java.util.Scanner;

/**
 *
 * @author DoControl19
 */
public class PostoCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char combustivel;
        float litros, result;
        System.out.println("++++++++ Posto de combustivel ++++++++");
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("Escolha o tipo de combutivel");
        System.out.println("A - Alcool");
        System.out.println("G - Gasolina");
        System.out.println("----------------------------------");
        System.out.println("");
        System.out.println("Quantos litros vocÊ deseja abastecer?");
        litros = teclado.nextFloat();
        System.out.println("Agora, qual o tipo de combustivel?");
        combustivel =  teclado.next().charAt(0);
        switch (combustivel) {
           case 'A':
                if(litros <= 20){
                    result = (litros *2.9f) - ((litros * 2.9f) * 0.04f);
                    System.out.printf("O valor a ser pago por "+litros +" litros é R$ %.2f", result);
                    System.out.println("Obteve um desconto de R$" + (litros * 2.9f) * 0.04f);
                }else{
                    result = (litros *2.9f) - ((litros * 2.9f) * 0.06f);
                    System.out.printf("O valor a ser pago por "+litros +" litros é R$ %.2f", result);
                    System.out.println("Obteve um desconto de R$" + (litros * 2.9f) * 0.06f);
                }
                break;
            case 'G':
                if(litros <= 20){
                    result = (litros *3.3f) - ((litros * 3.3f) * 0.03f);
                    System.out.printf("O valor a ser pago por "+litros +" litros é R$ %.2f", result);
                    System.out.println("Obteve um desconto de R$" + (litros * 3.3f) * 0.03f);
                }else{
                    result = (litros *3.3f) - ((litros * 3.3f) * 0.05f);
                    System.out.printf("O valor a ser pago por "+litros +" litros é R$ %.2f", result);
                    System.out.println("Obteve um desconto de R$" + (litros * 3.3f) * 0.05f);
                }
                break;
            default:
                System.out.println("Este não é um combustivel Válido!");

        }
    }
    
}
