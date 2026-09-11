package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class AuthService {

    HashMap<String, Usuario> registroDeUsuarios = new HashMap<>();
    Scanner scan = new Scanner(System.in);

    // Registro de usuarios
    public void registrarUsuario(){
        System.out.printf("Ingrese el Username: ");
        String username = scan.nextLine();
        System.out.printf("Ingrese la contraseña: ");
        String password = scan.nextLine();
        System.out.printf("Ingrese el nombre completo del usuario: ");
        String nombreCompleto = scan.nextLine();
        System.out.printf("Ingrese el email: ");
        String email = scan.nextLine();

        if (username.isEmpty() || password.isEmpty() || nombreCompleto.isEmpty() || email.isEmpty()){
            System.out.println("Los datos ingresados estan incompletos, verificarlos antes de enviarlos de nuevo.");
        }
        else {
            Usuario nuevoUsuario = new Usuario(username, password, nombreCompleto, email);
            registroDeUsuarios.put(username, nuevoUsuario);
            System.out.println("El nuevo usuario fue registrado con éxito");
        }
    }

    // Inicio de sesión
    public void login(){
        System.out.printf("Ingresa el username: ");
        String username = scan.nextLine();
        System.out.printf("Ingresa la contraseña: ");
        String password = scan.nextLine();

        if (registroDeUsuarios.containsKey(username)){
            Usuario usuario = registroDeUsuarios.get(username);
            if (usuario.getPassword().equals(password)){
                System.out.println("¡Iniciaste sesión correctamente!");
                System.out.println("Bienvenido " + usuario.getNombreCompleto());
            }
            else {
                System.out.println("La contraseña ingresada no coincide con el usuario.");
            }
        }
        else {
            System.out.println("El usuario ingresado no existe.");
        }
    }

    // Eliminar cuenta de usuario
    public void eliminarUsuario(){
        System.out.printf("Ingrese el nombre del usuario que desea eliminar: ");
        String username = scan.nextLine();

        if (registroDeUsuarios.containsKey(username)){
            registroDeUsuarios.remove(username);
            System.out.println("El usuario se elimino correctamente.");
        }
        else {
            System.out.println("No existe ningún usuario con el nombre: " + username);
        }
    }

    // Verificar disponibilidad de username
    public boolean verificarDisponibilidad(){
        System.out.printf("Ingrese el username: ");
        String username = scan.nextLine();
        if (registroDeUsuarios.containsKey(username)){
            return false;
        }
        else {
            return true;
        }
    }

}
