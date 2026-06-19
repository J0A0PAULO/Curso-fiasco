package nivelIntermediario;

public class BancoKonoha {
    static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(20, TipoConta.CORRENTE);
        contaCorrente.depositar(20);
        contaCorrente.consultarSaldo();

        ContaPoupanca contaPoupanca = new ContaPoupanca(50, TipoConta.POUPANCA);
        contaPoupanca.depositar(100);
        contaPoupanca.consultarSaldo();
    }
}
