package nivelIntermediario;

public class Main {
    public Main() {
    }

    static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 15, 200, NivelNinja.JOUNIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();
        sasuke.ShariganAtivado();

        Uchiha itachi = new Uchiha("Itachi", "Vila da Folha", 27);
        itachi.estrategiaDeBatalhaNinja();

        System.out.println("==============");

        Hatake kakashi = new Hatake();
        kakashi.nome = "kakashi";
        kakashi.aldeia = "Vila da folha";
        kakashi.idade = 48;
        kakashi.boaVindas();
        kakashi.ShariganAtivado();
        kakashi.NinjaDeElite();

        System.out.println("================");

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45,  900, NivelNinja.HOKAGE);
        madara.ShariganAtivado();
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.inteligenciaDeBatalha();
        madara.inteligenciaDeBatalha(180);

        System.out.println("================");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Vila da Folha", 16, 200, NivelNinja.HOKAGE);
        naruto.estrategiaDeBatalhaNinja();
        naruto.habilidadeEspecial();

    }
}
