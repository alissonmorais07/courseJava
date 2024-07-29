package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    //Métodos (parecido com o conceito de funções)
    //É possível utilizar parâmetros ou não
    public void somaDoisNumero(int a, int b) {
        System.out.println(a + b);
    }

    //Método com retorno
    //Existem maneiras diferentes de se fazer esse código
    public double divideDoisNumero(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }

    //Utilizando o método void forçando um "return"
    public void imprimeDivideDoisNumeros(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(n1 / n2);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Numero1 " + numero1);
        System.out.println("Numero2 " + numero2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    //Utilizando VarArgs
    //O VarArgs precisa ser o último atributo a ser passado
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
