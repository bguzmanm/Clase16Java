import java.io.*;

public class Ejercicio2 {
  public static void main(String[] args) {

    String dir = "myStuff/myFiles";
    String file = "myFile.md";

    crearArchivo(dir, file);
    escribirArchivo(dir + "/" + file);
    leerArchivo(dir + "/" + file);
  }

  public static void crearArchivo(String nombreDirectorio, String nombreArchivo) {
    File directorio = new File(nombreDirectorio);

    if (!directorio.exists()) {
      directorio.mkdirs();
    }

    File archivo = new File(directorio.getAbsoluteFile() + "/" + nombreArchivo);

    try {
      if (archivo.createNewFile()) {
        System.out.println("Archivo creado");
      }
    } catch (IOException e) {
      System.out.println("Error en creación de archivo");
      e.printStackTrace();
    }
  }

  public static void escribirArchivo(String nombreArchivo) {

    File f = new File(nombreArchivo);
    try {
      FileWriter fw = new FileWriter(f);
      BufferedWriter bw = new BufferedWriter(fw);

      bw.write("# Hola, este es mi archivo markdown\n");
      bw.write("Este es texto que generamos para ver como va la cosa\n");
      bw.write("Esperamos que todo salga bien.");
      bw.close();

    } catch (IOException e) {
      System.out.println("Error escribiendoArchivo");
      e.printStackTrace();
    }
  }

  public static void leerArchivo(String nombreArchivo) {
    File f = new File(nombreArchivo);
    try {
      FileReader fr = new FileReader(f);
      BufferedReader br = new BufferedReader(fr);

      String linea;

      while ((linea = br.readLine()) != null) {
        System.out.println(linea);
      }

      br.close();

    } catch (IOException e) {
      System.out.println("Error escribiendoArchivo");
      e.printStackTrace();
    }
  }

}


