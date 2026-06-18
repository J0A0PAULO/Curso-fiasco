package nivelIntermediario.Desafio01;

public class Uchiha extends Ninja {

    String habilidadeEspecial;


    public void mostrarHabilidadeEspecial () {
        System.out.println("haaaaaaaaaa Jutsu :" + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(
                "nome: " + nome + "\n"
                        + "Idade: " + idade + "\n"
                        + "Missao: " + missao + "\n"
                        + "Dificuldade: " + nivelDificuldade + "\n"
                        + "StatusMissao: " + statusMissao + "\n"
                        + "Habilidade especial: " + habilidadeEspecial
        );
    }

}
