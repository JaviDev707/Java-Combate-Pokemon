import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    
    protected String nombre;
    protected int vida;
    protected ArrayList<Ataque> ataques = new ArrayList<>();
    protected Tipo tipo;
    protected int velocidad;

    public Pokemon() {
    }    

    public Pokemon(String nombre, int vida, Tipo tipo, int velocidad) {
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }
    /**
     * Metodo para modificar la vida, esta no puede bajar de 0
     */
    public int takeDmg(int dmg){
        vida = Math.max(vida - dmg, 0);
        return vida;
    }
    /**
     * Metodo para ver la vida
     */
    public void verHp(){
        System.out.println(getNombre() + " tiene " + getVida() + " hp");
    }
    /**
     * Metodo para comprobar si el pokemon esta vivo
     */
    public boolean estaVivo(){
        if (vida > 0) {
            return true;
        } else{
            return false;
        }
    }
    /**
     *Metodo con el que atacan los Pokemon, resta vida y aplica multiplicadores
     */
    public void atacar(Pokemon objetivo, Ataque ataque){
        double multiplicador = Multiplicadores.getMultiplicador(ataque.getTipo(), objetivo.getTipo());
        objetivo.takeDmg((int) (ataque.getDmg() * multiplicador));
        System.out.println(objetivo.getNombre() + " ha recibido " + ataque.getNombre() + " y ahora tiene " + objetivo.getVida() + " hp");
        Multiplicadores.mostrarMultiplicadores(ataque, objetivo);
    }
    /**
     * Metodo con el que el Pokemon rival selecciona una ataque aleatoriamente
     */
    public void atacarAleatorio(Pokemon objetivo){
        if (ataques.size() > 0) {
            Ataque ataque = ataques.get((int) (Math.random() * ataques.size()));
            atacar(objetivo, ataque);
        }
    } 

}
