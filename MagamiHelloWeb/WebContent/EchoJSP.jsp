<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=Windows-31J"
  pageEncoding="Windows-31J"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>�͂��߂Ă�JSP</title>
</head>
<body>
  <h1>
    <font color="blue">�͂��߂Ă�JSP�ł��B</font>
  </h1>

  <form action="./EchoJSP.jsp" method="POST">
    <input type="text" name="param" /> <input type="submit"
      value="���y�[�W�ɑ��M�I" />
  </form>

  <!-- HTML�R�����g -->
  <%-- JSP�R�����g --%>

  <%
    //Servlet�Ɠ����悤�ɃG���R�[�h�A�l�擾�A�W���o�͂�����
    request.setCharacterEncoding( "Windows-31J" );
    String param = request.getParameter( "param" );
    System.out.println( param );
  %>

  <%=param%>

  <hr>
  ���[�v�ɂ���̏o��
  <table border="3" bordercolor="black">
    <tr>
      <%
        for ( int i = 0; i < 10; i++ ) {
      %>

      <td><%=i%></td>

      <%
        }
      %>
    </tr>
  </table>

  <hr>
  ���݂̓�����\��
  <br>
  <%
    SimpleDateFormat fmt = new SimpleDateFormat( "yyyy�NMM��dd�� HH��mm��ss�bS" );
    Date now = new Date();
  %>

  <%=fmt.format( now )%>

</body>
</html>