import java.util.InputMismatchException;
import java.util.Scanner;

public class Combate extends Pokemon{
    
    private Pokemon miPokemon;
    private Pokemon rivalPokemon;
    private Ataque miAtaque;
    private Scanner scanner = new Scanner(System.in);

    public Combate(Pokemon miPokemon, Pokemon rivalPokemon) {
        this.miPokemon = miPokemon;
        this.rivalPokemon = rivalPokemon;
    }
    /** 
     * Metodo con la logica de los turnos y el combate, empieza el pokemon con la velocidad mas alta
     */
    public void iniciarCombate(){
        valorarVelocidad();
        
        while (miPokemon.estaVivo() && rivalPokemon.estaVivo()) {
            System.out.println("--------------------------------------------------------------------------");
            //Si mi pokemon tiene mas velocidad
            if (miPokemon.getVelocidad() >= rivalPokemon.getVelocidad()) { 
                miTurno();
                if (rivalPokemon.estaVivo()){
                    rivalPokemon.atacarAleatorio(miPokemon);
                }
            }
            //Si el pokemon rival tiene mas velocidad
            else if (miPokemon.getVelocidad() < rivalPokemon.getVelocidad()) {
                rivalPokemon.atacarAleatorio(miPokemon);
                if (miPokemon.estaVivo()) {
                    miTurno();
                } 
            }
            System.out.println("--------------------------------------------------------------------------");
        } 
        System.out.println("*** " +(miPokemon.estaVivo() ? miPokemon.getNombre() : rivalPokemon.getNombre()) + " ha ganado el combate. ***");
        System.out.println("--------------------------------------------------------------------------");
        scanner.close();
    }
    /**
     * Metodo que valora la velocidad de los pokemon y muestra quien es mas veloz
     */
    private void valorarVelocidad(){
        if (miPokemon.getVelocidad() >= rivalPokemon.getVelocidad()) { 
            System.out.println("Tu Pokemon es mas veloz, empiezas el combate!");
        } else if (miPokemon.getVelocidad() < rivalPokemon.getVelocidad()) {
            System.out.println("Tu Pokemon es mas lento, tu rival empieza el combate");
        }
    } 
    /**
     * Metodo con el que selecciono el ataque de mi pokemon y este ataca
     */
    private void miTurno(){
        miAtaque = null; //Reinicio miAtaque cada vez que se ejecuta el metodo miTurno
        while (miAtaque == null) {
            System.out.println("- - - - - - - - - - - - - - - - - - -");
            System.out.println("Tu turno, Selecciona tu ataque:");
        for (int i = 0; i < miPokemon.getAtaques().size(); i++) {
            System.out.println((i + 1) + ". " + miPokemon.getAtaques().get(i).getNombre() + " - Daño: " + miPokemon.getAtaques().get(i).getDmg());
        }    
        try {
            int opcion = scanner.nextInt();
            if (opcion > 0 && opcion <= miPokemon.getAtaques().size()) {
                miAtaque = miPokemon.getAtaques().get(opcion - 1);
            } else {
                System.out.println("La opción seleccionada no existe. Elige otro ataque.");
                System.out.println("--------------------------------------------------------------------------");
            }
        //En caso de que introduzcamos una letra
        } catch (InputMismatchException e) {           
            System.out.println("Entrada no valida. Introduce un numero");
                System.out.println("--------------------------------------------------------------------------"); 
                scanner.nextLine(); //Limpiar el buffer            
        }
        }
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        miPokemon.atacar(rivalPokemon, miAtaque);
    }
}
