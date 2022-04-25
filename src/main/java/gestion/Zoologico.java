package gestion;

import java.util.ArrayList;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private static ArrayList<Zona> zonas;

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public static ArrayList<Zona> getZona() {
        return zonas;
    }

    public static void setZonas(ArrayList<Zona> zonas) {
        Zoologico.zonas = zonas;
    }

    public void agregarZonas(Zona zona) {
         Zoologico.zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
        int cantidad = 0;
        for (int i = 0; i < Zoologico.zonas.size(); i++) {
            cantidad += Zoologico.zonas.get(i).cantidadAnimales();
        }
        return cantidad;
    }
}
