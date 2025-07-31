package Aula1;

public class Intro {
    public static void main(String[] args) {
        IntroClass ic = new IntroClass();

        ic.nome = "Jeny";
        ic.idade = 18;
        ic.peso = 70;
        ic.genero = "Não-binário";
        ic.altura = 1.80;

        ic.Imc(ic.altura, ic.peso);

        System.out.println(ic.nome);
    }
}
