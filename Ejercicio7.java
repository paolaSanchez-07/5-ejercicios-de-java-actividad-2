package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de meses (N): ");
        int n = teclado.nextInt();
        
        double pagoMensual = 100.0; 
        double totalPagado = 0.0;
        
        System.out.println("\n--- Plan de Pagos Mensuales ---");
        for (int mes = 1; mes <= n; mes++) {
            System.out.printf("Mes %d: Paga $%.2f%n", mes, pagoMensual);
            totalPagado += pagoMensual;
            pagoMensual *= 2; // Se duplica para el siguiente mes
        }
        
        System.out.printf("%nTotal acumulado despues de %d meses: $%.2f%n", n, totalPagado);
    }
}