package org.example;

import java.util.List;

public class Auto {
    private Long id;
    private String marca;
    private String modelo;
    private Propietario prop;
    private List<Propietario> listaPropietarios;

    public Auto() {
    }

    public Auto(Long id, String marca, String modelo, Propietario prop, List<Propietario> listaPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.prop = prop;
        this.listaPropietarios = listaPropietarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Propietario getProp() {
        return prop;
    }

    public void setProp(Propietario prop) {
        this.prop = prop;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", prop=" + prop +
                ", listaPropietarios=" + listaPropietarios +
                '}';
    }
}
