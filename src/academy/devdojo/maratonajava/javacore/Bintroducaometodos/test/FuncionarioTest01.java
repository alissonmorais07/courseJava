package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Alisson";
        funcionario.idade = 21;
        funcionario.salarios = new double[]{3700, 2890.50, 3400};

        funcionario.imprime();
        funcionario.media();
    }
}
