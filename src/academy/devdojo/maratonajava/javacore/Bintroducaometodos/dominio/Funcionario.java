package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

/*
Crie uma classe Funcionário com os seguintes atributos:

    nome
    idade
    salário // três salários devem ser guardados

Crie dois métodos

     1. Para imprimir os dados
     2. Para tirar a média dos salários e imprimir o resultado
*/
public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null) {
            for (double salario : salarios) {
                System.out.print(salario + " ");
            }
        }
    }

    //É possível fazer essa lógica de outras formas
    //O ideal é colocar esse método em outra classe
    public void media() {
        double resul = 0;
        if (salarios != null) {
            for (double num : this.salarios) {
                resul += num;
            }
            resul /= salarios.length;
        }
        System.out.println("/nMédia Salarial: " + resul);
    }
}
