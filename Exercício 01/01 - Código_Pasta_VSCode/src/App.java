import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

        // Um banco concederá um crédito especial aos seus clientes, de acordo com o saldo médio no último ano. 
        // Faça um programa em Java que receba o saldo médio de um cliente e calcule o valor do crédito, 
        // de acordo com a tabela a seguir. Mostre o saldo médio e o valor do crédito.

        // Saldo médio                                        Percentual
        // Até R$ 200,00                                     | 10% do saldo médio
        // Maior que R$ 200,00 e menor igual a R$ 300,00     | 20% do saldo médio
        // Maior que R$ 300,00 e menor igual a R$ 400,00     | 25% do saldo médio
        // Acima de R$ 400,00                                | 30% do saldo médio

        double credito_especial, saldo_medio;

        Scanner entrada = new Scanner (System.in);
       
        System.out.println("Digite o saldo medio do ultimo ano");
        saldo_medio = entrada.nextDouble();

       if (saldo_medio <= 200 ) {
            credito_especial = saldo_medio * 0.10;
            System.out.println("\nAte R$ 200,00 o crédito sera 10% do saldo médio");
            System.out.println("Dessa forma o valor do credito especial e de R$ " + credito_especial);
            System.out.println("");

        } else if (saldo_medio > 200 && saldo_medio <=300 ) {
            credito_especial = saldo_medio * 0.20;
            System.out.println("\nMaior que R$ 200,00 e menor igual a R$300,00 sera 20% do saldo médio");
            System.out.println("Dessa forma o valor do credito especial e de R$ " + credito_especial);
            System.out.println("");

        } else if (saldo_medio > 300 && saldo_medio <=400){
            credito_especial = saldo_medio * 0.25;
            System.out.println("\nMaior que R$ 300,00 e menor igual a R$400,00 sera 25% do saldo médio");
            System.out.println("Dessa forma o valor do credito especial e de R$ " + credito_especial);
            System.out.println("");

        } else {
            credito_especial = saldo_medio * 0.30;
            System.out.println("\nAcima de R$ 400,00 sera 30% do saldo médio");
            System.out.println("Dessa forma o valor do credito especial e de R$ " + credito_especial);
            System.out.println("");
        }
    }
}
