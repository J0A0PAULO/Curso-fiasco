package nivelIntermediario;

public class Uchiha extends Ninja implements ShariganInterface {

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uchiha() {
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é" + nome + "e esse é meu ataque uchiha, um ataque de fogo. Eu ja completei " + numeroDeMissoesConcluidas + " Missoes - Nivel: " + rank);
    }

    @Override
    public  void estrategiaDeBatalhaNinja() {
        System.out.println("Me chamo: " + nome +" Essa é minha estrategia  de batalha");
    };


    @Override
    public void ShariganAtivado() {
        System.out.println(nome + "Uchiha ativou sharigan");
    };

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é minha estragia de batalha");
    }

    @Override
    public  void inteligenciaDeBatalha() {
        System.out.println("Meu nome é " + nome + " Essa é minha estragia de batalha");
    }

    @Override
    public void inteligenciaDeBatalha(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI É: " + qi + " e voce é um genio");

        } else if (qi > 130) {
            System.out.println("Seu QI É: " + qi + " e voce é um Ninja promissor");
        } else {
            System.out.println("SEU QI É: " + qi + " e voce  precisa treinar mais suas estrategias");
        }
    }
}
