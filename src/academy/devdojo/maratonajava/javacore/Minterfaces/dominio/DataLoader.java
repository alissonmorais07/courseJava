package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    void load();

    //    Método concreto dentro da interface
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
