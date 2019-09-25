import java.util.Scanner;
public class EstruturaRepeticaoIf {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Seu peso: ");
        int peso = entrada.nextInt();

        System.out.print("Sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso /(altura * altura);

        if(imc < 18.5){
         System.out.println("Abaixo do peso ideal");
        }else if(imc < 25){
            System.out.println("Peso Ideal");
        }

    }
}