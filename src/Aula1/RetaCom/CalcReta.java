package Aula1.RetaCom;

import java.util.Scanner;

public class CalcReta {
    public double area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite o valor da largura: ");
        double largura = sc.nextDouble();

       return altura*largura;
    }
}
