package com.example.mobile_app.Entidades;

import java.io.Serializable;

public class pagos implements Serializable {

    public Integer getId_suscripcion() {
        return id_suscripcion;
    }

    public void setId_suscripcion(Integer id_suscripcion) {
        this.id_suscripcion = id_suscripcion;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    private Integer id_suscripcion;
    private String fecha_final;

    public pagos(Integer id_suscripcion, String fecha_final) {
        this.id_suscripcion = id_suscripcion;
        this.fecha_final = fecha_final;
    }






}
