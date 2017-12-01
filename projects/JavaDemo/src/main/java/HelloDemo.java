public class HelloDemo {
    public static void main(String[] args) {
        Long l=222L;
        Long b=129L;
        int a=222;
        Integer i=2122;
        System.out.println(i);
        System.out.println("l=a:"+( l==a));
        System.out.println("l=i:"+l.equals( new Long(i) ));
        System.out.println("l=a:"+( l.equals( new Long(a) )));
        System.out.println("hell");
    }
}
