package Aula4.Rpg;

import java.util.Scanner;

public class PersonagemRPG {
    Scanner sc = new Scanner(System.in);

    private String nome;
    private String classe;
    private int nivel = 1;
    private int vida = 100;

    public void getAll(){
        System.out.println(getNome());
        System.out.println(getClasse());
        System.out.println("Nível do personagem: " + getNivel());
        System.out.println("Vida do personagem: " + getVida());
    }

    public int ver(int ver){
        while(ver != 1 && ver != 2) {
            System.out.println("Digito Inválido. Tente novamente: ");
        }
        return ver;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setClasse(String classe) {
        while (!classe.equals("g") && !classe.equals("m") && !classe.equals("a")) {
            System.out.println("Opção inválida. Tente novamente: ");
            classe = sc.nextLine();
        }
        this.classe = classe;

    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
        while(nivel < 1) {
            System.out.println("Nivel inválido, tente novamente: ");
            nivel = sc.nextInt();
        }
        this.nivel = nivel;
    }
    public void setVida(int vida) {
        this.vida = vida;
        while(vida > 100) {
            System.out.println("Vida inválido, tente novamente: ");
            vida = sc.nextInt();
        }
        this.vida = vida;
    }
    public String getNome() {
        return nome;
    }
    public String getClasse() {
        String classe2 = classe;
        if (classe.equals("g")) {
            classe2 = "Guerreiro";
        }else if (classe.equals("m")) {
            classe2 = "Mago";
        }else if (classe.equals("a")) {
            classe2 = "Arqueiro";
        }
        return classe2;
    }
    public int getNivel() {
        return nivel;
    }
    public int getVida() {
        return vida;
    }

}
