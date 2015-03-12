    <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
    <%@ taglib uri='http://java.sun.com/jstl/fmt' prefix='fmt' %>
    <%@ taglib uri='/WEB-INF/vista/etiquetas/struts-html.tld' prefix='html' %>

     <div id="seleccion1">
		<div id="test">
			<h1>Nuevo Test</h1>
			<input placeholder="Nombre Test"><br><br>
			<button>Agregar Test</button><br><br>
		</div>
		<div id="seccion">
			<h1>Nueva Sección</h1>
			<select>
				<option>Test1</option>
				<option>Test1</option>
				<option>Test1</option>
				<option>Test1</option>
				<option>Test1</option>
			</select>
			<br><br>
			<input placeholder="Nombre Sección"><br><br>
			<button>Agregar Sección</button><br><br>
		</div>
		<div id="pregunta">
			<h1>Nueva Pregunta</h1>
			<select>
				<option>Test 1</option>
				<option>Test 1</option>
				<option>Test 1</option>
				<option>Test 1</option>
				<option>Test 1</option>
			</select>
			<br><br>
			<select>
				<option>Sección 1</option>
				<option>Sección 1</option>
				<option>Sección 1</option>
				<option>Sección 1</option>
				<option>Sección 1</option>
			</select>
			<br><br>
			<input class="pregunta" placeholder="Pregunta"><br><br>
			<div id="cratepregunta">
				<input placeholder="Respuesta 1">
				<input type="radio">
				<br><br>
				<input placeholder="Respuesta 2">
				<input type="radio">
				<br><br>
				<input placeholder="Respuesta 3">
				<input type="radio">
				<br><br>
			</div>
			<button>Agregar Pregunta</button><br><br>
		</div>
	</div>