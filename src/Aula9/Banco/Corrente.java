package Aula9.Banco;

import java.util.Scanner;

public class Corrente extends Conta {
    Scanner sc = new Scanner(System.in);


    @Override
    public double calcularTarifaMensal() {
        return 12.00;
    }
    public void acoes(){
        int ver = 0;
        do{

        System.out.println("""
                Qual operação deseja executar?:
                1 -> Exibir Saldo
                2 -> Deposito
                3 -> Sacar
                0 -> Parar
                """);
        ver = sc.nextInt();
        while(ver != 1 && ver != 2 && ver != 3){
            System.out.println("Digito invalido, tente novamente: ");
            ver = sc.nextInt();
        }
        switch(ver){
            case 1:
                exibirSaldo();
                break;
                case 2:
                    System.out.println("Quanto deseja depositar?: ");
                    double depo = sc.nextInt();
                    depositar(depo);
                    break;
                    case 3:
                        System.out.println("Quanto deseja sacar?: ");
                        double sacar = sc.nextInt();
                        while (sacar > getSaldo()){
                            System.out.println("Você não possui esse valor, tente novamente: ");
                            sacar = sc.nextInt();
                        }
                        sacar(sacar);
                        break;
        }
        }while (ver != 0);
    }
}
