import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SeleccionPkm {

    private static Pokemon miPokemon;
    private static Pokemon rivalPokemon;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    
    /**
     * Metodo para seleccionar mi pokemon entre los iniciales basicos
     */
    public static Pokemon seleccionarMiPokemon(){
        Pokemon[] listaMisPkm = { new Bulbasaur(), new Charmander(), new Squirtle() };
        while (miPokemon == null) {
            System.out.println("Elige tu pokemon inicial: ");
            System.out.println("1 - Bulbasaur, tipo planta");
            System.out.println("2 - Charmander, tipo fuego");
            System.out.println("3 - Squirtle, tipo agua");
            try {
                int opcion = scanner.nextInt();
                if (opcion > 0 && opcion < 4) {
                    miPokemon = listaMisPkm[opcion-1];
                } else {
                    System.out.println("La opción seleccionada no existe. Intentalo de nuevo");
                    System.out.println("--------------------------------------------------------------------------"); 
                }
            //En caso de que introduzcamos una letra
            } catch (InputMismatchException e) {
                System.out.println("Entrada no valida. Introduce un numero");
                System.out.println("--------------------------------------------------------------------------"); 
                scanner.nextLine(); //Limpiar el buffer
            }   
        }
        System.out.println("--------------------------------------------------------------------------"); 
        System.out.println("Elegiste a " + miPokemon.getNombre() + " de tipo " + miPokemon.getTipo().toString().toLowerCase() + "!");
        return miPokemon;
    }
    /**
     * Metodo para que el rival elija un pokemon aleatorio
     */ 
    public static Pokemon pokemonAleatorio(){
        //Posibles Pokemon entre los que puede elegir el rival
        List<Pokemon> posiblesPokemones = new ArrayList<>();
        posiblesPokemones.add(new Bulbasaur());
        posiblesPokemones.add(new Charmander());
        posiblesPokemones.add(new Squirtle());
        posiblesPokemones.add(new Pikachu());
        posiblesPokemones.add(new Raticate());
        posiblesPokemones.add(new Tauros());

        rivalPokemon = posiblesPokemones.get(random.nextInt(posiblesPokemones.size()));
        System.out.println("Tu rival es " + rivalPokemon.getNombre() + " de tipo " + rivalPokemon.getTipo().toString().toLowerCase() + "!");
        return rivalPokemon;
    }

}
