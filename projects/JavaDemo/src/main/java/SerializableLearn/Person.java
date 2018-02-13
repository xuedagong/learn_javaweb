package SerializableLearn;

import java.io.Serializable;

public class Person implements Serializable {


    private static final long serialVersionUID = -4673484569172396455L;

    private String name;
    private Integer age;
    private  String email;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public void testMethod(String name,Integer age){

    }

    public void sayHello(){
        System.out.println("hello world");
    }
}
