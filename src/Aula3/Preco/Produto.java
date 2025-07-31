package Aula3.Preco;

public class Produto {

    private String nome;
    private double preco;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public void mostrar() {
        this.preco = preco;
        this.nome = nome;
        System.out.println("Produto: " + nome + "\n" + "Preço: " + preco);
    }

    public void descontar(double valor) {
        preco -= (valor / 100) * preco;
    }
}
