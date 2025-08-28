package Aula8.Cache;

import java.util.Scanner;

import static Aula8.Cache.Main.cache;
import static Aula8.Cache.Main.databank;

public class Pessoa {

    private boolean verif = true;
    private int id = 5;

    private String nome;
    private int idade;

    public Pessoa() {

    }

    public Pessoa(int id, String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getId() {
        return id;
    }

    public void mock() {
        databank.add(new Pessoa(1, "Jennifer", 23));
        databank.add(new Pessoa(2, "Carlos", 25));
        databank.add(new Pessoa(3, "Roberto", 14));
        databank.add(new Pessoa(4, "Jaqueline", 32));
        databank.add(new Pessoa(5, "Liza", 17));
    }

    public void addUserBank(Pessoa p) {
        databank.add(p);
    }

    public void addUserCache(Pessoa user) {
        cache.add(user);
        if (cache.size() > 10) {
            cache.remove(0);
        }
    }


    public void toString(int i) {
        System.out.println("ID: " + cache.get(i).getId() + " Nome: " + cache.get(i).getNome() + " Idade: " + cache.get(i).getIdade() + " Encontrado em cache");
    }

    public void searchCache(int id) {
        for (int i = 0; i < cache.size(); i++) {
            if (cache.get(i) != null) {
            if (cache.get(i).getId() == id) {
                toString(i);
                verif = false;
                break;
            }
            }
        }
    }
    public void toStringBank(int i) {
        System.out.println("ID: " + databank.get(i).getId() + " Nome: " + databank.get(i).getNome() + " Idade: " + databank.get(i).getIdade() + " Encontrado no banco de dados");
    }

    public void searchBank(int id) {
        if (verif) {
            for (int i = 0; i < databank.size(); i++) {
                if (databank.get(i).getId() == id) {
                    toStringBank(i);
                    addUserCache(databank.get(i));
                    System.out.println("Usuario adicionado no cache");
                    return;
                }
            }
            System.out.println("Usuario não encontrado");
        }
    }

    public void veri() {
        Scanner sc = new Scanner(System.in);
        int ver = sc.nextInt();
        while (ver != 1) {
            System.out.println("Digito invalido, tente novamente: ");
            ver = sc.nextInt();
        }
        while (ver != 0) {
            System.out.println("""
                    Qual operação deseja fazer ?:
                    1 -> Adicionar novo usuario
                    2 -> Buscar usuario
                    0 -> Parar o código
                    """);
            int op = sc.nextInt();
            String user;
            while (op != 0) {
                switch (op) {
                    case 1:
                        System.out.println("Digite o nome do usuario: ");
                        String nome = sc.next();
                        System.out.println("Digite o idade: ");
                        int idade = sc.nextInt();
                        id++;
                        addUserBank(new Pessoa(id, nome, idade));
                        addUserCache(new Pessoa(id, nome, idade));
                        break;
                    case 2:
                        System.out.println("Digite o id do usuario que deseja procuar: ");
                        int id1 = sc.nextInt();
                        searchCache(id1);
                        searchBank(id1);
                        verif = true;
                        break;
                }
                System.out.println("""
                        Deseja executar outra operação?
                        1 -> Adicionar novo usuario
                        2 -> Buscar usuario
                        0 -> Parar o código
                        """);
                op = sc.nextInt();
                while (op != 0 && op != 1 && op != 2) {
                    System.out.println("Digito invalido, tente novamente: ");
                    op = sc.nextInt();
                }
                ver = op;
            }
        }
    }

}
