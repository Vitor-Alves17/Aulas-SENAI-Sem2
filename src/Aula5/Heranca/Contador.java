package Aula5.Heranca;

public class Contador extends Funcionario {

    private double numCrc;

    public Contador(String nome, String cpf, double salario, double numCrc) {
        super(nome, cpf, salario);
        this.numCrc = numCrc;
    }
}
