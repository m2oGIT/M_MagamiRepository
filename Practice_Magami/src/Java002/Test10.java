/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author 真上公貴 <br />
 *         Java002 問5 <br />
 *         「渡された2種類の整数の間の数を全て合計して返す」というメソッドを呼び出す。 <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test10 {
  /**
   * メソッド内の処理 渡された2種類の整数の間の数を全て合計して返す
   */
  public static void main( String args[] ) {
    int[] num = {1, 101};   //配列の定義
    int henkyaku = Test07.test10sub(num);                   //加算処理のメソッド。クラス名＋メソッド名で呼び出す。
    System.out.println( "値を表示します。 " + henkyaku );   //計算結果を表示

  }

}

