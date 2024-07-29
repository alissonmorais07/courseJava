package academy.devdojo.maratonajava.introducao;

public class Aula05Exercicio {
    public static void main(String[] args) {
        double salarioAnual = 78000;
        double taxaAnual;

        if (salarioAnual <= 34712){
            taxaAnual = salarioAnual * 0.097;
            System.out.println("TAXA1: "+taxaAnual);
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            taxaAnual = salarioAnual * 0.3735;
            System.out.println("TAXA2: "+taxaAnual);
        }else {
            taxaAnual = salarioAnual * 0.495;
            System.out.println("TAXA3: "+taxaAnual);
        }
    }
}
