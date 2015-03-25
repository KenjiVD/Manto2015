    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
  .HipervinculoAdmon{
    color:#000000;
	text-decoration:none;
  }
  
  .HipervinculoAdmon:hover{
    color:#006666;
	text-decoration:underline;
  }
</style>
<script language="javascript" type="text/javascript">
<!--
  function EliminarPersona(PersonaName){
    return confirm("¿Desea eliminar la persona '" + PersonaName + "'?")
  }
-->
</script>
    <br>
    <font size='5'><fmt:message key="formaListadoTest.titulo" /></font>
   
      <div class="table" style="width:100%"  id="tablecontent">
          <div class="tr">
              <div class="td" colspan="4" style="padding-top:25px; padding-bottom:25px;">
                  <a href="solicitarRegistroTest.do" class="HipervinculoAdmon boton">Agregar nuevo Test</a>
              </div>
          </div>
          <div class="tr">
              <div class="td" colspan="4">
                 <html:errors />
              </div>
          </div>
          <div class="tr enlaces" style="background:#CCCCCC">
           <div class="td" style="width:16%"><b id="nombre">
            <fmt:message key="formaListadoTest.etiqueta.nombre" /></b></div>
          </div>
          <%
          int contar = 0; 
          %>
          <c:forEach var="test" items="${formaCrearTest.test}">
            <%
            if (contar == 0) { %>
              <div class="tr">
                  <div class="td" align="left" style="width:20%"><c:out value="${test.pregunta}"/></div>
              </div>
              <div class="tr">
            <% } %>
                  <div class="td" align="left" style="width:20%"><c:out value="${test.respuesta}"/></div>
            <%
            contar++;
            if (contar == 3) { %>
              </div>
            <% contar = 0;
            } %>
          </c:forEach>
          <div class="tr">
              <div class="td" colspan="4" align="right" style="padding-top:25px;"><b>Total:</b> ${formaListadoTest.contador}</div>
          </div>
      </div>