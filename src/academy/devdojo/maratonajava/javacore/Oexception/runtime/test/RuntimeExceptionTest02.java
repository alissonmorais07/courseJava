package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        // Exception Unchecked
        divisao(1, 0);

        // Não aparece pois o método não está sendo tratado
        System.out.println("Código finalizado");
    }

    /***
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
        }
        return a / b;
    }
}
