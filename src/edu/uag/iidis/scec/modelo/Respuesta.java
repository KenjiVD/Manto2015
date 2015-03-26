package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;


/**
 * Esta clase es usada para representar un rol de un
 * usuario. 
 *
 * <p><a href="Respuesta.java.html"><i>Ver c�digo fuente</i></a></p>
 *
 * @author <a href="mailto:vramos@uag.mx">Victor Ramos</a>
 * @version 1.0
 */
public class Respuesta extends ClaseBase 
        implements Serializable {

    private Long id;
    private Long idPregunta;
    private String respuesta;

    public Respuesta() {
    }

    public Respuesta(Long id){
        this.id = id;
    }

    public Respuesta( Long idPregunta,String respuesta){
     //   this.id=idRespuesta;
        this.idPregunta=idPregunta;
        this.respuesta=respuesta;
    }

    /**
     * Regresa el id del rol.
     * @return Long
     */
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // ID Ciudad
    public Long getidPregunta() {
        return this.idPregunta;
    }

    public void setidPregunta(Long id) {
        this.idPregunta = id;
    }
    /**
     * Regresa el nombres del rol.
     * @return String
     */
    public String getRespuesta() {
        return this.respuesta;
    }
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }


   
}
