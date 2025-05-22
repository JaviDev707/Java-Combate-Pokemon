import java.util.HashMap;
import java.util.Map;

public class Multiplicadores {

    //Para un tipo de ataque (clave exterior), tengo un mapa de tipos del pokemon objetivo con sus respectivos multiplicadores
    public static Map<Tipo, Map<Tipo, Double>> multiplicadoresDeDmg = new HashMap<>();
    
    static{
        //Multiplicadores de daño del Tipo Normal
        Map<Tipo, Double> normalVS = new HashMap<>();
        normalVS.put(Tipo.NORMAL, 1.0);
        normalVS.put(Tipo.PLANTA, 1.0);
        normalVS.put(Tipo.FUEGO, 1.0);
        normalVS.put(Tipo.AGUA, 1.0);
        normalVS.put(Tipo.ELECTRICO, 1.0);
        multiplicadoresDeDmg.put(Tipo.NORMAL, normalVS);
    
        //Multiplicadores de daño del Tipo Planta
        Map<Tipo, Double> plantaVS = new HashMap<>();
        plantaVS.put(Tipo.NORMAL, 1.0);
        plantaVS.put(Tipo.PLANTA, 1.0);
        plantaVS.put(Tipo.FUEGO, 0.5);
        plantaVS.put(Tipo.AGUA, 2.0);
        plantaVS.put(Tipo.ELECTRICO, 0.5);
        multiplicadoresDeDmg.put(Tipo.PLANTA, plantaVS);
    
        //Multiplicadores de daño del Tipo Fuego
        Map<Tipo, Double> fuegoVS = new HashMap<>();
        fuegoVS.put(Tipo.NORMAL, 1.0);
        fuegoVS.put(Tipo.PLANTA, 2.0);
        fuegoVS.put(Tipo.FUEGO, 1.0);
        fuegoVS.put(Tipo.AGUA, 0.5);
        fuegoVS.put(Tipo.ELECTRICO, 1.0);
        multiplicadoresDeDmg.put(Tipo.FUEGO, fuegoVS);

        //Multiplicadores de daño del Tipo Agua
        Map<Tipo, Double> aguaVS = new HashMap<>();
        aguaVS.put(Tipo.NORMAL, 1.0);
        aguaVS.put(Tipo.PLANTA, 0.5);
        aguaVS.put(Tipo.FUEGO, 2.0);
        aguaVS.put(Tipo.AGUA, 1.0);
        aguaVS.put(Tipo.ELECTRICO, 0.5);
        multiplicadoresDeDmg.put(Tipo.AGUA, aguaVS);

        //Multiplicadores del tipo Electrico
        Map<Tipo, Double> electricoVS = new HashMap<>();
        electricoVS.put(Tipo.NORMAL, 1.0);
        electricoVS.put(Tipo.PLANTA, 0.5);
        electricoVS.put(Tipo.FUEGO, 1.0);
        electricoVS.put(Tipo.AGUA,2.0);
        electricoVS.put(Tipo.ELECTRICO, 1.0);
        multiplicadoresDeDmg.put(Tipo.ELECTRICO, electricoVS);
        
    }
    /**
     * Metodo que devuelve el multiplicador dependiendo del tipo del ataque y del pokemon objetivo
     */
    public static double getMultiplicador(Tipo tipoAtaque, Tipo tipoObjetivo){

        if (multiplicadoresDeDmg.containsKey(tipoAtaque)) {
            Map<Tipo, Double> vs = multiplicadoresDeDmg.get(tipoAtaque);
            return vs.getOrDefault(tipoObjetivo, 1.0);
        } else{
            return 1.0;
        } 
    }
    /**
     * Metodo que muestra el multiplicador por pantalla
     */
    public static void mostrarMultiplicadores(Ataque ataque, Pokemon pokemon){

        double mult = Multiplicadores.getMultiplicador(ataque.getTipo(), pokemon.getTipo());
        //Esto es para que el double mult no de errores
        if (Math.abs(mult - 1.0) < 0.0001) {
            System.out.println("El ataque ha sido neutro (x1)");
        } else if (Math.abs(mult - 2.0) < 0.0001) {
            System.out.println("El ataque ha sido muy eficaz! (x2)");
        } else if (Math.abs(mult - 0.5) < 0.0001) {
            System.out.println("El ataque ha sido poco eficaz (x0.5)");
        }
    }

}
