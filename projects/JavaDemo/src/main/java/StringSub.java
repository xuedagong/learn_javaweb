import java.math.BigDecimal;
import java.math.RoundingMode;

public class StringSub {
    public static void main(String[] args) {
        String s="XFF.VCL.SignController.queryQuota";
        System.out.println("XFF".equals( s.substring(0,3) ) );


        String aaa="50%";
        System.out.println( aaa.replace("%","") );
        Integer i=Integer.parseInt(aaa.replace("%",""));
        BigDecimal payRate=new BigDecimal( i*1.0/100 ).setScale(2, RoundingMode.HALF_UP);
        System.out.println(payRate);
    }
}

