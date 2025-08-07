package Aula3.Preco;

import java.util.Scanner;

public class Produto {
    Scanner ler = new Scanner(System.in);

    private String nome;
    private double preco;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
       while(preco < 0){
           System.out.println("Valor inválido, digite novamente: ");
           preco = ler.nextDouble();
       }
       this.preco = preco;
    }

    public void mostrar() {
        this.preco = preco;
        this.nome = nome;
        System.out.println("Produto: " + nome + "\n" + "Preço: " + String.format("%.2f", preco));
    }

    public void descontar(double valor) {
        preco -= (valor / 100) * preco;
    }
}
