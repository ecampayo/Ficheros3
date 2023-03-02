import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Introduce la primera ruta");
            String rutaA = sc.nextLine();
            System.out.println("Introduce la segunda ruta");
            String rutaB= sc.nextLine();
            System.out.println("Introduce la ruta final");
            String rutaDestino = sc.nextLine();
            Fichero.guardarRutas(rutaA,rutaB,rutaDestino);

            //Métodos
            Fichero.copiar();
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
