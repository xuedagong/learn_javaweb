package SerializableLearn;

import java.io.*;

public class PersonDemo {

    public static void main(String[] args) throws Exception {
        SerializePerson();

        System.out.println(DeserializePerson());
    }

    private static void SerializePerson() throws FileNotFoundException,
            IOException {
                Person person = new Person();
                person.setName("gacl");
                person.setAge(12);
                person.setEmail("xuedagong@qq.com");
                // ObjectOutputStream 对象输出流，将Person对象存储到E盘的Person.txt文件中，完成对Person对象的序列化操作
                ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("C:/apps/Person.txt")));
                oo.writeObject(person);
                System.out.println("Person对象序列化成功！");
                oo.close();
            }


    private static Person DeserializePerson() throws Exception, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                                 new File("C:/apps/Person.txt")));
                Person person = (Person) ois.readObject();
                System.out.println("Person对象反序列化成功！");
                return person;
            }
}
