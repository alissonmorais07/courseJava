package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
       // + - / *
       int numero1 = 10;
       int numero2 = 20;
       double resultado = numero1 / (double) numero2; // Para efetuar a divisão é necessário o n2 ser double
        System.out.println("Valor: "+(numero2 + numero1));
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // <  >  <=  >=  ==  !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteVinte);

        // && (AND)  || (OR)  ! (NOT)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // =  +=   -=    *=   /=   %=
        double bonus = 1800;
        bonus += 1000;

        // ex: ++contador (Executa a atribuição antes) é diferente de contador++ (Executa a atribuição depois)

        System.out.println(bonus);
    }
}
