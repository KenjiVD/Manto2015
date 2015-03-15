package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;


/**
 * Esta clase es usada para representar un rol de un
 * usuario. 
 *
 * <p><a href="Pregunta.java.html"><i>Ver código fuente</i></a></p>
 *
 * @author <a href="mailto:vramos@uag.mx">Victor Ramos</a>
 * @version 1.0
 */
public class Pregunta extends ClaseBase 
        implements Serializable {

    private Long idPregunta;
    private Long idSeccion;
    private Long posicion;
    private Long idRespuestaCorrecta;
    private String pregunta;

    public Pregunta() {
    }

    public Pregunta(Long id){
        this.idPregunta = id;
    }

    public Pregunta(Long idSeccion,Long idRespuestaCorrecta,String pregunta){
      //  this.idPregunta=idPregunta;
        this.idSeccion=idSeccion;
      //  this.posicion=posicion;
        this.idRespuestaCorrecta=idRespuestaCorrecta;
        this.pregunta=pregunta;
    }

    /**
     * Regresa el id del rol.
     * @return Long
     */
    public Long getIdPregunta() {
        return this.idPregunta;
    }

    public void setIdPregunta(Long id) {
        this.idPregunta = id;
    }

    // ID Ciudad
    public Long getidSeccion() {
        return this.idSeccion;
    }

    public void setidSeccion(Long id) {
        this.idSeccion = id;
    }
    /**
     * Regresa el nombres del rol.
     * @return String
     */
    public String getPregunta() {
        return this.pregunta;
    }
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    
    /**
     * Regresa la descripción del rol.
     * @return String
     */
    public Long getRespuestaCorrecta() {
        return this.idRespuestaCorrecta;
    }
    public void setRespuestaCorrecta(Long id) {
        this.idRespuestaCorrecta = id;
    }

   
}
