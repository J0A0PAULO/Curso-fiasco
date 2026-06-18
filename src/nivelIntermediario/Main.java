package nivelIntermediario;

public class Main {

    static void main(String[] args) {

        // Criar o ninja Naruto

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 18;
        sasuke.SharinganAtivado();

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Vila da folha";
        naruto.idade = 17;
        naruto.modoSabiaAtivado();

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Vila da folha";
        sakura.idade = 16;

        Hyuga hinata = new Hyuga();
        hinata.nome = "Sakura Haruno";
        hinata.aldeia = "Vila da folha";
        hinata.idade = 16;
        hinata.byakuganAtivado();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Hyuga Uzumaki";
        boruto.aldeia = "Aldeia da Folha";
        boruto.idade = 9;
        boruto.AtivarJougan();
        boruto.modoSabiaAtivado();
    }
}
