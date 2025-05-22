public class Ataque {
    
    private String nombre;
    private int dmg;
    private Tipo tipo;

    public Ataque(String nombre, int dmg, Tipo tipo) {
        this.nombre = nombre;
        this.dmg = dmg;
        this.tipo = tipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDmg() {
        return this.dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
