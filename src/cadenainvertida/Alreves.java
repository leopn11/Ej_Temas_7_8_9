package cadenainvertida;

public class Alreves {
    public static void main(String[] args) {

        String cadena = "Hola Mundo";
        System.out.println(cadena);

        char []invertir = cadena.toCharArray();  //.toCharArray este paso comvierte la variable cadena a char
        System.out.println(invertir[7]);
        int cont;
        for(cont = cadena.length()-1; cont >=0;cont --) {
            System.out.print( invertir[cont]);
        }



    }
}
