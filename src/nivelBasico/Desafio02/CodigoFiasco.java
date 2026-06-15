package nivelBasico.Desafio02;

import java.util.Scanner;

public class CodigoFiasco {
    static void main(String[] args) {

        //entrada de dados
        Scanner scanner = new Scanner(System.in);

        //fazer o array
        int NUMERO_MAX = 5;
        String[] ninjas = new String[NUMERO_MAX];

        //contadores
        int ninjasCadastrados = 0;
        int opcoes = 0;

        while(opcoes != 3) {

            //menu
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opcao: ");
            opcoes = scanner.nextInt();
            scanner.nextLine();

            switch (opcoes) {
                case  1 :
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("ninja cadastrado com sucesso");
                    } else {
                        System.out.println("A lista de ninjas esta cheia, impossivel cadastra um novo  ninja");
                    }
                    break;
                case 2 :
                    if(ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninjas encontrado");
                    } else {
                        System.out.println("================ Lista de ninjas ===============");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println("Nome :" + ninjas[i]);
                        }
                        break;
                    }
                case 3 :
                    System.out.println("Estamos terminando o programa...");
                    break;

                default:
                    System.out.println("essa opcao nao é valida");
                    break;
            }

        }



    }
}
