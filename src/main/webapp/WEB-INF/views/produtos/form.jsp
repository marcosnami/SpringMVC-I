<%--
  Created by IntelliJ IDEA.
  User: MarcosNami
  Date: 7/15/2017
  Time: 6:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Livros de java, Android, Iphone, PHP, Ruby e muito mais - Casa do código</title>
</head>
<body>

<form action="/SpringMVC1/produtos" method="post">
    <div>
        <label>Título</label>
        <input type="text" name="titulo" />
    </div>
    <div>
        <label>Descrição</label>
        <textarea rows="10" cols="20" name="descricao"></textarea>
    </div>
    <div>
        <label>Páginas</label>
        <input type="text" name="paginas" />
    </div>
    <div>
        <label>EBOOK</label>
        <input type="text" name="precos[0].valor" />
        <input type="hidden" name="precos[0].tipo" value="EBOOK" />
    </div>

    <div>
        <label>IMPRESSO</label>
        <input type="text" name="precos[1].valor" />
        <input type="hidden" name="precos[1].tipo" value="IMPRESSO" />
    </div>

    <div>
        <label>COMBO</label>
        <input type="text" name="precos[2].valor" />
        <input type="hidden" name="precos[2].tipo" value="COMBO" />
    </div>
    <button type="submit">Cadastrar</button>
</form>

</body>
</html>
