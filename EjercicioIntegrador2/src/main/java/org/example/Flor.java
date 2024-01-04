package org.example;

public class Flor extends Planta{
    private String colorPetalos;
    private int cantPromPetalos;
    private String colorPistilo;
    private String variedadFlor;
    private String estacionFlorece;

    public Flor() {
    }

    public Flor(String nombre, double altTallo, boolean tieneHojas, String climaIdeal, String colorPetalos,
                int cantPromPetalos, String colorPistilo, String variedadFlor, String estacionFlorece) {
        super(nombre, altTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPromPetalos = cantPromPetalos;
        this.colorPistilo = colorPistilo;
        this.variedadFlor = variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantPromPetalos() {
        return cantPromPetalos;
    }

    public void setCantPromPetalos(int cantPromPetalos) {
        this.cantPromPetalos = cantPromPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("hola,, soy Flor");
    }
}
