package array;


public class ArrayBidi {
    public static void main(String[] args) {

        int arrayDoble [][] = {
                {3, 5, 67, 9, },
                {4, 56, 78, 32}
        };
        for (int i = 0; i < arrayDoble.length; i++) {
            System.out.println("Valor de i = " + i);

            for (int j = 0; j < arrayDoble[1].length; j++) {
                System.out.println("Estoy en i = " + i + " " + j);

                System.out.println(arrayDoble[i][j]);
            }
        }
    }

}
