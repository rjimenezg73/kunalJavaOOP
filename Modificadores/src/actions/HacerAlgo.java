package actions;

import models.Profesor;

public class HacerAlgo {


  public static void main(String[] args) {
    Profesor prof1 = new Profesor();

    System.out.println(prof1.variablePublica + " desde Clase HacerAlgo");
    // System.out.println(prof1.variablePrivada); Acá marca error: "variablePrivada has private access in models.Profesor"
    // System.out.println(prof1.variableProtected); Acá marca error: "variableProtected has protected access in models.Profesor"

  }
}
