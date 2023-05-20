import java.util.Scanner;

public class aula2 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        // --- Exercicio 1 ---

        // System.out.println("Insira um valor: ");
        // double valor = tec.nextDouble();

        // if (valor % 2 == 0) {

        //     System.out.println("É par!");

        // } else {

        //     System.out.println("É impar!");

        // }

        // --- Exercicio 2 ---

        // int cont = 1;
        // int soma = 0;

        // while (cont <= 100) {

        //     soma += cont;
        //     cont++;

        //     System.out.println("O resultado é: " + soma);

        // }

        // --- Exercicio 3 ---

        // int senha = 0;

        // while (senha != 2208) {

        //     System.out.println("Insira a senha: ");
        //     senha = tec.nextInt();

        //     if (senha != 2208) {
        //         System.out.println("Senha inválida!");
        //     } else {
        //         System.out.println("Acesso permitido!");
        //     }

        // }

        // --- Exercicio 4 ---

        // System.out.println("Insira o valor da tabuada: ");
        // int valorT = tec.nextInt();

        // System.out.println("Tabuada do " + valorT + ":");

        // for (int cont = 1; cont <= 10; cont++) {

        //     int mult = valorT * cont;

        //     System.out.println(valorT + " X " + cont + " = " + mult);

        // }

        // --- Exercicio 5 ---

        System.out.println("Insira um valor: ");
        int n = tec.nextInt();

        System.out.println("Números impares até " + n + ":");

        for (int cont = 0; cont < n; cont++) {

            if (cont % 2 != 0) 
            System.out.println(cont);

        }

        tec.close();
        
    }
    
}
