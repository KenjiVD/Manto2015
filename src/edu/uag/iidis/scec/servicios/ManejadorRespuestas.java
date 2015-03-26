package edu.uag.iidis.scec.servicios;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.uag.iidis.scec.modelo.Respuesta;
import edu.uag.iidis.scec.excepciones.*;
import edu.uag.iidis.scec.persistencia.RespuestaDAO;
import edu.uag.iidis.scec.persistencia.hibernate.*;

public class ManejadorRespuestas {
    private Log log = LogFactory.getLog(ManejadorRoles.class);
    private RespuestaDAO dao;

    public  ManejadorRespuestas() {
        dao = new RespuestaDAO();
    }


    public Collection listarRespuestas() {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarUsuario(usuario)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.buscarTodos();
            HibernateUtil.commitTransaction();
            return resultado;         
        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }
/*
    public Collection listarrespuestasOrd(String tipo, int tipoInt) {

        Collection resultado;

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.ordenarPor(tipo, tipoInt);
            HibernateUtil.commitTransaction();

              if (log.isDebugEnabled()) {
            log.debug("***Manejador respuestas ordenar: ok");
        }

            return resultado;         
       
        } catch (ExcepcionInfraestructura e) {
             if (log.isDebugEnabled()) {
            log.debug("***Manejador respuestas ordenar: failed");
        }
            HibernateUtil.rollbackTransaction();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }*/

    public void eliminarRespuesta(Long id) {
        if (log.isDebugEnabled()) {
            log.debug(">eliminarrespuesta(respuesta)");
        }
        try {
            HibernateUtil.beginTransaction();           
            Respuesta respuesta = dao.buscarPorId(id, true);
            if (respuesta != null) {
              dao.hazTransitorio(respuesta);
            }
            HibernateUtil.commitTransaction();
        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();
            if (log.isWarnEnabled()) {
                log.warn("<ExcepcionInfraestructura");
            }
        } finally {
            HibernateUtil.closeSession();
        }

    }

    public int crearRespuesta(Respuesta respuesta) {

        int resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarrespuesta(respuesta)");
        }

        try {
            HibernateUtil.beginTransaction();           
            
            if (dao.existeRespuesta(respuesta.getRespuesta())) {
               resultado = 1; // Excepción. El nombre de respuesta ya existe
            } else {

               dao.hazPersistente(respuesta);

               resultado = 0; // Exito. respuesta se creo satisfactoriamente.
            }

            HibernateUtil.commitTransaction();

        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();

            if (log.isWarnEnabled()) {
                log.warn("<ExcepcionInfraestructura");
            }
            resultado = 2;    // Excepción. Falla en la infraestructura
        } finally {
            HibernateUtil.closeSession();
        }
        return resultado;
    }    
}
