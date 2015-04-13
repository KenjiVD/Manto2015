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
            <c:forEach var="test" items="${formaListadoTest.test}">
              <div class="tr">
                <form method="post">
                  <div class="td" align="left" style="width:20%"><c:out value="${test.nombre}"/></div>
                  <div class="td" align="left" style="width:20%"><input type="hidden" name="id" value="<c:out value='${test.id}'/>" /></div>
                  <div class="td" align="left" style="width:20%"><input type="submit" onclick = "this.form.action = 'procesarEliminarTest.do'" value="Elminar Test"/></div>
                </form>
              </div>
          </c:forEach>