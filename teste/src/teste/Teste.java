/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;
import java.util.Scanner;
/**
 *
 * @author DoControl19
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sexo = new Scanner(System.in);
        String desejo;
        System.out.println ("Você quer transar? sim ou não ");
        desejo = sexo.nextLine();
        
        
        if("sim".equals(desejo)){
            System.out.println ("Te vejo no Sábado, às 20h.");
        }else{
            System.out.println ("Te vejo no Sábado, 20h, e faço você querer.");
        }
    }
    
}
