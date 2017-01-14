
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
 * 演習Web_001の問2の解答<br/>
 * ブラウザから入力値を1つ取り、複数人の身長を読み込み、標準体重を表示する<br/>
 * 更新履歴<br>
 * 2016/11/26 真上 公貴：新規作成<br/>
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

    // View_002.htmlからカンマ付きの値を取得して、カンマで分割する
    String input1 = request.getParameter( "input1" );
    String[] talls = input1.split( ",", 0 );
    for ( int i = 0; i < talls.length; i++ ) {
      int talli = Integer.parseInt( talls[i] );
      //身長を標準出力する
      System.out.println( "身長" + talli );
      // 標準体重を算出して、出力する
      double weightavr = ( talli - 100 ) * 0.9;
      BigDecimal x = new BigDecimal(weightavr);
      x = x.setScale(5, BigDecimal.ROUND_HALF_UP);
      pw.println( x );
      pw.println("<br>");
      //標準体重を標準出力する
      System.out.println( "標準体重" + x );
    }
    pw.println( "</body>" );
    pw.println( "</html>" );
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
