
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
 * 演習Web_001の問3の解答<br/>
 * ブラウザから入力値を３つ取り、四則演算を行うプログラム<br/>
 * 更新履歴<br>
 * 2017/1/14 真上 公貴：新規作成<br/>
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
    // はじめにリクエストのエンコードを実施
    request.setCharacterEncoding( "Windows-31J" );

    // ContentTypeを指定
    response.setContentType( "text/html;charset=Windows-31J" );

    // HTTPレスポンスとして文字列を出力するライター
    PrintWriter pw = response.getWriter();

    // 文字列を出力する
    pw.println( "<html>" );
    pw.println( "<head>" );
    pw.println( "<title>結果</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );
    pw.println( "<h1><font color=\"blue\">結果</font></h1>" );

    // View_003.htmlからの値1,値2,値3を取得する
    // 値1,値2は数値型に変換する
    try {
      String inputNum1 = request.getParameter( "input1" );
      String inputOperator = request.getParameter( "input2" );
      String inputNum2 = request.getParameter( "input3" );
      double inputNum1i = Double.parseDouble( inputNum1 );
      double inputNum2i = Double.parseDouble( inputNum2 );
      // 値2(演算子)で処理を分岐する
      double answer = 0;
      switch ( inputOperator ) {
      // 加算
        case "+":
          answer = ( inputNum1i + inputNum2i );
          break;
        // 減算
        case "-":
          answer = ( inputNum1i - inputNum2i );
          break;
        // 乗算
        case "*":
          answer = ( inputNum1i * inputNum2i );
          break;
        // 除算
        case "/":
          if ( inputNum2i == 0 ) { // ゼロ除算はエラーにする
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
    // 何れかの項目が空欄の場合にメッセージを表示する
    catch ( IllegalArgumentException e ) {
      pw.println( "<html>" );
      pw.println( "<head>" );
      pw.println( "<title>「不正な値が入力されました。」</title>" );
      pw.println( "</head>" );
      pw.println( "<body>" );
      pw.println( "<h1><font color=\"blue\">"
          + "「不正な値が入力されました。」"
          + "</font></h1>" );
    }
    // 標準出力もする
    // System.out.println( output1 );
    // pw.println( "</body>" );
    // pw.println( "</html>" );
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // doGetメソッドに処理を委譲する
    this.doGet( request, response );
  }

}
