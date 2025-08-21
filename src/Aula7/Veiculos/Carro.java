package Aula7.Veiculos;

public class Carro extends Veiculo {

    float VelocidadeMedia = 80.0f;

    @Override
    public float calcularTempo(float velocidadeMedia, float distancia) {
        return (distancia * velocidadeMedia);
    }

    public float getVelocidadeMedia() {
        return VelocidadeMedia;
    }
}
