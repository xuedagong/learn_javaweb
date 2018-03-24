package kata;

import java.math.BigDecimal;

public class DRoot {
    public static int digital_root(int n) {
        if(n<10) {
            return n;
        }

        int sum=0;
        while(n>10){
            sum=sum+n%10;
            n=n/10;
        }
        sum=sum+n;
        return digital_root(sum);

    }

    public static void main(String[] args) {
        System.out.println(digital_root(38) );
        System.out.println(112/10);
        System.out.println(new BigDecimal(0.17).setScale(2,BigDecimal.ROUND_HALF_UP).toString());
    }
}