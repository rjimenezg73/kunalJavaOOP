package Logica;

public class Pikachu extends Pokemon implements IElectrico{

  public Pikachu() {
  }

  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola, soy Pikachu y éste es mi ataque Placaje");
  }

  @Override
  protected void atacarAraniazo() {
    System.out.println("Hola, soy Pikachu y éste es mi ataque Arañazo");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola, soy Pikachu y éste es mi ataque Mordizco");
  }

  @Override
  public void atacarImpacTrueno() {
    System.out.println("Hola, soy Pikachu y éste es mi ataque Impacto Trueno");
  }

  @Override
  public void atacarPunioTrueno() {
    System.out.println("Hola, soy Pikachu y éste es mi ataque Puño de Trueno");
  }

}
