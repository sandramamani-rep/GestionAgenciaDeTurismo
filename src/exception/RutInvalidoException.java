/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 * Excepción personalizada para manejar errores relacionados
 * con el formato del RUT.
 */
public class RutInvalidoException extends Exception {
    /**
     * Constructor de la excepción.
     *
     * @param mensaje mensaje que explica el error ocurrido
     */
    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}
