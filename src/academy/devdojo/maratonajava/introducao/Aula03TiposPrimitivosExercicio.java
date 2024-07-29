package academy.devdojo.maratonajava.introducao;

import java.text.SimpleDateFormat;

/*
Prática

Crie variáveis para os camposdescritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>
confirmo que recebi o salário de <salário>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "Alisson";
        String endereco = "Condomínio Park Cowboy";
        double salario = 5250.75;
        String dataRecebimentoSalario = "02/04/2024";

        System.out.println("Eu "+nome+", morando no endereço: "+endereco+"\nconfirmo que recebi o salário de R$"+salario+", na data "+dataRecebimentoSalario);
    }
}
