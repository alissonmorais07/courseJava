package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class ExercicioAssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Konoha");
        Aluno aluno1 = new Aluno("Naruto", 17);
        Professor professor = new Professor("Kakashi", "Jutsu clone");

        Aluno[] alunos = {aluno1};

        Seminario seminario = new Seminario("Jutsu", alunos, local);

        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);

        professor.imprime();


    }
}
