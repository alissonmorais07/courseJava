package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {

    }

    public static void recursividade(){
        //O método fica "se chamando" causando um ERROR
        recursividade();
    }
}
