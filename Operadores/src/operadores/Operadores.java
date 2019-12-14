/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author DoControl19
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int n1 = 9;
//        int n2 = 5;
//        float media = (n1 + n2) / 2;
//        System.out.println("A média é " + media);
//        System.out.println(n1 * n2);
//        System.out.println(n1 / n2);
//        System.out.println(n1 % n2);
//        System.out.println(n1 - n2);
//        System.out.println(n1 ++);
//        System.out.println(n1 --);
//        System.out.println(--n1);
//        System.out.println(++n1);

//        Biblioteca Math
        System.out.println("-=-=-=-=-=-= Raiz Quadrada =-=-=-=-=-=-");
        float n1 = 4f;
        float res = (float) Math.sqrt(4);
        System.out.printf("A Raiz quadrada de %.1f é %.1f",n1, res);
        System.out.println("");
        
        float n3 = 4.4f;
        float n4 = 4.6f;
        //valor absoluto
        System.out.println("-=-=-=-=-=-= Valor Absoluto =-=-=-=-=-=-");
        float arr1 = Math.abs(n3);
        System.out.println(arr1);
        System.out.println("");
        //arredondamento para baixo
        System.out.println("-=-=-=-=-=-= arredondamento para Baixo =-=-=-=-=-=-");
        float arr2 = (float) Math.floor(n3);
        float arr3 = (float) Math.floor(n4);
        System.out.printf("%.1f Arrendondado para Baixo: %.1f \n", n3, arr2);
        System.out.printf("%.1f Arrendondado para Baixo: %.1f \n", n4, arr3);
        System.out.println("");
        //arredondamento para cima
        System.out.println("-=-=-=-=-=-= arredondamento para cima =-=-=-=-=-=-");
        float arr4 = (float) Math.ceil(n3);
        float arr5 = (float) Math.ceil(n4);
        System.out.printf("%.1f arredondado para Cima: %.1f \n", n3, arr4);
        System.out.printf("%.1f arredondado para Cima: %.1f \n", n4, arr5);
        System.out.println("");
        //arredondamento Aritmetico
        System.out.println("-=-=-=-=-=-= arredondamento aritmeico =-=-=-=-=-=-");
        float arr6 = (float) Math.round(n3);
        float arr7 = (float) Math.round(n4);
        System.out.printf("%.1f arredondado: %.1f \n", n3, arr6);
        System.out.printf("%.1f arredondado: %.1f \n", n4, arr7);
        System.out.println("");
        

        //gerando numeros aleatórios
        
        double aleatorio = Math.random(); // gera um float de um numero de 0 a 1;
        System.out.println("-=-=-=-=-= random classico =-=-=-=-=-");
        System.out.println(aleatorio);
        System.out.println("");
        
        //Gerando Range de numeros Aleatorios;
        System.out.println("-=-=-=-=-= random especificos =-=-=-=-=-");
        int numeroAleatorio1 = (int) (5 + aleatorio * (10-5)); //gerando um numero entre 5 e 10
        int numeroAleatorio2 = (int) (1 + aleatorio * (10-1)); //gerando um numero entre 1 e 10
        int numeroAleatorio3 = (int) (1 + aleatorio * (1000-1)); //gerando um numero entre 1 e 1000
        System.out.println("Um numero entre 5 e 10: " + numeroAleatorio1);
        System.out.println("Um numero entre 1 e 10: " + numeroAleatorio2);
        System.out.println("Um numero entre 1 e 1000: " + numeroAleatorio3);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //Operadores Ternarios
        int num1, num2, resultado;
        num1 = 4;
        num2 = 5;
        resultado = (num1 > num2) ? num1:num2;
        System.out.println("-=-=-=-=-= Operador Ternario =-=-=-=-=-");
        System.out.println("Resultado com o operador Ternário é : " + resultado);
        System.out.println("");
                
                
    }
    
}
