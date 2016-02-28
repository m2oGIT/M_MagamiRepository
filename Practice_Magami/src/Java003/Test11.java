/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * @author 真上公貴 <br />
 *         Java003 問1 <br />
 *         0.1を10回足した後、10倍にした結果を表示させる。 <br />
 *         ただし10.0表示。 <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test11 {
  /**
   * 0.1を10回足した後、10倍する。 結果は10.0を表示する。
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    BigDecimal var = new BigDecimal( "0.0" );
    for ( int i = 1; i <= 10; i++ ) {
      var = var.add( new BigDecimal( "0.1" ) );
    }
    var = var.multiply( new BigDecimal( "10" ) );

    System.out.println( "値を表示します。 " + var );

  }

}
