package Aula7.Veiculos;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Onibus oni = new Onibus();
        Bicicleta bic = new Bicicleta();
        Carro carro = new Carro();
        Veiculo veiculo = new Veiculo();

        Veiculo[] veiculos = {oni, bic, carro};

        veiculo.velocidade100(veiculos);
    }
}
