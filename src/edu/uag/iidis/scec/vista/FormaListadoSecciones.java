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
public final class FormaListadoSecciones
        extends ValidatorForm {

    private Collection test;
    private int contador2;
    private Collection secciones;
    private int contador;

    public void setTest(Collection test) {
        this.test = test;
        if (test != null) {
          this.contador2 = test.size();
        } else
          this.contador2 = -1;
    }

    public Collection getEstados() {
        return (this.test);
    }

    public void setSecciones(Collection secciones) {
        this.secciones = secciones;
        if (secciones != null) {
          this.contador = secciones.size();
        } else
          this.contador = -1;
    }

    public Collection getSecciones() {
        return (this.secciones);
    }
  
    public int getContador() {
        return (this.contador);
    }


    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        contador=0;
        secciones=null;
        contador2=0;
        test=null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
