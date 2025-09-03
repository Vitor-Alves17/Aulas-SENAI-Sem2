package Aula9.Abstracao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Servivo dog = new Cachorro();
        Humano lucas = new Humano();

        List<Servivo> seres = new ArrayList<>();
        seres.add(new Cachorro());
        seres.add(new Humano());

        for(Servivo ser: seres) {
            System.out.println(ser.getCor());
        }

//        dog.setCor(Cores.VERMELHO);
//
//        System.out.println(dog.getCor());
//
//        for(Cores cor: Cores.values()) {
//            System.out.println(cor + " " + cor.getI());
//        }

    }
}
