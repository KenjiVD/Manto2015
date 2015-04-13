package edu.uag.iidis.scec.vista;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;


/**
 * Form bean para el registro de una nueva persona.
 *
 * @author Victor Ramos
 */
public final class FormaListadoEliminar
        extends ValidatorForm {

    private Collection test;
    private Collection seccion;
    private Collection pregunta;
    private Collection respuesta;
    private int contadorTest;
    private int contadorSeccion;
    private int contadorPregunta;
    private int contadorRespuesta;
    private Long idTest;
    private Long idSeccion;
    private Long idPregunta;
    private Long idRespuesta;

    public void setTest(Collection test) {
        this.test = test;
        if (test != null) {
          this.contadorTest = test.size();
        } else
          this.contadorTest = -1;
    }

    public Collection getTest() {
        return (this.test);
    }

    public void setSeccion(Collection seccion){
        this.seccion = seccion;
        if (seccion != null) {
          this.contadorSeccion = test.size();
        } else
          this.contadorSeccion = -1;
    }

    public Collection getSeccion() {
        return (this.seccion);
    }

    public void setPregunta(Collection pregunta){
        this.pregunta = pregunta;
        if (pregunta != null) {
          this.contadorPregunta = test.size();
        } else
          this.contadorPregunta = -1;
    }

    public Collection getPregunta() {
        return (this.pregunta);
    }
    
    public void setRespuesta(Collection respuesta){
        this.respuesta = respuesta;
        if (respuesta != null) {
          this.contadorRespuesta = test.size();
        } else
          this.contadorRespuesta = -1;
    }

    public Collection getRespuesta() {
        return (this.pregunta);
    }
  
    public void setIdTest(Long idTest){
        this.idTest=idTest;
    }

    public Long getIdTest(){
        return this.idTest;
    }
    public void setIdSeccion(Long idSeccion){
        this.idSeccion=idSeccion;
    }
    public Long getIdSeccion(){
        return this.idSeccion;
    }
    public void setIdPregunta(Long idPregunta){
        this.idPregunta=idPregunta;
    }
    public Long getIdPregunta(){
        return this.idSeccion;
    }
    public void setIdRespuesta(Long idRespuesta){
        this.idRespuesta=idRespuesta;
    }
    public Long getIdRespuesta(){
        return this.idRespuesta;
    }



    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        
        contadorTest=0;
        contadorSeccion=0;
        contadorRespuesta=0;
        contadorPregunta=0;
        test=null;
        seccion=null;
        pregunta=null;
        respuesta=null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
