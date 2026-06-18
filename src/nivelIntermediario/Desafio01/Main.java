package nivelIntermediario.Desafio01;

import java.util.Scanner;

public class Main {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 15;
        sasuke.nivelDificuldade = "C";
        sasuke.statusMissao = "Em andamento";
        sasuke.missao = "Entregar pergaminho";
        sasuke.habilidadeEspecial = "Bola de fogo";
        sasuke.mostrarInformacoes();


    }
}
