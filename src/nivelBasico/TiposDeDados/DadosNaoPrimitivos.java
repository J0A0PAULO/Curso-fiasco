package nivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    static void main(String[] args) {

        /*
        * Dados não primitivos: String, Array, Class, enum
        * objeto: criar um ninja, e atribuir metodos a ele
        * */

        String nome = "Naruto Uzumaki";
        String nomeEMcaixaAlta = nome.toUpperCase(); // vai colocar tudo em CAPSLOCK
        System.out.println("Nome em caixa baixa :" + nome);
        System.out.println("Esse nome esta em caixa alta: " + nomeEMcaixaAlta);

        String aldeia = "aldeia da folha";
        aldeia.toLowerCase();


    }
}
