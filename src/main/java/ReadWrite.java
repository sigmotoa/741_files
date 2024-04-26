import java.io.BufferedReader;
import java.io.FileWriter;

public class ReadWrite {

    public static void main(String[] args) {
        String mensaje = "Inscribete a la Maraton";

        try {
            FileWriter archivo_out = new FileWriter("/Users/sigmotoa/Documents/UD/2024_1/objetos_741/codes/readingFiles/Reading/src/main/resources/output.txt");
            archivo_out.write(mensaje);
            archivo_out.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }

    }

}