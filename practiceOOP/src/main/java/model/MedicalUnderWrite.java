/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package model;

import util.EntityManager;
import constant.UnderWriteConst;
import entity.ProposalEntity;

/**
 * @author Yamamoto Takashi <br>
 * <br>
 * 医療保険査定処理クラス <br>
 * 医療保険に対する諾否査定を行う <br>
 * <br>
 * 更新履歴 2016/12/31 Yamamoto Takashi：新規作成 <br>
 * 更新履歴 2017/03/18 Magami Masataka：医療保険の査定ロジックを実装 <br>
 */
public class MedicalUnderWrite implements AbstractUnderWrite {

  /**
   * デフォルトコンストラクタ <br>
   * 引数なしのコンストラクタ <br>
   */
  public MedicalUnderWrite() {
    // 行うべき処理なし
  }

  /**
   * 査定処理ロジック <br>
   * 医療保険の査定ロジックを実行する <br>
   *  @param entity 査定前エンティティ
   *  @return ProposalEntity 査定済みエンティティ
   */
  @Override
  public ProposalEntity underWriteLogic( ProposalEntity entity ) {

    // 医療保険の査定ロジックを実行
    System.out.println( "医療保険の査定ロジックを実行" );

    // 医療保険の査定ロジック
    boolean result = EntityManager.checkGender( entity, UnderWriteConst.GENDER_MALE ) && EntityManager.checkAge( entity, UnderWriteConst.MEDICAL_MALE_UPPER_AGE ) ? true
      : EntityManager.checkGender( entity, UnderWriteConst.GENDER_FEMALE ) && EntityManager.checkAge( entity, UnderWriteConst.MEDICAL_FEMALE_UPPER_AGE ) ? true
        : EntityManager.checkGender( entity, UnderWriteConst.GENDER_CORP ) && EntityManager.checkAge( entity, UnderWriteConst.MEDICAL_CORP_UPPER_AGE ) ? true
          : false;
    // 査定結果をセット
    entity.setResult( result );

    // 査定済みエンティティを返却する
    return entity;
  }

}
