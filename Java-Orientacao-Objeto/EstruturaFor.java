import java.util.Scanner;
class EstruturaFor{

    public static void main(String[] args)
    {
            // for (indicacao;condicao;incremento;) {}
                
        

            Scanner entrada = new Scanner(System.in);

            System.out.print("Ultimos numero: ");
            int numeroFinal = entrada.nextInt();

            for(int i=0; i < numeroFinal; i++)
            {
                System.out.println(i);
            }
            System.out.println("Fim do programa! ");

            
    }
}