package actions;

import java.io.IOException;

import javax.servlet.ServletException;

import actions.views.ShuttaikinView;
import constants.AttributeConst;

public class ShuttaikinAction extends ActionBase{
    /**
     * 新規登録を行う
     * @throws ServletException
     * @throws IOException
     */
    public void create() throws ServletException, IOException {



            //パラメータの値を元に出退勤時間のインスタンスを作成する
            ShuttaikinView ev = new ShuttaikinView(
                    toNumber(getRequestParam(AttributeConst.SHUT_ID)),
                    toLocalDate(getRequestParam(AttributeConst.SHUT_SHUKKIN)),
                    toLocalDate(getRequestParam(AttributeConst.SHUT_TAIKIN)),
                    getRequestParam(AttributeConst.SHUT_NAME),
                    toLocalDate(getRequestParam(AttributeConst.SHUT_DATE)),
                    getRequestParam(AttributeConst.SHUT_RIYUU))
                    ;
    }
}
