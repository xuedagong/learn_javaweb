import java.math.BigDecimal;

public class StringFormat {
    public static void main(String[] args) {
        Long orderId=3122111231241424L;
        BigDecimal bigDecimal_a=new BigDecimal(21211223.315);
        System.out.println( String.format("订单号：%d，应支付金额:%.2f", orderId,bigDecimal_a));
        System.out.println(orderId);
        System.out.println(bigDecimal_a);
    }
}
