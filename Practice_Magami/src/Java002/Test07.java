/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �i�쐬�ҁj <br />
 *         �i�N���X�_�����j <br />
 *         �i�����j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test07 {
  /**
   * 1~100�܂ł̐��l�����[�v�ŉ񂵂āA���Z����R�[�h���쐬����B
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    int var = 0;
    int i;
    for ( i = 1; i < 101; i++ ) {
      var = var + i;
    }
    System.out.println( args[0] + " " + var );
  }

  private static void test10sub( int num[] ) {
    int var = 0;
    int i;
    for ( i = num[0]; i < num[1]; i++ ) {
      var = num[0] + i;
    }
    System.out.println( "�l��\�����܂��B " + var );
  }
}
