    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>


    <div id="pregunta">
      <form action="NuevaPregunta.do" method="post">
      <h1>Nueva Pregunta</h1>
      <select id="seleccionar" name="selecttest" onchange="listaSecciones()">
        <option>Elegir Test</option>
        <c:forEach var="test" items="${formaNuevaPregunta.test}">
            <option value='<c:out value="${test.id}"/>'><c:out value="${test.nombre}"/></option>
        </c:forEach>
      </select>
      <br><br>
      <select id="seleccionaropcion" name="selectsec">
        <option></option>
      </select>
      <br><br>
      <input type="text" name="nombrepregunta" class="pregunta" placeholder="Pregunta"><br><br>
      <div id="cratepregunta">
        <input type="text" name="respuestauno" placeholder="Respuesta 1">
        <input name="rescor" type="radio">
        <br><br>
        <input type="text" name="respuestados" placeholder="Respuesta 2">
        <input name="rescor" type="radio">
        <br><br>
        <input type="text" name="respuestatres" placeholder="Respuesta 3">
        <input name="rescor" type="radio">
        <br><br>
      </div>
      <input type"submit" value="Nueva Pregunta" class="envio" /><br><br>
      </form>
    </div>