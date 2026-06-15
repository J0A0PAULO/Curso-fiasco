package nivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    /*
    * Scanner = é um jeito de trazer o usuario  para dentro da aplicacao
    * */

    static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        // receber nome do ninja
        System.out.println("Escreva aqui o nome do ninja");
        String nomeDoNinja = caixaDeTexto.nextLine();


        // receber idade do ninja
        System.out.println("Escreva aqui a iddade do seu Ninja");
        int idade = caixaDeTexto.nextInt();

        if (idade > 18 ) {
            System.out.println("Essse ninja é maior de idade" + nomeDoNinja + " e  pode fazer missoes fora da vila");
        } else  {
            System.out.println("esse ninja e menor de idade e não pode sair da vila");
        }

        System.out.println("O nome do ninja é " + nomeDoNinja);
        System.out.println("A idade do ninja é " + idade);

        caixaDeTexto.close();


    }
}
