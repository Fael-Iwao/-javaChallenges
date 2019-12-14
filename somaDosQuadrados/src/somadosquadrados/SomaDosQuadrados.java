/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somadosquadrados;
import java.util.Scanner;
/**
 *
 * @author DoControl19
 */
public class SomaDosQuadrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1, n2, n3, result;
        System.out.println("-=-=-=-=-= Soma dos quadrados =-=-=-=-=-");
        System.out.println("");
        System.out.println("Digite o primeiro número");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo número");
        n2 = teclado.nextInt();
        System.out.println("Digite o terceiro número");
        n3 = teclado.nextInt();
        n1 = (float) Math.pow(n1,2);
        n2 = (float) Math.pow(n2,2);
        n3 = (float) Math.pow(n3,2);
        result = n1 + n2 + n3;
        System.out.printf("O Resultado da soma dos quadrados desses valores é %.0f \n", result);
    }
    
}
