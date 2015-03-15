package edu.uag.iidis.scec.vista;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;


/**
 * Form bean para el registro de una nueva Pregunta.
 *
 * @author Victor Ramos
 */
public final class FormaNuevaPregunta
        extends ValidatorForm {

    private Collection secciones;
    private int contador;
    private String pregunta;
    private Long idSeccion;
    private String  respuestaCorrecta;
    private String respuesta1;
    private String respuesta2;

    public void setSeccion(Collection secciones) {
        this.secciones = secciones;
        if (secciones != null) {
          this.contador = secciones.size();
        } else
          this.contador = -1;
    }

    public Collection getSeccion() {
        return (this.secciones);
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getNombre() {
        return (this.nombre);
    }


    public void setRespuestaCorrecta(String respuesta) {
        this.respuestaCorrecta = respuesta;
    }

    public String getRespuestaCorrecta() {
        return (this.respuestaCorrecta);
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta1() {
        return (this.respuesta1);
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta2() {
        return (this.respuesta2);
    }

    public void setidSeccion(Long id) {
        this.idSeccion = id;
    }

    public Long getidSeccion() {
        return (this.idSeccion);
    }

    
    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        pregunta=null;
        respuesta1=null;
        respuesta2=null;
        respuestaCorrecta=null;
        idSeccion=null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
