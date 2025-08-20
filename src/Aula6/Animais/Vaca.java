package Aula6.Animais;

public class Vaca extends Animal{

    @Override
    public void fazerSom(){
        System.out.println("Muuuuuuu");
    }
    @Override
    public void comer(){
        if (tamanho == 10){
            System.out.println("");
        }
    }

}
