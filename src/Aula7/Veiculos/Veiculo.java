package Aula7.Veiculos;

import java.util.ArrayList;

public class Veiculo {

    private float velocidadeMedia;
    private float distancia;
    private String modelo;


    public float calcularTempo(float velocidadeMedia, float distancia) {
        return (distancia * velocidadeMedia);
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void velocidade100(Veiculo[] veiculos) {
        float onibus = 100 / veiculos[0].getVelocidadeMedia() + 0.25f * 10;
        float bicicleta = 100 / veiculos[1].getVelocidadeMedia();
        float  carro = 100/ veiculos[2].getVelocidadeMedia();
        System.out.println("Tempo que os veiculos levam em um trajeto de 100Km: ");
        System.out.println("Onibus: " + onibus + "h (Levando em consideração que ele tem 10 paradas.)");
        System.out.println("Bicicleta: " + bicicleta + "h");
        System.out.println("Carro: " + carro + "h");
    }

}
