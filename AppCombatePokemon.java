
public class AppCombatePokemon {
    public static void main(String[] args) throws Exception {

        Pokemon jugador = SeleccionPkm.seleccionarMiPokemon();
        Pokemon rival = SeleccionPkm.pokemonAleatorio();
        Combate combate = new Combate(jugador, rival);
        jugador.verHp();
        rival.verHp();
        combate.iniciarCombate();
    }
}

