package Aula4.Rpg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonagemRPG per = new PersonagemRPG();

        System.out.println("Digite o nome do personagem: ");
        per.setNome(sc.nextLine());
        System.out.println("""
                Digite a classe do personagem: 
                Guerreiro -> g
                Arqueiro -> a
                Mago -> m
                """);
        per.setClasse(sc.nextLine());
        System.out.println(per.getNome());
        System.out.println(per.getClasse());
        System.out.println("Nível do personagem: " + per.getNivel());
        System.out.println("Vida do personagem: " + per.getVida());

        do{
            System.out.println("""
                Atualizar:
                1 -> Nível
                2 -> Vida
                """);
            int ver = sc.nextInt();
            if(per.ver(ver) == 1){
                System.out.println("Digite o novo nivel: ");
                per.setNivel(sc.nextInt());
                per.getAll();
            }else if(per.ver(ver) == 2){
                System.out.println("Digite o novo valor da vida: ");
                per.setVida(sc.nextInt());
                per.getAll();
            }
        }while(per.getVida() > 0);
        System.out.println("Wasted ☠️");




    }
}
