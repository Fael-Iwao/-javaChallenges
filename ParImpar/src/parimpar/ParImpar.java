/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;
import java.util.Scanner;
/**
 *
 * @author DoControl19
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, result;
        System.out.println("Digite o numero");
        num = teclado.nextInt();
        result = num % 2;
        if(result == 0){
            System.out.println("O numero é par");
        }else{
            System.out.println("O numero é impar");
            
        }
                
    }
    
}
