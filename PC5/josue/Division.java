/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese numerador: ");
            int num = sc.nextInt();

            System.out.print("Ingrese denominador: ");
            int den = sc.nextInt();

            int resultado = num / den;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("❌ Error: No se puede dividir entre cero.");
        } catch (Exception e) {
            System.out.println("❌ Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Proceso terminado.");
            sc.close();
        }
    }
}

