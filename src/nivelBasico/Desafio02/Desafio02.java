package nivelBasico.Desafio02;

import java.util.Scanner;

public class Desafio02 {


    static void main(String[] args) {


        String[] ninjas = new String[2];

        boolean ligado = true;
        int contador =0;

        while(ligado) {

            System.out.println("Digite 1 para cadastra novo ninja");
            System.out.println("Digite 2 para listar ninjas cadastrados");
            System.out.println("Digite 3 para encerrar cadastro");
            Scanner sc = new Scanner(System.in);
            int cadastroNinjas = sc.nextInt();
            sc.nextLine();

            switch (cadastroNinjas) {
                case 1 :
                    System.out.println("Digite nome do ninja");
                    ninjas[contador] = sc.nextLine();
                    contador++;
                    break;
                case 2:
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println(ninjas[i]);
                    }
                    break;
                case 3:
                    System.out.println("cadastro finalizado");
                    ligado = false;
                    break;
            }
        }







    }

}
