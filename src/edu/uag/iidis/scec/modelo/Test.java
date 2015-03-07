package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;


/**
 * Esta clase es usada para representar un rol de un
 * usuario. 
 *
 * <p><a href="Test.java.html"><i>Ver código fuente</i></a></p>
 *
 * @author <a href="mailto:vramos@uag.mx">Victor Ramos</a>
 * @version 1.0
 */
public class Test extends ClaseBase 
        implements Serializable {

    private Long idTest;
    private String nombre;

    public Test() {
    }

    public Test(Long id){
        this.idTest = id;
    }

    public Test(Long idTest,String nombre){
        this.idTest=idTest;
        this.nombre=nombre;
    }

    /**
     * Regresa el id del rol.
     * @return Long
     */
    public Long getIdTest() {
        return this.idTest;
    }

    public void setIdTest(Long id) {
        this.idTest = id;
    }

    // ID Ciudad
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


   
}
