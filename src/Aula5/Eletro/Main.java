package Aula5.Eletro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Eletrodomestica e = new Eletrodomestica();
        Microondas e2 = new Microondas();

        e2.setNome(sc.next());
        System.out.println(e2.getNome());


    }
}
