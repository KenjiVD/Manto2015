    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <br>
    <font size='5'><fmt:message key="formaNuevoSeccion.titulo" /></font>

    <form id="forma" action="procesarRegistroSeccion.do" method="post">
        <div class="table">
            <div class="tr">
                <div class="td" colspan="2">
                   <html:errors />
                </div>
            </div>
            <div class="tr">
                <div class="td" align="right">
                    <fmt:message key="formaNuevoSeccion.etiqueta.nombre" />
                </div>
                <div class="td" align="left">
                    <input type="text" 
                           name="nombre" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevoSeccion.nombre}" />
                </div>
            </div>
            <div class="tr">
                <div class="td" align="right">
                    <fmt:message key="formaNuevoSeccion.etiqueta.Test" />
                </div>
                <div class="td" align="left">
                    <select name="idTest" >
                      <c:forEach var="test" items="${formaNuevoSeccion.Test}">
                        <option value='<c:out value="${test.id}" />'><c:out value="${test.nombre}" /></option>
                      </c:forEach>
                    </select>
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
                           onclick="forma.action='procesarRegistroSeccion.do?volver=si'"/>
                    <input type="button"
                           value="Reset"
                           onclick="location.href='solicitarRegistroSeccion.do'" />
                    <input type="submit" 
                           name="org.apache.struts.taglib.html.CANCEL" 
                           value="cancelar" 
                           onclick="bCancel=true;">    
                </div>
            </div>
        </div>
    </form>