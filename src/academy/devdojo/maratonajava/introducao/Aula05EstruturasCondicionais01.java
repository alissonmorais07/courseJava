package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
       int idade = 17;
       // boolean isAutorizadoTirarCNH = idade >= 18; tbm é possível utilizar o if com essa condicional

       if(idade >= 18) {
           System.out.println("Autorizado a tirar CNH");
       }else{
           System.out.println("Não autorizado a tirar CNH");
       }

       boolean c = false;
       if (c = true){ //Não é utilizado, apenas para fim de conhecimento
           System.out.println("Dentro de algo que nunca deve ser feito");
       }

    }
}
