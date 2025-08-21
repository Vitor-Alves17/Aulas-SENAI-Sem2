package Aula7.Veiculos;

import java.util.ArrayList;

public class Bicicleta extends Veiculo {

    float VelocidadeMedia = 20.0f;

    @Override
    public float calcularTempo(float velocidadeMedia, float distancia) {
        return (distancia / velocidadeMedia);
    }

    public float getVelocidadeMedia() {
        return VelocidadeMedia;
    }
}
