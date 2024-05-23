public class Ejercicio4 {
  public static void main(String[] args) {
    String letras = "a,b,c,d,e,f";
    String letras1 = "a;b;c;d;e;f";
    String letras2 = "a\tb\tc\td\te\tf";
    String nombres = "pepe clara marcela amaranta cristian";

    String[] arrLetras = letras.split(",");
    String[] arrLetras2 = letras2.split("\t");
    String[] arrNombres = nombres.split(" ");

    System.out.println(letras);

    for (int i = 0; i < arrLetras.length; i++) {
      System.out.println(arrLetras[i]);
    }

    for (int i = 0; i < arrLetras2.length; i++) {
      System.out.println(arrLetras2[i]);
    }

    for (int i = 0; i < arrNombres.length; i++) {
      System.out.println(arrNombres[i]);
    }

    System.out.println(String.join("_", arrNombres));

  }
}
