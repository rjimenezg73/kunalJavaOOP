package Logica;

public class PokemonMain {

  public static void main(String[] args) {

    Squirtle squirtle = new Squirtle();
    Charmander charmander = new Charmander();
    Bulbasaur bulbasaur = new Bulbasaur();
    Pikachu pikachu = new Pikachu();

    squirtle.atacarAraniazo();
    squirtle.atacarHidroBomba();

    charmander.atacarAraniazo();
    charmander.atacarLanzaLlamas();

    bulbasaur.atacarPlacaje();
    bulbasaur.atacarParalizar();

    pikachu.atacarMordisco();
    pikachu.atacarImpacTrueno();

  }

}
