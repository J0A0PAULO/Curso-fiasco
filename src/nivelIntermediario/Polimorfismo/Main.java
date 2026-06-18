package nivelIntermediario.Polimorfismo;

public class Main {

    static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome =  "Naruto Uzumaki";
        naruto.aldeia = "Vila da folha";
        naruto.idade = 16;
        naruto.habilidadeEspecial();

        Uchiha sasuke = new Uchiha();
        sasuke.nome =  "Sasuke Uchiha";
        sasuke.aldeia = "Vila da folha";
        sasuke.idade = 16;
        sasuke.habilidadeEspecial();
    }
}
