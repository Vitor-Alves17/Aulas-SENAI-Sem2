package Aula9.Banco;

abstract class Conta {

    private double saldo;
    private int numero;
    private String agencia;
    private String titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
    }
    public void sacar(double saque) {
        saldo -= saque;
    }
    public void depositar(double deposito) {
        saldo += deposito;
    }
    abstract public double calcularTarifaMensal();
    abstract public void acoes();



}
