import java.util.Scanner;
class EscopoDeVariaveis{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = entrada.nextInt();

        boolean podeDirigir = idade >=18;

        if(!podeDirigir){
            
            System.out.print("Nome do pai: ");
            String nomePai = entrada.next();
        }

        System.out.println("Você pode dirigir? ");

        if(podeDirigir){
            System.out.println("Sim, claro.");
        }else{
            System.out.println("Não, se fizer isso, seu pai " + nomePai + "vai preso" );
        }

    }
}