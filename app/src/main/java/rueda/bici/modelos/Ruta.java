package rueda.bici.modelos;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by juan on 11/12/16.
 */

public class Ruta implements Serializable{

    private Integer id;
    private int imagen;
    private String nombre;
    private String organizador;
    private Date fecha;
    private String asistentes;
    private String likes;
    private String descripcion;
    private String duracion;
    private String puntoEncuentro;
    private String destino;

    public Ruta(Integer id, int imagen, String nombre, String organizador, Date fecha, String asistentes, String likes, String descripcion, String duracion, String puntoEncuentro, String destino) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.organizador = organizador;
        this.fecha = fecha;
        this.asistentes = asistentes;
        this.likes = likes;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.puntoEncuentro = puntoEncuentro;
        this.destino = destino;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(String asistentes) {
        this.asistentes = asistentes;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public void setPuntoEncuentro(String puntoEncuentro) {
        this.puntoEncuentro = puntoEncuentro;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
