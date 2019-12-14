
package saidadedados;

import java.util.Scanner;

/**
 *
 * @author Rafael Iwao
 */
public class SaidaDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //entrada e saida de dados
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do Aluno:");
        float nota = teclado.nextFloat();
        System.out.printf("A nota do %s é %.1f \n", nome, nota);
        */
        //convertendo int para string   
        int idade = 30;
        String valor = Integer.toString(idade);
        
        //convertendo string pra int
        String numero = "20";
        int result = Integer.parseInt(numero);
        
        //covertendo float
        String numFloat = "10.5";
        float resultado = Float.parseFloat(numFloat);
          
        
        
              
    }
    
}
