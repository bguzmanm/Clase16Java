import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio8 {
  public static void main(String[] args) {
    String name = "src/carta.md";

    String first_name = "Brian";
    String last_name = "Guzmán";
    String email = "brian@guzman.org";

    try {
      FileWriter fw = new FileWriter(name);
      PrintWriter pw = new PrintWriter(fw);

      pw.printf("Estimado señor %s %s: ", first_name, last_name);
      pw.printf("Le escribirmos a su correo %s con el propósito de contactarlo \n" +
              "puesto que es beneficiario de una cuantiosa herencia del principe \n" +
              "del reino de Luxemburgo, pero necesita depositar us$100.000 para \n" +
              "confirmar su real intención\n", email);
      pw.printf("\n\nAtte.");
      pw.printf("\n\nEl Albacea del principe.");

      pw.close();
      fw.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
