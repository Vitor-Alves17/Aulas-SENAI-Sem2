package Aula5.Eletro;

public class Eletrodomestica {

    protected String nome;
    protected double preco;
    protected double peso;
    protected int tensao;

    public Eletrodomestica() {
        this.nome = "";
        this.preco = 0;
        this.peso = 0;
        this.tensao = 0;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
}
