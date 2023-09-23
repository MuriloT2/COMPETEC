import java.util.Scanner;
public class aula7 {

    public static void main(String[] args) {
    
        Scanner tec = new Scanner(System.in);

        int y = tec.nextInt();
        int x = tec.nextInt();

        int num = 1;

        for (int cont = 1; cont <= y; cont++) {

            for (int i = 1; i <= x; i++) {

                System.out.print(num + " ");
                num++;

            }

            System.out.println();

        }

        tec.close();
    }

}




















