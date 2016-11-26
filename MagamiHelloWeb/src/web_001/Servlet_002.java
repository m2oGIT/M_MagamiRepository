
package web_001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ���KWeb_001�̖�2�̉�<br/>
 * �u���E�U������͒l��1���A�����l�̐g����ǂݍ��݁A�W���̏d��\������<br/>
 * �X�V����<br>
 * 2016/11/26 �^�� ���M�F�V�K�쐬<br/>
 */

@WebServlet("/web_001/Servlet_002")
public class Servlet_002 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public Servlet_002() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // �͂��߂Ƀ��N�G�X�g�̃G���R�[�h�����{
    request.setCharacterEncoding( "Windows-31J" );

    // ContentType���w��
    response.setContentType( "text/html;charset=Windows-31J" );

    // HTTP���X�|���X�Ƃ��ĕ�������o�͂��郉�C�^�[
    PrintWriter pw = response.getWriter();

    // ��������o�͂���
    pw.println( "<html>" );
    pw.println( "<head>" );
    pw.println( "<title>����</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );
    pw.println( "<h1><font color=\"blue\">����</font></h1>" );

    // View_002.html����l���擾���āA�J���}�ŕ�������
    String input1 = request.getParameter( "input1" );
    String[] talls = input1.split( ",", 0 );
    // �W���̏d���Z�o���āA�o�͂���
    for ( int i = 0; i < talls.length; i++ ) {
      int talli = Integer.parseInt( talls[i] );
      double weightavr = ( talli - 100 ) * 0.9;
      pw.println( weightavr );
      //���s������
    }
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // doGet���\�b�h�ɏ������Ϗ�����
    this.doGet( request, response );
  }

}
