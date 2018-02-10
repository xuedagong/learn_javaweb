package enums;

import java.util.stream.Stream;

public enum LoanBookStatusType {

    NULL(0, "未知类型"),
    APPLYING(1, "处理中"),
    OCCUPY_FAIL(2, "占位失败"),  ////
    RISK_REFUSE(3, "风控拦截"),  ////
    ACCOUNT_FAIL(4, "冻结额度失败"),////
    TO_BE_CONFIRMED(5, "待确认"),
    LOAN_SUCCESS(6, "放款成功"),
    LOAN_CANCEL(7, "订单取消"),
    RISK_FUSING_OR_FAIL(8, "风控熔断或者接口异常"), ////
    RISK_AUDITING(9, "风控审核中");

    private LoanBookStatusType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    private int type;
    private String desc;

    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public static LoanBookStatusType valueOf(int type) {
        return Stream.of(values()).filter(l -> l.getType() == type).findFirst().orElse(NULL);
    }
}