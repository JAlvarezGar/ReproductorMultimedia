package com.example.jjalv.reproductormultimedia.entidades;

/**
 * Created by jjalv on 08/02/2020.
 */
public class ContenidosMultiMedia {

    private Integer Id;
    private String nombre;
    private String preferencias;

    public ContenidosMultiMedia(Integer id, String nombre, String preferencias) {
        Id = id;
        this.nombre = nombre;
        this.preferencias = preferencias;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }


}
