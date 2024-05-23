import java.io.File;

public class Ejercicio1 {

  public static void main(String[] args) {
    crearDirectorio("mi_directorio");
  }

  public static void crearDirectorio(String directorio) {
    File dir = new File("src/" + directorio);
    if (!dir.exists()) {
      dir.mkdir();
    }
  }
}
