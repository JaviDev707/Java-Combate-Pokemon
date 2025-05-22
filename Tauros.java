public class Tauros extends Pokemon {

    public Tauros() {
        super("Tauros", 220, Tipo.NORMAL, 100);
        ataques.add(new Ataque("Placaje", 20, Tipo.NORMAL));
        ataques.add(new Ataque("Cornada", 40, Tipo.NORMAL));
        ataques.add(new Ataque("Doble filo", 60, Tipo.NORMAL));
        ataques.add(new Ataque("Rascada de huevos", 0, Tipo.NORMAL));
    }

}
