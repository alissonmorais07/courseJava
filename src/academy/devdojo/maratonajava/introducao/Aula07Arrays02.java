package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Valores armazenados no array quando não se tem nenhuma inicialização
        // byte, short, int, long, float e double = 0
        // char = '\u0000'  ' '
        // boolean = false
        // String = null1

        String[] nomes = new String[3];
        nomes[0] = "Alisson";
        nomes[1] = "Letícia";
        nomes[2] = "Úrsula";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
