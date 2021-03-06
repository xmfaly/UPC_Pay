package ml.yidreamc.upcpay.common.check;

import ml.yidreamc.upcpay.common.entity.entityenum.CheckType;

public class CheckUtil {

    public void check(String str, CheckType checkType) throws Exception {

        Check c;
        switch (checkType) {
            case NOTEMPTY:
                c = new NotEmptyCheck();
                break;
            case ID:
                c = new IDCheck();
                break;
            case PHONE:
                c = new PhoneCheck();
                break;
            default:
                c = new NotEmptyCheck();
        }
        c.doCheck(str);
    }
}
