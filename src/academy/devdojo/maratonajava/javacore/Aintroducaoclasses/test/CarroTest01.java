package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Uno MIlle";
        carro1.modelo = "Fiat";
        carro1.ano = 1998;

        carro2.nome = "Honda Civic SI";
        carro2.modelo = "Toyota";
        carro2.ano = 2024;

        //Referência de objetos
        // carro1 = carro2 ---> carro1 terá os msm valores do carro2

        System.out.println("Carro 1" + "\nNome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);
        System.out.println("Carro 2" + "\nNome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);


    }
}
