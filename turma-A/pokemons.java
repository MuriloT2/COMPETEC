 import java.util.Scanner; 
 
 public class pokemons {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.println("Insira o tamanho do arranjo: ");
        int tamanho = tec.nextInt();

    String pokemons[] = new String [tamanho];

    for (int cont = 0; cont < tamanho; cont++) {

        String pokemon = tec.nextLine();
        pokemons[cont] = pokemon;

    }

    String pokemons2[] = new String [tamanho];

    for (int cont = 0; cont < tamanho; cont++) {

        pokemons2[cont] = pokemons[cont];

    }

    for (int cont = 0; cont < tamanho; cont++) {
        
        if (pokemons[cont].compareToIgnoreCase(pokemons2[cont+1]) > 0) {

            String pokemonAntes = pokemons2[cont+1];

            pokemons[cont] = pokemonAntes;

        }

}

tec.close();

    }

}