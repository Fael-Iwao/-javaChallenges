/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadeemdias;
import java.util.Scanner;
/**
 *
 * @author DoControl19
 */
public class IdadeEmDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anos, meses, dias, totalDias;
         System.out.println("-=-=-=-=-= Soma dos dias  =-=-=-=-=-");
        System.out.println("");
        System.out.println("Digite quantos anos você tem");
        anos = teclado.nextInt();
        System.out.println("Digite quantos meses você tem");
        meses = teclado.nextInt();
        System.out.println("Digite quantos dias você tem");
        dias = teclado.nextInt();
        totalDias = (anos *365) + (meses * 30) + dias;
        System.out.printf("Você tem %d dias de vida",totalDias);
    }
    
}
