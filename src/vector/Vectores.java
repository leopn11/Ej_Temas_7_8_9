package vector;

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {

        Vector<Integer> numeros = new Vector(6);
        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(10);
        System.out.println(numeros);

        numeros.remove(1);
        numeros.remove(2);
        System.out.println(numeros);

        /* 4.indica cuál es el problema de utilizar un Vector
         con la capacidad por defecto si tuviésemos 1000
         elementos para ser añadidos al mismo.

         El problema seria que el espacio de bytes que ocuparia
        seria gigantesco y en programacion debemos cuidar la memoria
        de nuestro ordenador si sabemos que vamos a utilizar 1000 elemetos
        podriamos darle una capacidad inicial de 1005.
         */

    }


}
