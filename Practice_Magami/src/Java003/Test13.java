/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

/**
 * @author 真上公貴 <br />
 *         Java003 問3 <br />
 *         「*」を一つずつ増やして表示させるループ処理 <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test13 {
  /**
   * 多重ループ処理の練習
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    // 10回のループ
    for ( int i = 1; i <= 10; i++ ) {
      // 変数astがループの回数と同じ値になるまで「*」を出力する
      for ( int ast = 1; ast <= i; ast++ ) {
        // 改行なしの出力。つまり「*」が右に増えていく
        System.out.print( "*" );
      }
      // 改行ありの出力
      System.out.println();
    }
  }

}
