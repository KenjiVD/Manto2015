    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>


    <br>
    <font size='5'><fmt:message key="formaNuevaPregunta.titulo" /></font>

    <form id="forma" action="procesarRegistroPregunta.do" method="post">
        <div class="table">
            <div class="tr">
                <div class="td" colspan="2">
                   <html:errors />
                </div>
            </div>
            <div class="tr">
                <div class="td" align="right">
                    <fmt:message key="formaNuevaPregunta.etiqueta.pregunta" />
                </div>
                <div class="td" align="left">
                    <input type="text" 
                           name="pregunta" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevaPregunta.pregunta}" />
                </div>
            </div>
            <div class="tr">
                <div class="td" align="right">
                    <fmt:message key="formaNuevaPregunta.etiqueta.respuesta" />
                </div>
                <div class="td" align="left">
                    <input type="text" 
                           name="respuesta01" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevaPregunta.respuesta01}" />
                </div>
            </div>
            <div class="tr">
                <div class="td" align="right">
                    <fmt:message key="formaNuevaPregunta.etiqueta.respuesta02" />
                </div>
                <div class="td" align="left">
                    <input type="text" 
                           name="respuesta02" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevaPregunta.respuesta02}" />
                </div>
            </div>
            <div class="tr">
                <div class="td" align="right">
                    <fmt:message key="formaNuevaPregunta.etiqueta.respuesta03" />
                </div>
                <div class="td" align="left">
                    <input type="text" 
                           name="respuesta03" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevaPregunta.respuesta03}" />
                </div>
            </div>
            <div class="tr">
                <div class="td" align="right">
                    <fmt:message key="formaNuevaPregunta.etiqueta.seccion" />
                </div>
                <div class="td" align="left" style="position:relative">
                    <input type="text" 
                           id ="seccionBuscar" autocomplete="off" />
                    <div class="buscar">
                      <ul>
                      </ul>
                    </div>
                    <input type="text" 
                           id="idSeccion"
                           name="idSeccion" 
                           size="50" 
                           style="display:none"
                           maxlength="100" />
                  
              <!--      <select name="idCiudad" >
                      <c:forEach var="ciudad" items="${formaNuevaPregunta.ciudades}">
                        <option value='<c:out value="${ciudad.id}" />'><c:out value="${ciudad.nombre}" /></option>
                      </c:forEach>
                    </select>
                -->
                </div>
            </div>
            <div class="tr">
                <div class="td" align="right">
                    <fmt:message key="formaNuevaPregunta.etiqueta.Test" />
                </div>
                <div class="td" align="left" style="position:relative">
                    <div id="TestNombre"></div>
                </div>
            </div>
            <div class="tr">
                <div class="td" style="width:400px;" align="center">
                    <input type="submit" 
                           name="submit"
                           value="Agregar y terminar"/>
                    <input type="submit" 
                           name="submit"
                           value="Agregar y volver"
                           onclick="forma.action='procesarRegistroPregunta.do?volver=si'"/>
                    <input type="button"
                           value="Reset"
                           onclick="location.href='solicitarRegistroPregunta.do'" />
                    <input type="submit" 
                           name="org.apache.struts.taglib.html.CANCEL" 
                           value="cancelar" 
                           onclick="bCancel=true;">    
                </div>
            </div>
        </div>
    </form>