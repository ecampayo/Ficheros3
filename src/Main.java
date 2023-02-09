import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;


        try (FileWriter pw= new FileWriter("Holi.txt",true); PrintWriter salida = new PrintWriter(pw)){

            System.out.println("introduce un texto");
            cadena= sc.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")){
                salida.println(cadena);
                cadena=sc.nextLine();
            }

        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
