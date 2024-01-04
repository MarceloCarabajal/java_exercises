package org.example;

public abstract class Planta {
    private String nombre;
    private double altTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    public Planta() {
    }

    public Planta(String nombre, double altTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altTallo = altTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltTallo() {
        return altTallo;
    }

    public void setAltTallo(double altTallo) {
        this.altTallo = altTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public abstract void decirLoQueSoy();


}
