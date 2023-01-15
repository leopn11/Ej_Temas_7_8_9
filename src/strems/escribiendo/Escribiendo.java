package strems.escribiendo;
import java.io.*;
public class Escribiendo {
    public void escribir(){
        String frase = "Esto es una prueba de escritura4";

        try {
            FileWriter  escritura = new FileWriter("C:/Users/ASUS/OneDrive/Escritorio/texto_nuevo.txt", true);

            for (int i = 0; i < frase.length(); i++) {

                escritura.write(frase.charAt(i));
            }
                escritura.close();
        } catch (IOException e){
            e.printStackTrace();

        }

    }
}
