import java.util.Scanner;

public class aula5 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        // System.out.println("Digite a quantidade de casos de teste: ");
        // int quant = tec.nextInt();

        // int quantAnalise = 0;
        
        // for (int cont = 0; cont <= quant; cont++) {

            
        //     String virus = tec.nextLine();
        //     String analise = tec.nextLine();
        //     char letra = analise.charAt(cont);

        //     if (virus.charAt(cont) == letra) {
        //         quantAnalise++;
        //     }

        //     System.out.println("A quantidade de vezes que aparece é: " + quantAnalise);
            
            
        // }

        //Atrapalhando hackers vacilões

        int n = tec.nextInt();

        for(int i = 0; i <= n; i++){

            String user = tec.nextLine();
            if(user.length() >= 2 ){
                user.substring(0, (user.length()-1));
                
            }

        }

        tec.close();

    }
}
