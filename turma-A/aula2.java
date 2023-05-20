import java.util.Scanner;

public class aula2 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        double valor = tec.nextDouble();

        if (valor % 2 == 0) {

            System.out.println("É par!");

        } else {

            System.out.println("É impar!");
            
        }
        
    }
    
}
