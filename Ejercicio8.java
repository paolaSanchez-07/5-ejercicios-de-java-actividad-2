package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String mejorAlumnoNoControl = "";
        double mejorPromedio = -1.0;
        
        // Ciclo externo para controlar los 20 alumnos
        for (int i = 1; i <= 20; i++) {
            System.out.println("\n--- Datos del Alumno " + i + " ---");
            System.out.print("Numero de Control: ");
            String noControl = teclado.next();
            
            double sumaCalificaciones = 0;
            
            // Ciclo para registrar las 5 unidades del alumno
            for (int unidad = 1; unidad <= 5; unidad++) {
                System.out.print("Calificacion Unidad " + unidad + ": ");
                double calificacion = teclado.nextDouble();
                sumaCalificaciones += calificacion;
            }
            
            double promedio = sumaCalificaciones / 5.0;
            System.out.printf("Promedio obtenido: %.2f%n", promedio);
            
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorAlumnoNoControl = noControl;
            }
        }
        
        System.out.println("\n");
        System.out.println("Alumno con el mayor promedio: " + mejorAlumnoNoControl);
        System.out.printf("Promedio más alto: %.2f%n", mejorPromedio);
        System.out.println("");
    }
}