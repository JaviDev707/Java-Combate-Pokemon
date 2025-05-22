public class Raticate extends Pokemon{

    public Raticate() {
        super("Raticate", 200, Tipo.NORMAL, 97);
        ataques.add(new Ataque("Placaje", 20, Tipo.NORMAL));
        ataques.add(new Ataque("Arañazo", 30, Tipo.NORMAL));
        ataques.add(new Ataque("Superdiente", 40, Tipo.NORMAL));
        ataques.add(new Ataque("Rascada de huevos", 0, Tipo.NORMAL));
    }

}
