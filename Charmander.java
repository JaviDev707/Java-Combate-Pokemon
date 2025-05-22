public class Charmander extends Pokemon{

    public Charmander() {
        super("Charmander", 140, Tipo.FUEGO, 65);
        ataques.add(new Ataque("Placaje", 20, Tipo.NORMAL));
        ataques.add(new Ataque("Ascuas", 30, Tipo.FUEGO));
        ataques.add(new Ataque("Lanzallamas", 40, Tipo.FUEGO));
        ataques.add(new Ataque("Rascada de huevos", 0, Tipo.NORMAL));
    }
    
}
