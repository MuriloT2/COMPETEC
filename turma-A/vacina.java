import java.util.Scanner;

public class vacina {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Insira a quantidade de valores: ");
        int quant = tec.nextInt();

        int valores[] = new int[quant];

        for (int i = 0; i < quant; i++) {

            int valor = tec.nextInt();
            valores[i] = valor;

        }

        int procura = tec.nextInt();

        int cont = 0;

        for (int i = 0; i < quant; i++) {

            if (valores[i] == procura) {
                cont++;
            }

        }

        if (cont >= 2) {

            System.out.println("Achei o danado!");

        } else if (cont == 1) {

            System.out.println("Ainda não é o suficiente!");

        } else {

            System.out.println("Sumiu!");
            
        }


        tec.close();


    }
    
}
