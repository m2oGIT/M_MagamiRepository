
package web_001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 演習Web_001の問1の解答<br/>
 * 第一入力値の文字列を第二入力値の回数分繰り返し表示する<br/>
 * 更新履歴<br>
 * 2016/11/26 真上 公貴：新規作成<br/>
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

    // View_001.htmlからの値1を取得して、値2の回数分表示する
    String input1 = request.getParameter( "input1" );
    String input2 = request.getParameter( "input2" );
    String output1 = "";
    int count1 = Integer.parseInt( input2 );
    //count1 += 1;
    for ( int i = 1; i <= count1; i++ ) {
      output1 = output1 + input1 ;
    }
    pw.println( output1 );

    //標準出力もする
    System.out.println( output1 );
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
