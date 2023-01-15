package strems.leyendo;

import java.io.*;
//import java.io.IOException;

public class Leer_Fichero {
    public void lee() {
        try {
            FileReader entrada = new FileReader("C:/Users/ASUS/OneDrive/Escritorio/trabajo/archivo2.txt");

            int c = entrada.read();
            while (c != -1) {
                c = entrada.read();
                char letra = (char) c;
                System.out.print(letra);
            }
            entrada.close();

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo.");
        }

    }
}
