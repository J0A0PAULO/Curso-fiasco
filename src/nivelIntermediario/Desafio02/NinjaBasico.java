package nivelIntermediario.Desafio02;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Jutsu: " + habilidade);
    }

}
