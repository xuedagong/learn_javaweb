package thisdemo;


class Student {
    int rollno;
    String name,course;
    float fee;

    Student(int rollno, String name, float fee) {
        rollno = rollno;
        name = name;
        fee = fee;
    }

    Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    Student(int rollno, String name, String course, float fee) {
        this(rollno, name, course);// reusing constructor
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}


/**
 * 参数(形式参数)和实例变量(rollno和name)是相同的。 所以要使用this关键字来区分局部变量和实例变量。
 */
public class TestThis1 {
    public static void main(String args[]) {
        Student s1 = new Student(111, "ankit", 5000f);
        Student s2 = new Student(112, "sumit", 6000f);
        s1.display();
        s2.display();
        /**
         * out
         * 0 null 0.0
           0 null 0.0
         */
    }
}
