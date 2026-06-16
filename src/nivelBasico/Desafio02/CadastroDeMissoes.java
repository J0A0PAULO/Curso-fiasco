package nivelBasico.Desafio02;

import java.util.Scanner;

public class CadastroDeMissoes {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         int contadorMissoes = 0;
         int NumemeroMaximoDeMissoes = 5;
         boolean ligado = true;

         String missoes[] = new  String[NumemeroMaximoDeMissoes];


         while(ligado) {

             if (contadorMissoes == NumemeroMaximoDeMissoes) {
                 System.out.println("Voce nao pode mais cadastrar missoes");
                 ligado = false;
             }

             System.out.println("====Cadastro de Missoes Ninjas====");
             System.out.println("1 - Adicionar missoes");
             System.out.println("2 - Lista missoes");
             System.out.println("3 - Buscar missao por posicao");
             System.out.println("4 - sair");
             int opcao = scanner.nextInt();
             scanner.nextLine();

             switch (opcao) {
                 case 1:
                     System.out.println("Adicione sua missao");
                     missoes[contadorMissoes] = scanner.nextLine();
                     contadorMissoes++;
                     break;

                 case 2:

                     if (contadorMissoes == 0) {
                         System.out.println("Nem uma missao cadastrada");
                     }

                     for (int i = 0; i < contadorMissoes; i++) {

                         if (missoes[i] == null) {
                             continue;
                         } else {

                         }
                         System.out.println("Missoes \n " + missoes[i]);
                     }
                     break;
                 case 3:
                     System.out.println("Insira a posicao quer encontrar missao");
                     int posicao = scanner.nextInt();

                     if (posicao < 0 || posicao > NumemeroMaximoDeMissoes ) {
                         System.out.println("essa posicao não existe");
                     } else if(missoes[posicao] == null) {
                         System.out.println("Nem uma missao adicionada nessa posicao");
                     } else {
                         System.out.println(posicao + " :" + missoes[posicao]);
                     }

                     break;

                 case 4:
                     System.out.println("Sistema encerrado");
                     ligado = false;
                     break;
                 default:
                     System.out.println("Opcao invalida");
                     break;
             }
         }
    }

}
