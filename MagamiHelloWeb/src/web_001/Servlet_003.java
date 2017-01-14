
package web_001;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ���KWeb_001�̖�3�̉�<br/>
 * �u���E�U������͒l���R���A�l�����Z���s���v���O����<br/>
 * �X�V����<br>
 * 2017/1/14 �^�� ���M�F�V�K�쐬<br/>
 */

@WebServlet("/web_001/Servlet_003")
public class Servlet_003 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public Servlet_003() {
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

    // View_003.html����̒l1,�l2,�l3���擾����
    // �l1,�l2�͐��l�^�ɕϊ�����
    try {
      String inputNum1 = request.getParameter( "input1" );
      String inputOperator = request.getParameter( "input2" );
      String inputNum2 = request.getParameter( "input3" );
      double inputNum1i = Double.parseDouble( inputNum1 );
      double inputNum2i = Double.parseDouble( inputNum2 );
      // �l2(���Z�q)�ŏ����𕪊򂷂�
      double answer = 0;
      switch ( inputOperator ) {
      // ���Z
        case "+":
          answer = ( inputNum1i + inputNum2i );
          break;
        // ���Z
        case "-":
          answer = ( inputNum1i - inputNum2i );
          break;
        // ��Z
        case "*":
          answer = ( inputNum1i * inputNum2i );
          break;
        // ���Z
        case "/":
          if ( inputNum2i == 0 ) { // �[�����Z�̓G���[�ɂ���
            throw new IllegalArgumentException();
          }
          answer = ( inputNum1i / inputNum2i );
          break;
        default:
          throw new IllegalArgumentException();
      }
      BigDecimal answerB = new BigDecimal( answer );
      answerB = answerB.setScale( 5, BigDecimal.ROUND_HALF_UP );
      pw.println( inputNum1 );
      pw.println( inputOperator );
      pw.println( inputNum2 );
      pw.println( "=" );
      pw.println( answerB );
    }
    // ���ꂩ�̍��ڂ��󗓂̏ꍇ�Ƀ��b�Z�[�W��\������
    catch ( IllegalArgumentException e ) {
      pw.println( "<html>" );
      pw.println( "<head>" );
      pw.println( "<title>�u�s���Ȓl�����͂���܂����B�v</title>" );
      pw.println( "</head>" );
      pw.println( "<body>" );
      pw.println( "<h1><font color=\"blue\">"
          + "�u�s���Ȓl�����͂���܂����B�v"
          + "</font></h1>" );
    }
    // �W���o�͂�����
    // System.out.println( output1 );
    // pw.println( "</body>" );
    // pw.println( "</html>" );
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
