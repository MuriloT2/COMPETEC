import java.util.Scanner;

public class despedida {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int X[] = new int [10];

        for (int cont = 0; cont < 10; cont++) {

            int valor = tec.nextInt();
        
            if (valor < 0 || valor == 0) {

                valor = 1;
                X[cont] = valor;

            } else {

                X[cont] = valor;

            }
        }

        for (int i = 0; i < 10; i++) {

            System.out.println("X[" + i + "] = " + X[i]);

        }
    }

}