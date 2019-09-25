import java.util.Scanner;
class OperadorTernario{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
            
             String indicacao = (idade >=18) ? "Adulto":"criança/adolescente";
             System.out.println("Resultado: " + indicacao);

        // if(idade >= 18){
        //     indicacao = "Adulto";
        // } else{
        //     indicacao = "criança/adolescente";
        // }
    }
}