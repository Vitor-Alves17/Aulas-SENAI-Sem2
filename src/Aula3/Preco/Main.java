package Aula3.Preco;

import Aula3.Pessoa.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto prod = new Produto();

        System.out.println("Digite o nome do produto: ");
        prod.setNome(sc.next());
        System.out.println("Digite o valor do produto: ");
        prod.setPreco(sc.nextDouble());
        prod.mostrar();
        System.out.println("Adicione um deconto (ex. 25): " + "\n" + "Caso não tenha desonto digite 0): ");
        prod.descontar(sc.nextDouble());

        System.out.println("Atualização: ");
        prod.mostrar();

    }
}
