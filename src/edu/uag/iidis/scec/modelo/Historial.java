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
public class Historial extends ClaseBase 
        implements Serializable {

    private Long idHistorial;
    private Long idTest;
    private Long idPregunta;
    private Long idRespuesta;
    private Long resultado;

    public Historial() {
    }

    public Historial(Long id){
        this.idHistorial = id;
    }

    public Historial(Long idHistorial, Long idTest,Long idPregunta,Long idRespuesta,Long resultado){
        this.idHistorial=idHistorial;
        this.idTest=idTest;
        this.idPregunta=idPregunta;
        this.idRespuesta=idRespuesta;
        this.resultado=resultado;
    }

    /**
     * Regresa el id del rol.
     * @return Long
     */
    public Long getidHistorial() {
        return this.idHistorial;
    }

    public void setidHistorial(Long id) {
        this.idHistorial = id;
    }

    // ID Ciudad
    public Long getidTest() {
        return this.idTest;
    }

    public void setidTest(Long id) {
        this.idTest = id;
    }
    /**
     * Regresa el nombres del rol.
     * @return String
     */
    public Long getidPregunta() {
        return this.idPregunta;
    }
    public void setidPregunta(Long id) {
        this.idPregunta = id;
    }

    
    /**
     * Regresa la descripción del rol.
     * @return String
     */
    public Long getidRespuesta() {
        return this.idRespuesta;
    }
    public void setidRespuesta(Long id) {
        this.idRespuesta = id;
    }

    public Long getResultado() {
        return this.resultado;
    }
    public void setResultado(Long id) {
        this.resultado = id;
    }


   
}
