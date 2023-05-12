package Logica;

public class Squirtle extends Pokemon implements IAgua{

  public Squirtle() {
  }

  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola, soy Squirtle y éste es mi ataque Placaje");
  }

  @Override
  protected void atacarAraniazo() {
    System.out.println("Hola, soy Squirtle y éste es mi ataque Arañazo");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola, soy Squirtle y éste es mi ataque Mordisco");
  }

  @Override
  public void atacarHidroBomba() {
    System.out.println("Hola, soy Squirtle y éste es mi ataque Hidro Bomba");
  }

  @Override
  public void atacarBurbuja() {
    System.out.println("Hola, soy Squirtle y éste es mi ataque Burbuja");
  }

  @Override
  public void atacarPistolaAgua() {
    System.out.println("Hola, soy Squirtle y éste es mi ataque Pistola de Agua");
  }

}
