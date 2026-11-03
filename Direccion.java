package com.actividad.model;

/**
 * Representa una dirección física de un cliente.
 * Contiene atributos como calle, ciudad y región.
 */
public class Direccion {
    public String calle;
    public String ciudad;
    public String region;

    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }
}
