/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author �^����M <br />
 *         Java003 ��2 <br />
 *         ���s�����������ȉ��̌`���ŕ\��������R�[�h���쐬����B <br />
 *         "���s������yyyy/MM/dd HH:mm:ss�ł��B" �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test12 {
  /**
   * ���t�\��
   * 
   * @param args ���s������
   */

  public static void main( String[] args ) {

    /** ���t�������ꍇ�́ADate�^���g�p����B **/

    // �I�u�W�F�N�g�^��new�ŃC���X�^���X�𐶐�����i�����������j�B
    // date�̏ꍇ�́A�����������Ō��ݓ����i�}�V�����t�j���擾�����B
    Date date = new Date();

    /** SimpleDateFormat�F���t�̃t�H�[�}�b�g���J�X�^�}�C�Y���郉�C�u�����N���X�B **/

    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" ); // �C���X�^���X�������ɑ̍ق��w��B

    String formatedDate = sdf.format( date );
    System.out.println( "���s����������" + formatedDate + "�ł��B" ); // �w��t�H�[�}�b�g�ŕ\������B

  }

}
