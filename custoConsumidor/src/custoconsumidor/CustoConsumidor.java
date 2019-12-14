
package custoconsumidor;
import java.util.Scanner;
/**
 *
 * @author Rafael Iwao
 */
public class CustoConsumidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float custoFabrica, custoConsumidor, porcentagemDistribuidor, porcentagemImposto;
        Scanner teclado = new Scanner(System.in);
        System.out.println(">>>>>>>>>>> Custo ao Consumidor <<<<<<<<<<<");
        System.out.println("");
        System.out.println("Digite o custo de fabrica:");
        custoFabrica = teclado.nextFloat();
        porcentagemDistribuidor = custoFabrica * 0.12f;
        porcentagemImposto = custoFabrica * 0.45f;
        custoConsumidor = custoFabrica + porcentagemDistribuidor + porcentagemImposto;
        System.out.printf("O custo do consumidor é de R$%.2f \n", custoConsumidor);
        
    }
    
}
