import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadCSV {
    private BufferedReader lector;
    private String linea;
    private String registro[] = null;

    public void leerCSV(String file)
    {
        try{
            lector = new BufferedReader(new FileReader(file));
            while ((linea=lector.readLine())!=null)
            {
                registro = linea.split(",");
                imprimirRegistro();
                System.out.println();
            }
            lector.close();
            linea=null;
            registro=null;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    public void imprimirRegistro()
    {
        for (int i = 0; i < registro.length; i++) {
            System.out.print(registro[i]+"\t|\t");
        }
    }
}