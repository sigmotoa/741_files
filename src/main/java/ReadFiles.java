import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFiles {
    public static void main(String[] args) {
        FileReader archivo;
        BufferedReader lector;

        try{
            archivo = new FileReader("/Users/sigmotoa/Documents/UD/2024_1/objetos_741/codes/readingFiles/Reading/src/main/resources/leer.txt");

            if(archivo.ready())
            {
                lector = new BufferedReader(archivo);
                String linea;

                while ((linea= lector.readLine())!=null)
                {
                    System.out.println(linea);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }
}