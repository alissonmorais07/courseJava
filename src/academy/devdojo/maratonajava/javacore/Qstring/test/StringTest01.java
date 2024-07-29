package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
//        Strings são imutáveis
        String nome = "Alisson"; //String constant pool
        String nome2 = "Alisson";
        nome = nome.concat(" Morais"); // nome += " Morais"
        System.out.println(nome);
        System.out.println(nome == nome2); // Comparação de variáveis de referência
        String nome3 = new String("Alisson"); // 1 variável de referência, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
