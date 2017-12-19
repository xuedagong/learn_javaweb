import java.math.BigDecimal;

public class Longdemo {



    public static void main(String[] args) {
//        Long a=1316464646131L;
//        Long b=1316464646131L;
//        System.out.println(a.longValue()==b.longValue());

        BigDecimal decimal_a=new BigDecimal(23.6);
        BigDecimal decimal_b=new BigDecimal(23.6);
        System.out.println(decimal_a.doubleValue()==decimal_b.doubleValue());
        System.out.println(decimal_a.compareTo(decimal_b)==0);
    }
}
