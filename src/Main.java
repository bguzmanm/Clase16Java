import java.io.File;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {

    // creando un directorio
    File directorio = new File("folder/folder_hijo");

    //if (directorio.mkdir()) {

    if (directorio.exists()) {
      System.out.println("El directorio ya existe");

    } else {
      if (directorio.mkdirs()) {
        System.out.printf("Directorio creado el directorio %s\n", directorio.getName());
      }
    }
    // creando un archivo vacío
    File archivo = new File(directorio.getAbsolutePath() + "/mi_archivo.txt");

    try {
      if (archivo.exists()) {
        System.out.println("El archivo ya existe, validado con exists");
      } else {
        if (archivo.createNewFile()) {
          System.out.printf("Archivo creado %s\n", archivo.getName());
        }
      }
    } catch (IOException e) {
      System.out.println("Ocurrió un error");
      e.printStackTrace();
    }


  }
}