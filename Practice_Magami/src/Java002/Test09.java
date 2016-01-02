/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author （作成者） <br />
 *         （クラス論理名） <br />
 *         （説明） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test09 {
  /** 
   * 1~100までの数値をループで回して、加算するコードを作成する。
   * @param args 実行時引数（ここで101を定義している）
   */

  public static void main( String[] args ) {
    int var = 0;
    int str = Integer.parseInt( args[0] );
    int i;
    for ( i = 1; i < str; i++ ) {
      var = var + i;
    }
    System.out.println( var );
  }

}
