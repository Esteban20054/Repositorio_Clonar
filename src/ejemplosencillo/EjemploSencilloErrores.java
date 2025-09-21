/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosencillo;

import java.util.Scanner;

public class EjemploSencilloErrores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJEMPLO SENCILLO TRY-CATCH ===");
        
        try {
            System.out.print("Ingrese primer número: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Ingrese segundo número: ");
            int num2 = scanner.nextInt();
            
            int resultado = num1 / num2;
            System.out.println("Resultado división: " + resultado);
            
        } catch (Exception e) {
            System.out.println("¡Error! Algo salió mal: " + e.getMessage());
        }
        
        System.out.println("El programa continúa...");
        scanner.close();
    }
}
