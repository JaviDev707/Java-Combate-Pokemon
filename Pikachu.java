public class Pikachu extends Pokemon{
    
    public Pikachu() {
        super("Pikachu", 140, Tipo.ELECTRICO, 85);
        ataques.add(new Ataque("Arañazo", 20, Tipo.NORMAL));
        ataques.add(new Ataque("Impactrueno", 30, Tipo.ELECTRICO));
        ataques.add(new Ataque("Rayo", 40, Tipo.ELECTRICO));
        ataques.add(new Ataque("Rascada de huevos", 0, Tipo.NORMAL));
    }
}
