class TiposPrimitivos{

    public static void main(String[] args) {
        
        double precoProduto = 9.43;
        boolean alunoMatriculado = true;
        boolean clienteBloqueado = false;

        char turmaAluno = 'A';
        char tipoCliente = '2';
        char simbolo = '@';

        System.out.println(turmaAluno);
        System.out.println(tipoCliente);
        System.out.println(simbolo);

        long populacaoUberlandia = 7000000000L;
        System.out.println(populacaoUberlandia);

        float saldoConta = 1030.43F;
        System.out.println(saldoConta);

        int total = 10;
        total +=3;
        System.out.println(total);
        total += -1;
        System.out.println(total);
        total *= 2;
        System.out.println(total);
        total /=4;
        System.out.println(total);
        total %=5;
        System.out.println(total);

        // long x = 10;
        // int y = (int) x;

        // System.out.println(y);

    //    long x = 9300000035L;
    //    int y = (int) x;

        int y = 102344;
        long x = y;

       System.out.println(y);

        double a = 20.5;
        // você assume os riscos desta conversão
        float b = (float) a;

        System.out.println(b);

        float c = 934.5f;

        // conversão automática
        double d = c;
        System.out.println(d);


    }
}