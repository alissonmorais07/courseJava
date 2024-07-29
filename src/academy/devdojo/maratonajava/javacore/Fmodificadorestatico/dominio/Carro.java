package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadMaxima) {
        this.nome = nome;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void imprime() {
        System.out.println("-------------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade Máxima " + this.velocidadMaxima);
        System.out.println("Velocidade Limite " + Carro.velocidadeLimite);
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
