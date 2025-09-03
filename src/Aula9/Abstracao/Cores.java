package Aula9.Abstracao;

public enum Cores {
    VERMELHO(10),
    AZUL(30),
    LARANJA(30);

    private int i;

    Cores(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}
