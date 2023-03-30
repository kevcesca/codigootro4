package com.generation;

//Importar la clase Scanner del paquete java.util
import java.util.Scanner;

public class Codigo4 {

    public static void main(String[] args) {

        // Crear un objeto de la clase Scanner para leer entrada del usuario
        Scanner s = new Scanner(System.in);

        // Solicitar al jugador 1 que ingrese su elección
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        // Solicitar al jugador 2 que ingrese su elección
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();

        // Si las elecciones son iguales, es un empate
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            // Por defecto, se establece que el jugador 2 gana (para el caso de que no sea
            // empate)
            int g = 2;
            // Realizar una verificación de las elecciones de los jugadores para determinar
            // el ganador
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
                default:
            }
            // Mostrar el resultado del juego
            System.out.println("Gana el jugador " + g);
        }

    }

}