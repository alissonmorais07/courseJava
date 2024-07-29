package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        //A variável original do tipo primitivo nunca será alterada
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro do CalculadoraTest03");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);
    }
}
