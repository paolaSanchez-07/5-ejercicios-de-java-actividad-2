package ejercicio5;

import java.math.BigInteger;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Los primeros 50 numeros de la sucesion de Fibonacci:");
        
        BigInteger a = BigInteger.ZERO; // Empieza en 0
        BigInteger b = BigInteger.ONE;  // Sigue en 1
        
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ": " + a);
            
            BigInteger siguiente = a.add(b);
            a = b;
            b = siguiente;
        }
    }
}