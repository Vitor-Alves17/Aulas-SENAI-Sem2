package Aula1.RetaSem;

import java.util.Scanner;

public class RetaArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura, largura;

        System.out.println("Digite o valor da altura: ");
        altura = sc.nextDouble();
        System.out.println("Digite o valor da largura: ");
        largura = sc.nextDouble();

        double area1 = altura*largura;

        System.out.println("Digite o valor da altura: ");
        altura = sc.nextDouble();
        System.out.println("Digite o valor da largura: ");
        largura = sc.nextDouble();

        double area2 = altura*largura;

        System.out.println("Digite o valor da altura: ");
        altura = sc.nextDouble();
        System.out.println("Digite o valor da largura: ");
        largura = sc.nextDouble();

        double area3 = altura*largura;

        System.out.println(area1 + " " + area2 + " " + area3);
    }
}
