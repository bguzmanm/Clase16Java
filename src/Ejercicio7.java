import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio7 {
  public static void main(String[] args) {
    String name = "src/valores2.csv";
    List<Integer> lista = new ArrayList<Integer>(Arrays.asList(3, 4, 3, 2, 5, 7, 8));

    try {
      FileWriter fw = new FileWriter(name, true);
      PrintWriter pw = new PrintWriter(fw);

      for (int i = 0; i < lista.size(); i++) {
        pw.println(lista.get(i));
      }

      pw.close();
      fw.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
