/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JOSUE
 */
public class calculadora {

    // Suma de dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Suma de dos decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    // Suma de tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        calculadora calc = new calculadora();

        System.out.println("Suma de enteros: " + calc.sumar(3, 5));
        System.out.println("Suma de decimales: " + calc.sumar(2.5, 4.7));
        System.out.println("Suma de tres enteros: " + calc.sumar(1, 2, 3));
    }
}
