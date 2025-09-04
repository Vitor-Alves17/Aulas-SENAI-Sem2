package Aula9.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta corrente = new Corrente();
        Conta poupanca = new Poupanca();
        Conta pj = new PessoaJuri();

        int ver = 0;

            System.out.println("Bem vindo ao DataBank 2.0");
        do{
            System.out.println("""
                    Qual conta deseja acessar?:
                    1 -> Corrente
                    2 -> Poupança
                    3 -> Pessoa Juridica
                    0 -> Parar
                    """);
            ver = sc.nextInt();
            while(ver != 0 && ver != 1 && ver != 2 && ver != 3) {
                System.out.println("Digito inválido, tente novamente: ");
                ver = sc.nextInt();
            }
            switch (ver) {
                case 1: corrente.acoes();
                break;
                case 2: poupanca.acoes();
                break;
                case 3: pj.acoes();
                break;
            }

        } while(ver != 0);
    }
}
