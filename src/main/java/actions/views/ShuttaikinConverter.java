package actions.views;

import antlr.collections.List;
import models.Shuttaikin;

/**
 * 出退勤データのDTOモデル⇄Viewモデルの変換を行うクラス
 *
 */

public class ShuttaikinConverter {

    /**
     * ViewモデルのインスタンスからDTOモデルのインスタンスを作成する
     * @param ev ShuttaikinViewのインスタンス
     * @return Employeeのインスタンス
     */
    public static Shuttaikin toModel(ShuttaikinView ev) {
        return new Shuttaikin(
                ev.getId(),
                ev.getShukkinJikan(),
                ev.getTaikinJikan(),
                ev.getJuugyouin(),
                ev.getShukkinbi(),
                ev.getShuuseiRiyuu());
    }
    /**
     * DTOモデルのインスタンスからViewモデルのインスタンスを作成する
     * @param e Shuttaikinのインスタンス
     * @return ShuttaikinViewのインスタンス
     */
    public static ShuttaikinView toView(Shuttaikin e) {
    if(e == null) {
        return null;
    }

    return new ShuttaikinView(
            e.getId(),
            e.getShukkinJikan(),
            e.getTaikinJikan(),
            e.getJuugyouin(),
            e.getShukkinbi(),
            e.getShuuseiRiyuu()
            )
    }


    /**
     * DTOモデルのリストからViewモデルのリストを作成する
     * @param list　DTOモデルのリスト
     * @return　Viewモデルのリスト
     */


    public static List<ShuttaikinView> toViewList(List<Shuttaikin>list){
        List<ShuttaikinView> evs = new ArrayList<>();
        for (Shutttaikin e : List) {
            evs.add(toView(e));
        }

        return evs;
        }

    /**
     * Viewモデルの前フィールド内容をDTOモデルのフィールドにコピーする
     * @param e DTOモデル（コピー先）
     * @param ev Viewモデル（コピー元）
     */
    public static void copyViewToModel(Shuttaikin e, ShuttaikinView ev) {
        e.setId(ev.getId());
        e.setShukkinJikan(ev.getShukkinJikan());
        e.setTaikinJikan(ev.getTaikinJikan());
        e.setJuugyouin(ev.getJuugyouin());
        e.setShukkinbi(ev.getShukkinbi));
        e.setShuuseiRiyuu(ev.getShuuseiRiyuu());
    }

}


