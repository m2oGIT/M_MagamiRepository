/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 真上公貴 <br />
 *         Java003 問2 <br />
 *         実行した日時を以下の形式で表示させるコードを作成する。 <br />
 *         "実行日時はyyyy/MM/dd HH:mm:ssです。" 更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test12 {
  /**
   * 日付表示
   * 
   * @param args 実行時引数
   */

  public static void main( String[] args ) {

    /** 日付を扱う場合は、Date型を使用する。 **/

    // オブジェクト型はnewでインスタンスを生成する（初期化される）。
    // dateの場合は、初期化処理で現在日時（マシン日付）が取得される。
    Date date = new Date();

    /** SimpleDateFormat：日付のフォーマットをカスタマイズするライブラリクラス。 **/

    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" ); // インスタンス生成時に体裁を指定。

    String formatedDate = sdf.format( date );
    System.out.println( "実行した日時は" + formatedDate + "です。" ); // 指定フォーマットで表示する。

  }

}
