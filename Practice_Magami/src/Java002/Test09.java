/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author 真上公貴 <br />
 *         Java002 問3 <br />
 *         1~「実行時引数」までの数値をループで回して、加算するコードを作成する。 <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test09 {
  /** 
   * 1~「実行時引数」までの数値をループで回して、加算するコードを作成する。
   * @param args 実行時引数
   */

  public static void main( String[] args ) {
    int var = 0;  //合計値
    int str = Integer.parseInt( args[0] );  //実行時引数をint型に変換する
    for ( int i = 1; i <= str; i++ ) {      //1~実行時引数までをループ
      var += i;                        //加算処理
    }
    System.out.println( var );
  }

}
