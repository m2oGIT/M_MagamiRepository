/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * @author �^����M <br />
 *         Java003 ��1 <br />
 *         0.1��10�񑫂�����A10�{�ɂ������ʂ�\��������B <br />
 *         ������10.0�\���B <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test11 {
  /**
   * 0.1��10�񑫂�����A10�{����B ���ʂ�10.0��\������B
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    BigDecimal var = new BigDecimal( "0.0" );
    for ( int i = 1; i <= 10; i++ ) {
      var = var.add( new BigDecimal( "0.1" ) );
    }
    var = var.multiply( new BigDecimal( "10" ) );

    System.out.println( "�l��\�����܂��B " + var );

  }

}
