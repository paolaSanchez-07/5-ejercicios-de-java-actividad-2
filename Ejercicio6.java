package ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int numeroSecreto = aleatorio.nextInt(100) + 1; // Número del 1 al 100
        int intentosRestantes = 10;
        int intentosRealizados = 0;
        boolean haAcertado = false;
        
        System.out.println("Bienvenido al juego! Adivina el numero del 1 al 100.");
        
        while (intentosRestantes > 0 && !haAcertado) {
            System.out.print("\nIntentos restantes: " + intentosRestantes + ". Introduce tu numero: ");
            int numeroUsuario = teclado.nextInt();
            intentosRealizados++;
            intentosRestantes--;
            
            if (numeroUsuario == numeroSecreto) {
                haAcertado = true;
                System.out.println("¡Felicidades! Acertaste en " + intentosRealizados + " intentos.");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero secreto es MAYOR.");
            } else {
                System.out.println("El numero secreto es MENOR.");
            }
        }
        
        if (!haAcertado) {
            System.out.println("\nTe quedaste sin intentos. El numero era: " + numeroSecreto);
        }
    }
}
