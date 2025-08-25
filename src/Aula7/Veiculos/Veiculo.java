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
    public float converterMinutos(float tempo) {
        for(float i = tempo; i > 1; i--){
            tempo--;
        }
        tempo = tempo * 60;
        if(tempo % 60 == 0){
            tempo = tempo / 60;
        }else{
        tempo = tempo / 100;
        }
        return tempo;
    }

    public void velocidade100(Veiculo[] veiculos) {
        float onibus = 100 / veiculos[0].getVelocidadeMedia() + 0.25f * 10;
        float bicicleta = 100 / veiculos[1].getVelocidadeMedia();
        float  carro = 100/ veiculos[2].getVelocidadeMedia();
        carro = carro + converterMinutos(carro);
        bicicleta = bicicleta + converterMinutos(bicicleta);
        onibus = onibus + converterMinutos(onibus);
        System.out.println("Tempo que os veiculos levam em um trajeto de 100Km: ");
        System.out.println("Onibus: " + String.format("%.2f", onibus) + "h (Levando em consideração que ele tem 10 paradas.)");
        System.out.println("Bicicleta: " + String.format("%.2f", bicicleta) + "h");
        System.out.println("Carro: " + String.format("%.2f", carro) + "h");
    }

}
