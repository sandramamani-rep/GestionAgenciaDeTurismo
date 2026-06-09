/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import exception.RutInvalidoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author sandramamani
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA AGENCIA DE TURISMO LLANQUIHUE TOUR  =====");
        System.out.println();

        try {
            //Creacion instancia clase Empleado
            //Se crea rut para un empleado
            Rut rutEmpleado = new Rut("27365817-3");
            //Se crea una dirección para el empleado
            Direccion direccionEmpleado = new Direccion(
                    "Maipu",
                    350,
                    "Santiago",
                    "Metropolitana"
            );
            // Se crea un empleado utilizando la dirección y rut anterior
            Empleado empleado1 = new Empleado(
                    "Guia Turistico",
                    500000,
                    "25122025",
                    rutEmpleado,
                    "Jose Rosales",
                    "956789843",
                    "jose@llanquehuetour.cl",
                    direccionEmpleado,
                    28
            );
            System.out.println("===== DATOS DEL EMPLEADO =====");
            // Se muestra la información del empleado
            empleado1.mostrarInformacion();
            
            
            //Creacion instancia clase Cliente
            //Se crea rut para cliente1
            Rut rutCliente = new Rut("12345678-9");
            // Se crea una dirección para el empleado
            Direccion direccionCliente = new Direccion(
                    "Los Copihues",
                    125,
                    "Puerto Varas",
                    "Los Lagos"
            );
           // Se crea un cliente utilizando la dirección y rut anterior
            Cliente cliente1 = new Cliente(
                    1,
                    "PA123456",
                    rutCliente,
                    "Maria Gonzalez",
                    "987654321",
                    "maria@gmail.com",
                    direccionCliente,
                    35
            );
            
            //Creacion instancia clase Cliente
            //Se crea rut para cliente2
            Rut rutCliente2 = new Rut("15678943-K");
            // Se crea una dirección para el empleado
            Direccion direccionCliente2 = new Direccion(
                    "Portales",
                    2456,
                    "Talagante",
                    "Metropolitana"
            );
           // Se crea un cliente utilizando la dirección y rut anterior
            Cliente cliente2 = new Cliente(
                    2,
                    "PA876543",
                    rutCliente2,
                    "Jose Ramirez",
                    "980674365",
                    "jramirez@gmail.com",
                    direccionCliente2,
                    29
            );

            System.out.println();
            System.out.println("===== DATOS DEL CLIENTE 1 =====");
            cliente1.mostrarInformacion();
            
            System.out.println();
            System.out.println("===== DATOS DEL CLIENTE 2 =====");
            cliente2.mostrarInformacion();
            
            System.out.println();
            System.out.println("===== Pruebas método toString() =====");
            System.out.println(empleado1.toString());
            System.out.println(cliente1.toString());
            System.out.println(cliente2.toString());

        } catch (RutInvalidoException ex) {
            System.out.println("Error al crear el clase Rut:");
            System.out.println(ex.getMessage());
        }
        
    }
}
