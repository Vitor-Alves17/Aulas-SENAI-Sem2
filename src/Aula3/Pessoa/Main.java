package Aula3.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        System.out.println("Digite o nome: ");
        p1.setNome(sc.next());
        System.out.println("Digite o idade: ");
        p1.setIdade(sc.nextInt());

        System.out.println("Nome do Pessoa: "  + p1.getNome() + "\n" + "Idade da pessoa: " + p1.getIdade());

    }
}
