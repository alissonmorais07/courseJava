package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumero(10, 2);
        System.out.println(result);
        System.out.println("------------");
        calculadora.imprimeDivideDoisNumeros(32,0);
    }
}
