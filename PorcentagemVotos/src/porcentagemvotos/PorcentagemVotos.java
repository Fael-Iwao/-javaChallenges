/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcentagemvotos;
import java.util.Scanner;
/**
 *
 * @author DoControl19
 */
public class PorcentagemVotos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int votosTotal, votosBranco, votosNulo, votosValidos;
        float percentualBranco, percentualNulo, percentualValido;
        
        System.out.println("-=-=-=-=-= Soma dos quadrados =-=-=-=-=-");
        System.out.println("");
        System.out.println("Digite o total de votos");
        votosTotal = teclado.nextInt();
        System.out.println("Digite o total de votos em branco");
        votosBranco = teclado.nextInt();
        System.out.println("Digite o total de votos nulos");
        votosNulo = teclado.nextInt();
        System.out.println("Digite o total de votos válidos");
        votosValidos = teclado.nextInt();
        
        percentualBranco = (float) (votosBranco * 100) / votosTotal;
        percentualNulo = (float) (votosNulo * 100) / votosTotal;
        percentualValido = (float) (votosValidos * 100) / votosTotal;
        System.out.printf("O total de votos é %d, sendo que desses votos \n ", votosTotal);
        System.out.println("Votos Nulos: "+percentualNulo + "%" );
        System.out.println("Votos Brancos: "+percentualBranco + "%" );
        System.out.println("Votos válidos: "+percentualValido + "%" );
       
    }
    
}
