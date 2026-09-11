package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AuthService authService = new AuthService();
        Scanner scan = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----- AUTH SERVICE - CONTROL DE ACCESOS ------");
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Eliminar cuenta de usuario");
            System.out.println("4. Verificar disponibilidad de Username");
            System.out.println("5. Salir");
            opcion = Integer.parseInt(scan.nextLine());

            switch (opcion) {
                case 1:
                    authService.registrarUsuario();
                    break;
                case 2:
                    authService.login();
                    break;
                case 3:
                    authService.eliminarUsuario();
                    break;
                case 4:
                    boolean disponible = authService.verificarDisponibilidad();
                    if (disponible){
                        System.out.println("El Username se encuentra disponible.");
                    }
                    else {
                        System.out.println("Este Username ya existe, no está disponible.");
                    }
                    break;
                case 5:
                    System.out.println("Cerrando el sistema...");
                    break;
                default:
                    System.out.println("Opción inválida, intentalo de nuevo.");
                    break;
            }

        } while (opcion != 5);


    }
}