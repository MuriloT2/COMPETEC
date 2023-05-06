import java.util.Scanner;

public class aula0 {

    public static void main(String[] args) {

        // System.out.println("Teste");

        // String nome = "Murilo";
        // int idade = 16;
        // boolean tomou = true;

        // System.out.println("Meu nome: " + nome);
        // System.out.println("Minha idade: " + idade);
        // System.out.println("Tomei café? " + tomou);

        // double laranja = 17.06;
        // double uva = 11.49;
        // double soma = laranja + uva;

        // System.out.println("O valor da soma dos dois produtos é: R$" + soma);

        Scanner tec = new Scanner (System.in);

        System.out.print("Insira seu nome: ");
        String nome = tec.nextLine();

        System.out.print("Insira sua idade: ");
        int idade = tec.nextInt();

        System.out.println();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);

        tec.close();
    
    }

}


