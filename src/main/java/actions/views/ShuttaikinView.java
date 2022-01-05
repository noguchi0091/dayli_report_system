package actions.views;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 出退勤情報について画面の入力値・出力値を扱うViewモデル
 *
 */
@Getter //全てのクラスフィールドについてgetterを自動作成する
@Setter //全てのクラスフィールドについてsetterを自動作成する
@NoArgsConstructor //引数なしコンストラクタを自動作成する
@AllArgsConstructor //全てのクラスフィールドを引数にもつ引数ありコンストラクタを自動作成する


public class ShuttaikinView {

    /**
     * id
     */
    private Integer id;

    /**
     * 出勤時間
     */
    private String shukkinJikan;

    /**
     * 退勤時間
     */
    private String taikinJikan;

    /**
     * 従業員
     */
    private String juugyouin;

    /**
     * 出勤日
     */
    private String shukkinbi;

    /**
     * 修正理由
     */
    private String shuuseiRiyuu;



}
