package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Letícia");
        pessoa.setCpf("11111111");
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das laranjeiras");
        endereco.setCep("12345-000");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Alisson");
        funcionario.setCpf("2222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("------------");
        funcionario.imprime();
        funcionario.relatorioPagamento();

    }
}
