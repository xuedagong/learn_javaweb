package SerializableLearn;

import java.lang.reflect.Method;

public class RefactDemo {

    public static void main(String[] args) throws NoSuchMethodException {
        Person a = new Person();

        Class b = Person.class;
        Class c= a.getClass();
        System.out.println(b.getName());
        System.out.println(b.getSimpleName());
        System.out.println(c==b);
        System.out.println(c.getMethods());
        Method aaab=c.getMethod("testMethod", String.class, Integer.class);

        Method[] ms = c.getMethods();//c.getDeclaredMethods()
        for(Method oneMethod:ms){
            System.out.println( oneMethod.getName() );
        }

    }
}
