/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �^����M <br />
 *         Java002 ��3 <br />
 *         1~�u���s�������v�܂ł̐��l�����[�v�ŉ񂵂āA���Z����R�[�h���쐬����B <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test09 {
  /** 
   * 1~�u���s�������v�܂ł̐��l�����[�v�ŉ񂵂āA���Z����R�[�h���쐬����B
   * @param args ���s������
   */

  public static void main( String[] args ) {
    int var = 0;  //���v�l
    int str = Integer.parseInt( args[0] );  //���s��������int�^�ɕϊ�����
    for ( int i = 1; i <= str; i++ ) {      //1~���s�������܂ł����[�v
      var += i;                        //���Z����
    }
    System.out.println( var );
  }

}
