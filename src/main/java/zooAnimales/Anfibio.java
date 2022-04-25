package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {

    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat,
            String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        Anfibio.listado.add(this);
    }

    public Anfibio() {
        super();
        Anfibio.listado.add(this);
    }

    public static ArrayList<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean getVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    
    public static int cantidadAnfibios() {
        return Anfibio.listado.size();
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    public static void crearRana(String nombre, int edad, String genero) {
        new Anfibio(nombre, edad, "selva", genero,"rojo", true);
        Anfibio.ranas++;
    }

    public static void crearSalamandra(String nombre, int edad, String genero) {
        new Anfibio(nombre, edad, "selva", genero,"negro y amarillo", false);
        Anfibio.salamandras++;
    }
}
