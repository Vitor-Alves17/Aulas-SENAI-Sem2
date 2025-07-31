package Aula2.Encap;

public class Musi {
    private String titulo;
    private String artista;
    private String genero;
    private double anolanca;

    public String getTitulo() {
        return titulo;
    }

    public void Musi() {
        System.out.println("A música é: " + this.titulo);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setAnolanca(double anolanca) {
        this.anolanca = anolanca;
    }
}
