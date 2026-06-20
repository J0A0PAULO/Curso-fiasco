package nivelIntermediario;

public abstract class Ninja implements EstrategiaDeBatalha  {


    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Ranks : Genin, Chunin, Jounin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;



    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do contrutor chamado os novos atributos


    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        // Sobrecarga de metodos voce nao precisa redeclarar o contrutor so os  novos atributos
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }


    public Ninja() {

    }


    public void habilidadeEspecial() {

    }

    // TODO NINJA VAI FAZER OBRIGATORIAMENTE
    public void tacarKunai() {
        System.out.println("Eu sou metodo da classe mae");
    }

    // metodos abstratos sao obrigados em todas as classes


    public  void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estragia de batalha");
    };

    // Sobrecarga de metodo - inteligencia de combate

    public  void inteligenciaDeBatalha() {
        System.out.println("Meu nome é " + nome + " Essa é minha estragia de batalha");
    }

    public void inteligenciaDeBatalha(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI É: " + qi + " e voce é um genio");

        } else if (qi > 130) {
            System.out.println("Seu QI É: " + qi + " e voce é um Ninja promissor");
        } else {
            System.out.println("SEU QI É: " + qi + " e voce  precisa treinar mais suas estrategias");
        }
    }

    //metodo sem override
    public void metodoProvissorio() {
        System.out.println("test na classe ninja");
    }

    @Override
    public String toString() {
        return "Meu nome é: " + nome + " Eu sou da: " + aldeia + " e tenho " + idade + " Anos";
    }

}
