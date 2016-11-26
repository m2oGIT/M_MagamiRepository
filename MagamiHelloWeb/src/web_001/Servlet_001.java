
package web_001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ���KWeb_001�̖�1�̉�<br/>
 * �����͒l�̕����������͒l�̉񐔕��J��Ԃ��\������<br/>
 * �X�V����<br>
 * 2016/11/26 �^�� ���M�F�V�K�쐬<br/>
 */

@WebServlet("/web_001/Servlet_001")
public class Servlet_001 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public Servlet_001() {
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

    // View_001.html����̒l1���擾���āA�l2�̉񐔕��\������
    String input1 = request.getParameter( "input1" );
    String input2 = request.getParameter( "input2" );
    String output1 = "";
    int count1 = Integer.parseInt( input2 );
    //count1 += 1;
    for ( int i = 1; i <= count1; i++ ) {
      output1 = output1 + input1 ;
    }
    pw.println( output1 );

    //�W���o�͂�����
    System.out.println( output1 );
    pw.println( "</body>" );
    pw.println( "</html>" );
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
