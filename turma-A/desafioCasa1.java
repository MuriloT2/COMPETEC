import java.util.Scanner;

public class desafioCasa1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Insira o DDD do número desejado: ");
        int ddd = tec.nextInt();

        if (ddd == 11) {
            System.out.println("PÔ MANO!");
        } else if (ddd == 21) {
            System.out.println("Pegou a visão irmão?");
        } else {
            System.out.println("Nada vê!");
        }

        tec.close();

    }
    
}
