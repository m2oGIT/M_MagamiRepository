/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author 真上公貴 <br />
 *         Java002 問1 <br />
 *         1~100までの数値をループで回して、加算するコードを作成する。 <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test07 {
  /**
   * 1~100までの数値をループで回して、加算するコードを作成する。
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    int var = 0;  //合計値
    for ( int i = 1; i < 101; i++ ) {                //1~100までの総和を算出
      var += i;
    }
    System.out.println( args[0] + " " + var );  //計算結果を表示
  }

  /**
   * （メソッド論理名） <br />
   * 1~100までの数値をループで回して、加算するコードを作成する。
   * @param num
   */
  public static int test10sub( int num[] ) {
    int var = 0;  //合計値
    for ( int i = num[0]; i <= num[1]; i++ ) {             //渡された値の総和を算出
      var += i;
    }
/**    System.out.println( "値を表示します。 " + var );  //計算結果を表示
*/
    return var;
  }
}
