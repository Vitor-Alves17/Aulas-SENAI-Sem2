package Aula5.Heranca;

public class Eletriscista extends Funcionario {

    private boolean nr10;

    public Eletriscista(String cpf, String nome, double salario) {
        super(cpf, nome, salario);
        this.nr10 = nr10;
    }

    @Override
    public double calcularSalario(double salario) {
        return  salario = salario - 100;
    }
}
