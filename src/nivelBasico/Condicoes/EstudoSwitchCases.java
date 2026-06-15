package nivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {

    static void main(String[] args) {


        /*
        * SwitchCases: que servem para gerar casos especificos
        * objetivo: pedir pro usuario escolher entre os ninjas
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um personagem");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke uchika");
        System.out.println("3 - Sakura Haruno");

        //pedir para usuario escolher uma opcão

        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Voce digitou o numero " + escolhaDoUsuario);

        //Reção ao escolher um personagem


        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuario Escolheu Sakura Haruno");

            default:
                System.out.println("Voce não digitou uma resposta valido");
        }


    }
}
