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
public class Test08 {
  /** 
   * 1~100�܂ł̐��l�����[�v�ŉ񂵂āA�w��̂݁x���Z����R�[�h���쐬����B
   * @param args ���s������
   */
  public static void main( String[] args ) {
    int var = 0;
    int i;
    for ( i = 1; i < 101; i++ ) {
      if ( i % 2 == 0 ) {
      } else {
        var = var + i;
      }
    }
    System.out.println( var );
  }

}
