package models;

public class Profesor {

  public String variablePublica = "Acceso a una variable pública";
  private String variablePrivada = "Acceso a una variable privada";
  protected String variableProtected = "Acceso a una variable protegida";
  // Protected solo puede ser accedida desde la misma clase que la contiene y desde
  // las clases que estén en el mismo paquete de dicha clase

  // Las variables estáticas, no van a variar su valor por más instancias que nosotros
  // tengamos de la clase
  static String miInstitucion = "El Nombre de mi Institución";
  // La diferencia de un static con otra variable
  String curso = "";


  public static void main(String[] args) {

    Profesor prof1 = new Profesor();


    // Comprobar acceso a variable públicas
    System.out.println(prof1.variablePublica + " desde Clase Profesor");

    // Comprobar el acceso a variables privadas de ésta misma clase ya que desde fuera no se pudo
    System.out.println(prof1.variablePrivada + " desde Clase Profesor");

    // Comprobar el acceso a variables protected de ésta misma clase ya que desde fuera no se pudo
    System.out.println(prof1.variableProtected + " desde Clase Profesor");


    Profesor prof2 = new Profesor();
    Profesor prof3 = new Profesor();
    Profesor prof4 = new Profesor();
    Profesor prof5 = new Profesor();

    prof1.curso = "Matemáticas";
    prof2.curso = "Español";
    prof3.curso = "Química";
    prof4.curso = "Física";
    prof5.curso = "Pol+itica";

    System.out.println(prof1.miInstitucion);
    System.out.println(prof2.miInstitucion);
    System.out.println(prof3.miInstitucion);
    System.out.println(prof4.miInstitucion);
    System.out.println(prof5.miInstitucion);

    // Accesando desde la clase principal(Profesor)
    System.out.println(Profesor.miInstitucion);

  }
}

