package nivelBasico.Desafio02;

import java.util.Scanner;

public class CadastroDeJutsus {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qntJutsu = 5;
        int contadorJutsus = 0;



        String[] jutsus = new String[qntJutsu];



        while (contadorJutsus <= qntJutsu) {


            System.out.println("=========================");
            System.out.println("Cadastro De jutsu");
            System.out.println("1. Cadastro jutsu");
            System.out.println("2. Listar jutsus");
            System.out.println("3. Qnt jutsus cadastrados");
            System.out.println("4. Encerrar cadastro de jutsu");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                        if (contadorJutsus == qntJutsu) {
                            System.out.println("Voce não pode Cadastrar mais de 5 jutsus");
                            break;

                        } else {
                            System.out.println("Digite nome do Jutsu");
                            jutsus[contadorJutsus] = scanner.nextLine();
                            contadorJutsus++;
                    }
                        break;
                case 2 :

                    if (contadorJutsus == 0) {
                        System.out.println("Nem um Jutsu cadastrado");
                    }

                    for (int i = 0; i < jutsus.length; i++) {

                        if (jutsus[i] == null) {
                            continue;
                        }
                        System.out.println("\n" + jutsus[i]);
                    }
                 break;

                case 3:

                    if (contadorJutsus == 0) {
                        System.out.println("Nem um Jutsu cadastrado");
                    }

                    System.out.println(contadorJutsus);

                    break;

                case 4:
                    System.out.println("Cadastro Finalizado");
                    return;

                default:
                    System.out.println("Opcao invalida");
            }
        }
    }
}
