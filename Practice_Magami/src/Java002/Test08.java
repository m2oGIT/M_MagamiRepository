/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author 真上公貴 <br />
 *         Java002 問2 <br />
 *         1~100までの数値をループで回して、『奇数のみ』加算するコードを作成する。 <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test08 {
  /** 
   * 1~100までの数値をループで回して、『奇数のみ』加算するコードを作成する。
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    int var = 0;  //合計値
    for ( int i = 1; i < 101; i++ ) {   //1~100までの総和を算出
      if ( i % 2 == 0 ) {               //偶数の判定：剰余(%)が'1'なら奇数、'0'なら偶数
        //何もしない
      } else {
        var +=i;                  //加算処理
      }
    }
    System.out.println( var );          //計算結果を表示
  }

}
