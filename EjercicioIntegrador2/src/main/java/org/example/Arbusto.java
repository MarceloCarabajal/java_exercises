package org.example;

public class Arbusto extends Planta{
    private double anchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorHojas;
    private Boolean sePodaONo;

    public Arbusto() {
    }

    public Arbusto(String nombre, double altTallo, boolean tieneHojas, String climaIdeal, double anchoArbusto,
                   boolean esDomestico, String variedadArbusto, String colorHojas, Boolean sePodaONo) {
        super(nombre, altTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public Boolean getSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(Boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy Arbusto");
    }
}
