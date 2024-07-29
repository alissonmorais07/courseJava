package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        int valorCarro = 30000;
        for (int parcela = 1; parcela <= 1000; parcela++) {
            if (valorCarro / parcela < 1000)
                break;
            System.out.println("Parcela " + parcela + " R$ " + (double) valorCarro / parcela); // Não é o ideal a se fazer
        }
    }

}
