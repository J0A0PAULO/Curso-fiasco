package nivelIntermediario;

public class ContaPoupanca extends ContaBancaria {

   public ContaPoupanca(double saldo) {
       super(saldo);
   }

    public ContaPoupanca(double saldo, TipoConta conta) {
        super(saldo, conta);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor - (valor * 0.01);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual é de: " + this.saldo);
    }
}
