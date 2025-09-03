package Aula9.Abstracao;

abstract class Servivo{

    private Cores cor;
    private int peso;

    public Cores getCor() {
        return cor.VERMELHO;
    }

    public void setCor(Cores cor) {
        this.cor = cor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    abstract public void respirar();
}
