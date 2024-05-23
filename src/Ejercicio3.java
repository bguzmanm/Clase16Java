import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
  public static void main(String[] args) {
    crearFile();
  }

  public static void crearFile() {
    File dir = new File("src/miDirectorio");
    dir.mkdirs();

    File file = new File(dir.getAbsolutePath() + "/fichero.txt");

    try {
      file.createNewFile();

      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);

      bw.write("linea 1");
      bw.newLine();
      bw.write("linea 2");
      bw.close();

    } catch (IOException e) {
      e.printStackTrace();
      ;
    }

  }
}
