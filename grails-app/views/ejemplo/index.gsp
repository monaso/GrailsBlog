<html>
  <head>
      <title>Usuarios</title>
  </head>
  <body>
      <table border="1">
        <thead>
           <tr>
              <th>Nombre</th>
              <th>Apellido</th>
              <th>Acciones</th>
           </tr>
        </thead>
        <tbody>
          <g:each in="${usuarios}" var="usuario">
            <tr>
               <td>${usuario.firstName}</td>
               <td>${usuario.lastName}</td>
               <td><a href="${createLink(action:'edit',params:[id:usuario.id])}">Editar</a></td>
            </tr>
          </g:each>
        </tbody>
      </table>
  </body>
</html>
