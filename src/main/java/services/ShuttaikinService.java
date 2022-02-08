package services;

import java.time.LocalDateTime;
import java.util.List;

import actions.views.ShuttaikinView;

/**
 * 出退勤時間の管理に関わる処理を行うクラス
 */

public class ShuttaikinService extends ServiceBase {

    /**
     * 指定された従業員の出退勤時間のデータを取得する
     */
    public List<ShuttaikinView> get PerPage(intpage) {
        List<Shuttaikin> shuttaikin = e.createNamedQuery(JpaConst.Q_SHUT_GET_ALL,Shuttaikin.class)
                .setFirstResult(JpaConst.ROW_PER_PAGE*(page - 1))
                .setMaxResults(FpaConst.ROW_PER_PAGE)
                .getResultList();
        returnShuttaikinConverter.toViewList(shuttaikin);
    }




}
