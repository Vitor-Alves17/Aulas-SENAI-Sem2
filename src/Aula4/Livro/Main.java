package Aula4.Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro li = new Livro();

        System.out.println("Digite o titulo do livro: ");
        li.setTitulo(sc.nextLine());
        System.out.println("Digite o autor do livro: ");
        li.setAutor(sc.nextLine());
        System.out.println("Digite o número de páginas do livro (min. 5 pag.): ");
        li.setNumPaginas(sc.nextInt());

        System.out.println("Título do livro: " + li.getTitulo());
        System.out.println("Autor do livro: " + li.getAutor());
        System.out.println("Número de páginas do livro: " + li.getNumPaginas());
    }



}
