import java.util.Scanner;

public class aula1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        //--- Exercicio 1 ---

        // double abacaxi = 7.30;
        // double maca = 2.0;
        // double pera = 3.0;

        // System.out.println("Digite quantos abacaxis você deseja: ");
        // abacaxi *= tec.nextInt();

        // System.out.println("Digite quantas maçãs você deseja: ");
        // maca *= tec.nextInt();

        // System.out.println("Digite quantas peras você deseja: ");
        // pera *= tec.nextInt();

        // double valortotal = abacaxi + maca + pera;

        // System.out.println("O valor total da sua compra é: R$ " + valortotal);

        //---Exercicio 2---

        // System.out.println("Insira o 1° valor:");
        // double n1 = tec.nextDouble();

        // System.out.println("Insira o 2° valor:");
        // double n2 = tec.nextDouble();

        // if (n1 == n2) {
        //     System.out.println("Os números são iguais!");
        // } else if (n1 > n2) {
        //     System.out.println("O maior valor é o: " + n1);
        // } else if (n2 > n1) {
        //     System.out.println("O maior valor é: " + n2);
        // } else {
        //     System.out.println("Valores inválidos!");
        // }

        //--- Exercicio 3 ---

        // System.out.println("Insira sua idade:");
        // int idade = tec.nextInt();

        // if (idade >= 18) {
        //     System.out.println("Você é maior de idade!");
        // } else {
        //     System.out.println("Você é menor de idade!");
        // }

        //--- Exercicio 4 ---

        // System.out.println("Insira a primeira idade:");
        // int idade1 = tec.nextInt();

        // System.out.println("Insira a segunda idade:");
        // int idade2 = tec.nextInt();

        // if (idade1 > idade2) {
        //     System.out.println("A primeira idade é maior!");
        // } else if (idade2 > idade1) {
        //     System.out.println("A segunda idade é maior!");
        // } else if (idade1 == idade2) {
        //     System.out.println("As idades são iguais!");
        // } else {
        //     System.out.println("Valores inválidos!");
        // }

        //--- Exercicio 5 ---

        // System.out.println("Está chovendo?");
        // boolean chuva = tec.nextBoolean();

        // System.out.println("Está nublado?");
        // boolean nublado = tec.nextBoolean();
        
        // System.out.println("Levei meu guarda chuva?");
        // boolean guarda = tec.nextBoolean();

        // if (chuva == true) {

        //     System.out.println("Está chovendo!");

        // } else if (nublado == true) {

        //     System.out.println("Está nublado!");

        // } else {

        //     System.out.println("Está ensolarado!");

        // }

        // if (guarda == true) {

        //     System.out.println("Levei meu guarda chuva!");

        // } else {

        //     System.out.println("Não levei meu guarda chuva...");

        // }

        //--- Exercicio 7 ---

        //--- Exercicio 8 ---

        System.out.println("Insira um valor: ");
        double valor = tec.nextDouble();

        if(valor % 5 == 0 || valor % 3 == 0) {
            System.out.println("VERDADEIRO");
        } else {
            System.out.println("FALSO");
        }
    
    }
    
}
