package Aula2.DataBank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EncapBank eb = new EncapBank();

        int ver;

        System.out.println("Bem vindo ao DataBank. Seu saldo atual é: " + eb.getSaldo());
        System.out.println("Deseja realizar alguma ação?: ");
        System.out.println("""
                1 - Consultar Saldo
                2 - Depositar
                3 - Sacar
                4 - Encerrar Operação
                """);
        ver = sc.nextInt();
        while (ver != 4) {
            switch (ver) {
                case 1:
                    System.out.println(eb.getSaldo());
                    break;
                    case 2:
                        System.out.println("Quanto deseja depositar?: ");
                        eb.depositar(sc.nextDouble());
                        break;
                        case 3:
                            System.out.println("Quanto deseja sacar?: ");
                            eb.sacar(sc.nextDouble());
                            break;
            }
            sc.nextLine();
            System.out.println("Deseja executar outra operação?: ");
            System.out.println("""
                    1 - Consultar Saldo
                    2 - Depositar
                    3 - Sacar
                    4 - Encerrar
                    """);
            ver = sc.nextInt();
        }
    }
}
