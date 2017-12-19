import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> errCodeMap=new HashMap<>();
        errCodeMap.put("10950102","抱歉，系统有点忙，稍后再试试吧");
        errCodeMap.put("10950103","你已经授信过了哦");
        errCodeMap.put("10950104","不存在签约授信记录");
        errCodeMap.put("10950105","抱歉，系统有点忙，稍后再试试吧");
        errCodeMap.put("10950106","抱歉，系统有点忙，稍后再试试吧");
        errCodeMap.put("10950107","抱歉，系统有点忙，稍后再试试吧");
        errCodeMap.put("10950109","抱歉，系统有点忙，稍后再试试吧");
        errCodeMap.put("10950111","抱歉，系统有点忙，稍后再试试吧");
        errCodeMap.put("10950113","还款金额有点小错误哦");
        errCodeMap.put("10950114","正在受理中");
        errCodeMap.put("10950115","你有逾期的贷款单哦，还款成功后才能继续买买买哦");

        String a="109150115";
        if(errCodeMap.containsKey(a)){

            System.out.println("getit");
            System.out.println(errCodeMap.get(a));
        }else{
            System.out.println("nnono");
        }
    }


    public static HashMap getErrorCodeMap(){
        HashMap<String,String> errCodeMap=new HashMap<>();
        errCodeMap.put("10950102","抱歉，系统有点忙，稍后再试试吧");
        errCodeMap.put("10950103","你已经授信过了哦");
        errCodeMap.put("10950104","不存在签约授信记录");
        errCodeMap.put("10950105","抱歉，系统有点忙，稍后再试试吧");
        errCodeMap.put("10950106","抱歉，系统有点忙，稍后再试试吧");
        errCodeMap.put("10950107","抱歉，系统有点忙，稍后再试试吧");
        errCodeMap.put("10950109","抱歉，系统有点忙，稍后再试试吧");
        errCodeMap.put("10950111","抱歉，系统有点忙，稍后再试试吧");
        errCodeMap.put("10950113","还款金额有点小错误哦");
        errCodeMap.put("10950114","正在受理中");
        errCodeMap.put("10950115","你有逾期的贷款单哦，还款成功后才能继续买买买哦");
        return errCodeMap;
    }
}

