<html>
  <head>
      <title>Usuarios</title>
  </head>
  <body>
    <form action="${createLink(action:'update')}" method="post">
      <input type="hidden" name="id" value="${userInstance.id}">
      <table border="1">
        <tbody>
            <tr>
               <td>Nombre</td>
               <td><input type="text" name="firstName" value="${userInstance.firstName}" /></td>
            </tr>
            <tr>
               <td>Apellido</td>
               <td><input type="text" name="lastName" value="${userInstance.lastName}" /></td>
            </tr>
            <tr>
               <td colspan="2"><button type="submit">Enviar</button></td>
            </tr>
        </tbody>
      </table>
      </form>
  </body>
</html>
