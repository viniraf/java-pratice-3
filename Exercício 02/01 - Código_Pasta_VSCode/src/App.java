import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Criar um programa em Java que a partir da idade e peso do paciente calcule 
        // a dosagem de determinado medicamento e imprima a receita informando quantas 
        // gotas do medicamento o paciente deve tomar por dose. Considere que o 
        // medicamento em questão possui 500 mg por ml, 
        // e que cada ml corresponde a 20 gotas.

        // - Adultos ou adolescentes desde 12 anos, inclusive, se tiverem peso igual ou acima de 
        // 60 quilos devem tomar 1000 mg; com peso abaixo de 60 quilos devem tomar 875 mg.

        // - Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada pelo peso 
        // corpóreo conforme a tabela a seguir:

        // Peso              Dosagem
        // 5 kg a 9 kg      | 125 mg
        // 9.1 kg a 16 kg   | 250 mg
        // 16.1 kg a 24 kg  | 375 mg
        // 23.1 kg a 30 kg  | 500 mg
        // Acima de 30 kg   | 750 mg
 
        double idade, peso;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade do paciente ");
        idade = entrada.nextDouble();

        System.out.println("\nDigite o peso do paciente ");
        peso = entrada.nextDouble();

        if (idade >= 12 && peso >= 60) {
            System.out.println("\nAdultos ou adolescentes desde 12 anos, inclusive, se tiverem peso igual ou acima de 60 kg devem tomar 1000 mg.\n");
        } 
        else if (idade >= 12 && peso < 60) {
            System.out.println("\nAdultos ou adolescentes desde 12 anos, inclusive, se tiverem peso abaixo de 60 kg devem tomar 875 mg.\n");
        } 
        else if (idade < 12 && peso >= 5 && peso <= 9) {
            System.out.println("\nCrianças e adolescentes abaixo de 12 anos e com peso entre 5 kg e 9 kg devem tomar 125 mg.\n");
        }
        else if (idade < 12 && peso >= 9.1 && peso <= 16) {
            System.out.println("\nCrianças e adolescentes abaixo de 12 anos e com peso entre 9.1 kg e 16 kg devem tomar 250 mg.\n");
        }
        else if (idade < 12 && peso >= 16.1 && peso <= 24) {
            System.out.println("\nCrianças e adolescentes abaixo de 12 anos e com peso entre 16.1 kg e 24 kg devem tomar 375 mg.\n");
        }
        else if (idade < 12 && peso >= 24.1 && peso <= 30) {
            System.out.println("\nCrianças e adolescentes abaixo de 12 anos e com peso entre 24.1 kg e 30 kg devem tomar 500 mg.\n");
        }
        else {
            System.out.println("\nCrianças e adolescentes abaixo de 12 anos e com peso acima de 30 kg devem tomar 750 mg.\n");
        }
    }
}
