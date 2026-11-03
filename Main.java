package com.actividad.app;

import com.actividad.model.Cliente;
import com.actividad.model.Direccion;

public class Main {
    public static void main(String[] args) {
        Direccion dir = new Direccion("Av. Libertador 123", "Valparaíso", "Valparaíso");
        Cliente cliente = new Cliente("Ana Salas", dir);

        System.out.println("--- DATOS DEL CLIENTE ---");
        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Dirección: " + cliente.direccion.calle + ", " + cliente.direccion.ciudad);
    }
}
