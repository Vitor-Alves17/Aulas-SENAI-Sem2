package Aula4.Livro;

import java.util.Scanner;

public class Livro {
    Scanner ler = new Scanner(System.in);

    private String titulo;
    private String autor;
    private int numPaginas;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setNumPaginas(int numPaginas) {
        while(numPaginas > 5){
            System.out.println("Número de páginas inválido. Tente novamente: ");
            numPaginas = ler.nextInt();
        }
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
}
