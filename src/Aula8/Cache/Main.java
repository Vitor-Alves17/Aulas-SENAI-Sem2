package Aula8.Cache;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Pessoa> databank = new ArrayList<>();
    public static ArrayList<Pessoa> cache = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();


        System.out.println("""
                Bem-vindo ao simulador de cache! 
                Digite 1 para iniciar: 
                """);
        pessoa.mock();
        pessoa.veri();
    }
}
