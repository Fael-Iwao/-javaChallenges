/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendafrutas;
import java.util.Scanner;
/**
 *
 * @author DoControl19
 */
public class VendaFrutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int kgMorango, kgMaca, totalKg;
        float precoMorango, precoMaca, total;
        float desc, totalMaca, totalMorango;
        System.out.println("-=-=-=-=-= Venda de frutas =-=-=-=-=-");
        System.out.println("quantos quilos de maçã você vai comprar?");
        kgMaca = teclado.nextInt();
        System.out.println("e agora, quantos kilos de morango você quer?");
        kgMorango = teclado.nextInt();
        totalKg = kgMorango + kgMaca;
        if(kgMorango <= 5){
           precoMorango = (float) 2.50;
        }else{
          precoMorango = (float) 2.20;  
        }

        if(kgMaca <= 5){
           precoMaca = (float) 1.80;
        }else{
          precoMaca = (float) 1.50;  
        }


        total = (precoMaca * kgMaca) + (precoMorango * kgMorango);
       // System.out.println(total);
        System.out.println(precoMaca * kgMaca);
        //System.out.println(precoMorango * kgMorango);
        if((total > 25) || (totalKg > 8)){
            System.out.println("Legal! você obteve um desconto de 10% !!");
            desc = (float) ((float) total * 0.10);
            total = total - desc;
        }
        System.out.println("Preco Morango:" + precoMorango);
        System.out.println("Preco Maca:" + precoMaca);
        System.out.printf("O Valor A pagar por %d kg de maçãs e \n"
                + "%d kg de morangos é R$ %.2f \n", kgMaca, kgMorango, total);
    }
    
}
