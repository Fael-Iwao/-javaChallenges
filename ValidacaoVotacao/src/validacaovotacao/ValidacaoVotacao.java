/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacaovotacao;
import java.util.Scanner;
/**
 *
 * @author DoControl19
 */
public class ValidacaoVotacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anoNascimento;
        String Result;
        System.out.println("Digite o ano do seu nascimento");
        anoNascimento = teclado.nextInt();
        Result = ((2019 - anoNascimento) >= 16) ? "Apto a votar" : "Não pode Votar";
        System.out.println(Result);
       
    }
    
}
