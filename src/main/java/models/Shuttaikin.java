package models;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import constants.JpaConst;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *出退勤時間データのDTOモデル
 *
 */
@Table(name = JpaConst.TABLE_SHUT)


@Getter //全てのクラスフィールドについてgetterを自動生成する(Lombok)
@Setter //全てのクラスフィールドについてsetterを自動生成する(Lombok)
@NoArgsConstructor //引数なしコンストラクタを自動生成する(Lombok)
@AllArgsConstructor //全てのクラスフィールドを引数にもつ引数ありコンストラクタを自動生成する(Lombok)
@Entity

public class Shuttaikin {
    /**
     * id
     */
    @Id
    @Column(name = JpaConst.SHUT_COL_ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 出勤時間
     */
    @Column(name = JpaConst.SHUT_COL_SHUKKIN_AT, nullable = false)
    private LocalDateTime shukkinJikan;

    /**
     * 退勤時間
     */
   @Column(name = JpaConst.SHUT_COL_TAIKIN_AT, nullable = true)
   private LocalDateTime taikinJikan;

   /**
    * 従業員
    */
  @Column(name = JpaConst.SHUT_COL_EMP, nullable = false)
  private Employee juugyouin;

  /**
   * 出勤日
   */
  @Column(name = JpaConst.SHUT_COL_DAY, nullable = false )
  private LocalDateTime shukkinbi;

  /**
   * 修正理由
   */
  @Column(name = JpaConst.SHUT_COL_RIYUU, nullable = true)
  private String shuuseiRiyuu;



}
