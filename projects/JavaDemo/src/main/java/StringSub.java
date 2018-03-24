import com.sun.deploy.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class StringSub {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        String s="XFF.VCL.SignController.queryQuota";
//        System.out.println("XFF".equals( s.substring(0,3) ) );
//
//
//        String aaa="50%";
//        System.out.println( aaa.replace("%","") );
//        Integer i=Integer.parseInt(aaa.replace("%",""));
//        BigDecimal payRate=new BigDecimal( i*1.0/100 ).setScale(2, RoundingMode.HALF_UP);
//        String s1="我是中国人aa";
//        System.out.println(s1.length());
//        System.out.println(payRate);'

        String ss1="平板电脑";
        int num =ss1.getBytes("utf-8").length;
        System.out.println(num);
//        String[] arr=ss1.split(" ");
//        String ss="a";
//        System.out.println(ss.length());
//        int num =ss.getBytes("gbk").length;
//        int string_len=0;
//        StringBuilder newStr=new StringBuilder();
//        for(int i=0;i<arr.length;i++){
//            string_len=string_len+arr[i].getBytes("utf-8").length;
//            if(string_len<=90){
//                newStr.append(" ");
//                newStr.append(arr[i]);
//            }else{
//                break;
//            }
//
//        }
//        System.out.println(newStr.toString());
    }
}

