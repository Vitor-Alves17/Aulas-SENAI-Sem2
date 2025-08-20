package Aula5.Heranca;

public class Engenheiro extends Funcionario {

    private double sla;

    public Engenheiro(String nome, String cpf, double salario, double sla ) {
        super(nome, cpf, salario);
        this.sla = sla;
    }
}
