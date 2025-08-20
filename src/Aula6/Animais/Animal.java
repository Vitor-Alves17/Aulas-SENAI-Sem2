package Aula6.Animais;

public class Animal {

    protected String nome;
    protected String cor;
    protected double tamanho;

    public double getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void fazerSom(){
        System.out.println("Actually");
    }
    public void comer(){
        System.out.println("nhá, mhip, mhip, mhip, nhá");
    }
}
