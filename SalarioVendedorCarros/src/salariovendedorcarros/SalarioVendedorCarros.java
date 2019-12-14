/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salariovendedorcarros;
import java.util.Scanner;
/**
 *
 * @author Rafael Iwao
 */
public class SalarioVendedorCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidadeCarros;
        String nomeVendedor;
        float porcentagemComissao, totalVendas, valorFinal, valorComissao;

        System.out.println(">>>>>>>>>>> Calculo de salario do vendedor <<<<<<<<<<<");
        System.out.println("");
        System.out.println("Digite o Nome do(a) vendedor(a):");
        nomeVendedor = teclado.nextLine();
        System.out.println("Digite a quantidade de carros Vendidos");
        quantidadeCarros = teclado.nextInt();
        System.out.println("Digite o valor total de vendas no mês");
        totalVendas = teclado.nextFloat();
        valorComissao = quantidadeCarros * 50f;
        porcentagemComissao = totalVendas * 0.05f;
        valorFinal = porcentagemComissao + valorComissao + 500f;
        System.out.printf("O Salário de %s desse mês é de R$%.2f\n",nomeVendedor, valorFinal);
        
        
        
    }
    
}
