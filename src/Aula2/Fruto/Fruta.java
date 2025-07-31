package Aula2.Fruto;

public class Fruta {
    public String nome;
    public double peso;

    public Fruta(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public double cair() {
        return peso;
    }
}
