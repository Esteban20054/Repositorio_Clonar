/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

public class ListaEjemplo {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("María");

        // Recorrer lista
        System.out.println("Lista de nombres:");
        for (String n : nombres) {
            System.out.println("- " + n);
        }

        // Acceder por índice
        System.out.println("Primer nombre: " + nombres.get(0));

        // Eliminar un elemento
        nombres.remove("Luis");
        System.out.println("Lista después de eliminar a Luis: " + nombres);
    }
}

