package nivelIntermediario;

public class Uzumaki extends Ninja{

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki() {
    }

    @Override
    public  void estrategiaDeBatalhaNinja() {
        System.out.println("Me chamo: " + nome +" Essa é minha estrategia  de batalha");
    };

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " esse é meu ataque especial de vento " + " Eu ja completei " + numeroDeMissoesConcluidas + " Missoes - Rank: " + rank);
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é minha estragia de batalha");
    }
}
