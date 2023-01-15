package exepciones;

public class Trows {

    public static void main(String[] args) {

        System.out.println(divide(4,3));
        System.out.println(divide(6,0));
    }
    public static int divide(int A, int B) {
        int divisor = 0;
       try{
           divisor = A/B;
       }catch (Exception e){
           System.out.println("Error al dividir por cero");
       }
       return divisor;

    }

}
