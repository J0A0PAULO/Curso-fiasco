package nivelIntermediario.Desafio01CodigoFiasco;

public class Main {
    static void main() {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.nivelDeDificuldade = "Alta";
        sasuke.statusDaMissao = "Em Andamento";
        sasuke.missao = "Recuperar Amuleto";
        sasuke.mostrarInformações();
    }
}
