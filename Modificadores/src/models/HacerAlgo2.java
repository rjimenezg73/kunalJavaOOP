package models;

public class HacerAlgo2 {
  public static void main(String[] args) {
    Profesor prof1 = new Profesor();

    // Comprobar el acceso a una variable protegida desde una clase distinta a la que la contiene
    // pero que se encuentra en el mismo paquete
    System.out.println(prof1.variableProtected + " desde la Clase HacerAlgo2");

    //System.out.println(prof1.variablePrivada);  error: variablePrivada has private access in models.Profesor
  }
}
