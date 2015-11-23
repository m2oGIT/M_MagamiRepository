/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author （作成者） <br />
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
package Java001;

public class Test02 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    String[] astr;
    astr = new String[2];
    astr[0] = "できた！";
    astr[1] = "むずかしい";
    
    System.out.println( "ようこそJava勉強会へ。\nこれは2つ目のJavaプログラムです。");
    System.out.println( args[0] );
    System.out.println( astr[0] );
    System.out.println( astr[1] );

  }

}
