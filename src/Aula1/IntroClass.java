package Aula1;

public class IntroClass {
    public String nome;
    public int idade;
    public double peso;
    public String genero;
    public double altura;


    public double Imc(double altura, double peso) {
        double peso1 = peso, altura1 = altura, imc;
        peso1 = this.peso;
        altura1 = this.altura;
        imc = peso/(altura*altura);
        System.out.println("IMC: "+ String.format("%.2f", imc));

        return imc;
    }

    public String getPessoa() {
        return "Pessoa (" + this.peso + ")";
    }
}
