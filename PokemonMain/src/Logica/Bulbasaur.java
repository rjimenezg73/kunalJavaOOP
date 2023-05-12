package Logica;

public class Bulbasaur extends Pokemon implements IPlanta{

  public Bulbasaur() {
  }

  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola, soy Bulbasaur y éste es mi ataque Placaje");
  }

  @Override
  protected void atacarAraniazo() {
    System.out.println("Hola, soy Bulbasaur y éste es mi ataque Arañazo");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola, soy Bulbasaur y éste es mi ataque Mordisco");
  }

  @Override
  public void atacarDrenaje() {
    System.out.println("Hola, soy Bulbasaur y éste es mi ataque Drenaje");
  }

  @Override
  public void atacarParalizar() {
    System.out.println("Hola, soy Bulbasaur y éste es mi ataque Paralizar");
  }

}
