import java.util.Scanner;
public class RecebendoEntradaDeDados{
    public static void main(String[] args){
        // classe para scanear dados
        Scanner entrada = new Scanner(System.in);
        Scanner entradaLine = new Scanner(System.in);


        System.out.print("Peso: ");
        int peso = entrada.nextInt();

        System.out.print("Altura: ");
        Double altura = entrada.nextDouble();

        System.out.print("Digite seu nome: ");
        String nome = entradaLine.nextLine();
        Double imc = peso / (peso * altura);
        
        System.out.println("IMC de " + nome + ": " + imc);
        
    }
}