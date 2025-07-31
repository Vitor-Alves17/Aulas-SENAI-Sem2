package Aula2.DataBank;

public class EncapBank {
    private double saldo;
    public double deposito;
    public double saque;

    public double getSaldo() {
        return saldo;
    }
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        }else  {
            System.out.println("Saldo insuficiente");
        }
    }
    public void depositar(double valor) {
        saldo += valor;
    }
}
