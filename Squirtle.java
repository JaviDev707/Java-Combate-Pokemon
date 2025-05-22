public class Squirtle extends Pokemon{

    public Squirtle() {
        super("Squirtle", 180, Tipo.AGUA, 43);
        ataques.add(new Ataque("Placaje", 20, Tipo.NORMAL));
        ataques.add(new Ataque("Burbuja", 30, Tipo.AGUA));
        ataques.add(new Ataque("Pistola Agua", 40, Tipo.AGUA));
        ataques.add(new Ataque("Rascada de huevos", 0, Tipo.NORMAL));
    }
    
}
