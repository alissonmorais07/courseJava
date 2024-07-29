package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell Inspiron 15", 3600);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.cacularImposto(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.cacularImposto(tomate);
        System.out.println("--------------------------");
        CalculadoraImposto.cacularImposto(tv);
    }
}
