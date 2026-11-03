package com.actividad.model;

/**
 * Representa a un cliente del sistema.
 */
public class Cliente {
    public String nombre;
    public Direccion direccion; // Composición de clases

    public Cliente(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
}
