package Aula8.Cache;

public class Pessoa {
    private String nome;
    private int idade;
    private int id;

    public Pessoa(int id, String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getId() {
        return id;
    }
}
