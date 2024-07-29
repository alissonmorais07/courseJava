package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
//  Pra usar o retorno dá para criar uma variável e imprimir ela:  String as = abreConexao();  System.out.println(as);
        String as = abreConexao();
        System.out.println(as);
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivos");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
//      O finally sempre é executado
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreConexao2() {
//  É possível ter o método utilizando apenas o try e o finally, mas isso só é utilizado em casos bem específicos
        try {
            System.out.println("Abrindo arquivos");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }

    }
}
