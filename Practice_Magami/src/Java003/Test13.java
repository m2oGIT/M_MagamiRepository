/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

/**
 * @author �^����M <br />
 *         Java003 ��3 <br />
 *         �u*�v��������₵�ĕ\�������郋�[�v���� <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test13 {
  /**
   * ���d���[�v�����̗��K
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    // 10��̃��[�v
    for ( int i = 1; i <= 10; i++ ) {
      // �ϐ�ast�����[�v�̉񐔂Ɠ����l�ɂȂ�܂Łu*�v���o�͂���
      for ( int ast = 1; ast <= i; ast++ ) {
        // ���s�Ȃ��̏o�́B�܂�u*�v���E�ɑ����Ă���
        System.out.print( "*" );
      }
      // ���s����̏o��
      System.out.println();
    }
  }

}
