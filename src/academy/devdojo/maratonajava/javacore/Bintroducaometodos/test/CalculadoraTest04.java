package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = new int[]{1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

        //Com o VarArgs é possível passar os "argumentos" de forma direta
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6);
    }
}
