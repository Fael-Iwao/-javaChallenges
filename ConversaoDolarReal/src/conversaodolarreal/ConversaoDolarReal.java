 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaodolarreal;
import java.util.Scanner;
/**
 *
 * @author DoControl19
 */
public class ConversaoDolarReal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float cotacaoDolar, valorDolar, valorReais;
        System.out.println("-=-=-=-=-= Conversão de Dólar em Real =-=-=-=-=-");
        System.out.println("");
        System.out.println("Digite o valor da cotação do Dólar");
        cotacaoDolar = Float.parseFloat(teclado.next().replace(',', '.'));
        System.out.println("Digite a quantidade de dólares");
        valorDolar = Float.parseFloat(teclado.next().replace(',', '.'));
        valorReais = (float) valorDolar * cotacaoDolar;
        System.out.printf("O valor em Reais é %.2f", valorReais);
        
        
    }
    
}
