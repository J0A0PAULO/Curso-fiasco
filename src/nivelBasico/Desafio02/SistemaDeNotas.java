package nivelBasico.Desafio02;

import java.util.Scanner;

public class SistemaDeNotas {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        boolean ligado = true;
        int contadorNotas = 0;
        int TAMANHO_DA_TURMA = 5;
        double mediaADaTurma = 0;

        double soma = 0;
        double media = 0;

        Double[] notas = new Double[TAMANHO_DA_TURMA];
        String[] alunos = new String[TAMANHO_DA_TURMA];

        while (ligado) {

            System.out.println("=====Sistemas de Notas=====");
            System.out.println("1 - Cadastrar nota");
            System.out.println("2 - Listar notas");
            System.out.println("3 - Mostrar média");
            System.out.println("4 - sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();



            if (contadorNotas == TAMANHO_DA_TURMA ) {
                System.out.println("Turma esta cheia");
                ligado = false;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Qual seu nome");
                    alunos[contadorNotas] = scanner.nextLine();
                    System.out.println("Digite sua nota: " + alunos[contadorNotas]);
                    notas[contadorNotas] = scanner.nextDouble();
                    contadorNotas++;
                    break;

                case 2:

                    if (contadorNotas == 0) {
                        System.out.println("nem uma nota cadastrada");
                    }

                    for (int i = 0; i < contadorNotas; i++) {
                        System.out.println("Notas:\n " + alunos[i] +  ": " + notas[i]);
                    }
                    break;

                case 3:

                    if (contadorNotas == 1) {
                        System.out.println("Insira mais uma nota para calcular média da turma");
                    }

                    for (int i = 0; i < notas.length; i++) {
                       if (notas[i] == null) {
                           continue;
                       }
                       soma+= notas[i];
                    }

                    media = soma / contadorNotas;
                    System.out.println("Média Da Turma:" + media);
                break;

                case 4:
                    System.out.println("Sistema encerrado");
                    ligado = false;
                 break;

                default:
                    System.out.println("opcao invalida");
            }
        }
    }
}
