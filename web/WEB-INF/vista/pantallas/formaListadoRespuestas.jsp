    <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
    <%@ taglib uri='http://java.sun.com/jstl/fmt' prefix='fmt' %>
    <%@ taglib uri='/WEB-INF/vista/etiquetas/struts-html.tld' prefix='html' %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>

     <div id="seleccion2">
		<c:forEach var="respuesta" items="${formaListadoRespuestas.respuestas}">
              <div class="tr">
                <form method="post">
              <div class="td" align="left" style="width:20%"><c:out value="${respuesta.respuesta}"/></div>
              <div class="td" align="left" style="width:20%"><input type="hidden" name="id" value="<c:out value='${respuesta.id}'/>" /></div>
              <div class="td" align="left" style="width:20%"><input type="submit" onclick = "this.form.action = 'procesarEliminarRespuesta.do'" value="Elminar Respuesta"/></div>
                </form>
              </div>
          </c:forEach>
	</div>