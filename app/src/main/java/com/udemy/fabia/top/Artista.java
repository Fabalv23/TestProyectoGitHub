package com.udemy.fabia.top;

import java.util.Objects;

public class Artista {
    private long id;
    private String nombre;
    private String apellidos;
    private long fechaNacimiento;
    private String LugarNacimiento;
    private short estatura;
    private  String notas;
    private int orden;
    private String fotoURL;


    public Artista(long id, String nombre, String apellidos, long fechaNacimiento, String lugarNacimiento, short estatura, String notas, int orden, String fotoURL) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        LugarNacimiento = lugarNacimiento;
        this.estatura = estatura;
        this.notas = notas;
        this.orden = orden;
        this.fotoURL = fotoURL;
    }


    public Artista() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(long fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return LugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        LugarNacimiento = lugarNacimiento;
    }

    public short getEstatura() {
        return estatura;
    }

    public void setEstatura(short estatura) {
        this.estatura = estatura;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getFotoURL() {
        return fotoURL;
    }

    public void setFotoURL(String fotoURL) {
        this.fotoURL = fotoURL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artista artista = (Artista) o;
        return id == artista.id;
    }


}
