package Aula7.Veiculos;

import java.util.ArrayList;
import java.util.Random;

public class Onibus extends Veiculo {
    Random rand = new Random();

    private float numero_paradas = rand.nextFloat(10);

    float velocidadeMedia = 60.0f;


    @Override
    public float calcularTempo(float velocidadeMedia, float distancia) {
        return (distancia / velocidadeMedia) + (0.25f * numero_paradas);
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }
}
