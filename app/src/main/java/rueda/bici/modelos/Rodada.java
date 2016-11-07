package rueda.bici.modelos;

import java.util.Date;

/**
 * Created by juan on 7/11/16.
 */

public class Rodada {
    private Integer id;
    private String nombre;
    private String lugar;
    private Date fecha;

    public Rodada(Integer id, String nombre, String lugar, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}