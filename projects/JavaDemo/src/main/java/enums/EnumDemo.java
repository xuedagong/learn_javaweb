package enums;

public class EnumDemo {
    public static void main(String[] args) {
        LoanBookStatusType a= LoanBookStatusType.valueOf( 1);
        LoanBookStatusType b= LoanBookStatusType.valueOf( 1);
        System.out.println(a==LoanBookStatusType.APPLYING);
        System.out.println(MsgType.USER_LOAN.toString() );
//        MsgType.USER_LOAN.toString();
    }
}
