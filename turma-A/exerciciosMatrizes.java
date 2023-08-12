import java.util.Scanner;

public class exerciciosMatrizes {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int [][] tabuleiro = new int[3][3];

        for (int cont = 0; cont < 3; cont++) {

            for (int i = 0; i < 3; cont++) {
                
                tabuleiro[cont][i] = tec.nextInt();

            }


        }

        for (int cont = 0; cont < 3; cont++) {

            for (int i = 0; i < 3; cont++) {

                System.out.print(tabuleiro[cont][i]);
                System.out.println("");

            }


        }
        


    }
    
}
