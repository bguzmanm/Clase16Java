import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {
  public static void main(String[] args) {
    String name = "src/valores.csv";
    try {
      FileReader fr = new FileReader(name);
      String lectura = "";

      int data = fr.read(); // leer el primer caracter
      while (data != -1) {
        lectura += (char) data; // concatena caracter a caracter
        data = fr.read(); // leer el siguiente caracter
      }

      System.out.println(lectura); // muestra todo el resultado

      fr.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
