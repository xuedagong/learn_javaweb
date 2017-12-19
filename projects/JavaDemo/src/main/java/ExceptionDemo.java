public class ExceptionDemo {
    public static void main(String[] args) throws Exception {

        throw  exceptionDemo();
    }

    public static void demo(){
        exceptionDemo();
    }
    public static Exception exceptionDemo()
    {
        Exception e=new Exception("tesifajldf");
        return e;

    }
}
