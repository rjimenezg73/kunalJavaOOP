package Logica;

public class Charmander extends Pokemon implements IFuego{

  public Charmander() {
  }

  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola, soy Charmander y éste es mi ataque Placaje");
  }

  @Override
  protected void atacarAraniazo() {
    System.out.println("Hola, soy Charmander y éste es mi ataque Arañazo");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola, soy Charmander y éste es mi ataque Mordisco");
  }

  @Override
  public void atacarLanzaLlamas() {
    System.out.println("Hola, soy Charmander y éste es mi ataque Lanza Llamas");
  }

  @Override
  public void atacarPunioFuego() {
    System.out.println("Hola, soy Charmander y éste es mi ataque Puño de Fuego");
  }

  @Override
  public void atacarAscuas() {
    System.out.println("Hola, soy Charmander y éste es mi ataque Ascuas");
  }
}
