import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio6 {
  public static void main(String[] args) {
    String name = "src/valores.csv";
    try {
      FileReader fr = new FileReader(name);
      BufferedReader br = new BufferedReader(fr);

      // PrintWriter pw = new PrintWriter(name);
      
      String data;
      while ((data = br.readLine()) != null) {
        System.out.println(data);
      }

      fr.close();
      br.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
