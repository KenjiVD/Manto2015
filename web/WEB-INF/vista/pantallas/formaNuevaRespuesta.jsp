    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>


    <div id="pregunta">
      <form action="ProcesarResgistroRespuesta.do" method="post">
      <h1>Nueva Respuesta</h1>
      <select id="seleccionar" name="idPregunta" value="formaNuevaRespuesta.idPregunta">
        <option>Elegir Pregunta</option>
        <c:forEach var="pregunta" items="${formaNuevaRespuesta.preguntas}">
            <option value='<c:out value="${pregunta.id}"/>'><c:out value="${pregunta.pregunta}"/></option>
        </c:forEach>
      </select>
      <br><br>
      <input type="text" name="respuesta" class="pregunta" placeholder="Respuesta"><br><br>
      <input type"submit" value="Nueva Respuesta" class="envio" /><br><br>
      </form>
    </div>