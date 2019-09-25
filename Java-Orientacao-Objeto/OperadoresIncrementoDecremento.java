
class OperadoresIncrementoDecremento{
    public static void main(String[] args)
    {
            int idade = 10;
            idade++;
            // é o mesmo que
            idade = idade + 1;

            // e tambem
            idade +=1;

            // novaIdade recebe 10 e idade é incrementada para 11
            int novaIdade = idade++;

            // novaIdade recebe 10 e idade é decrementada para 9
            int idadeNegativa = idade--;

            // idade é decrementada para 8 e outra recebe 8
            int outraIdade = --idade;
    }
}