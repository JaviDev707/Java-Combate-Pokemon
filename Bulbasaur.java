public class Bulbasaur extends Pokemon{

    public Bulbasaur() {
        super("Bulbasaur", 160, Tipo.PLANTA, 45);
        ataques.add(new Ataque("Placaje", 20, Tipo.NORMAL));
        ataques.add(new Ataque("Absorber", 30, Tipo.PLANTA));
        ataques.add(new Ataque("Latigo cepa", 40, Tipo.PLANTA));
        ataques.add(new Ataque("Rascada de huevos", 0, Tipo.NORMAL));
    }
}
