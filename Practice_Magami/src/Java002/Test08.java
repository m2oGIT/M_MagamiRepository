/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �^����M <br />
 *         Java002 ��2 <br />
 *         1~100�܂ł̐��l�����[�v�ŉ񂵂āA�w��̂݁x���Z����R�[�h���쐬����B <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test08 {
  /** 
   * 1~100�܂ł̐��l�����[�v�ŉ񂵂āA�w��̂݁x���Z����R�[�h���쐬����B
   * @param args ���s������
   */
  public static void main( String[] args ) {
    int var = 0;  //���v�l
    for ( int i = 1; i < 101; i++ ) {   //1~100�܂ł̑��a���Z�o
      if ( i % 2 == 0 ) {               //�����̔���F��](%)��'1'�Ȃ��A'0'�Ȃ����
        //�������Ȃ�
      } else {
        var +=i;                  //���Z����
      }
    }
    System.out.println( var );          //�v�Z���ʂ�\��
  }

}
