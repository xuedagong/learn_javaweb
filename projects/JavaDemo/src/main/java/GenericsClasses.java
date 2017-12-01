public class GenericsClasses {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.add(new Integer(199));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}

class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}