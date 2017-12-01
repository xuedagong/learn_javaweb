public class MultipleTypeParameters {
    public static void main(String[] args) {
        Box3<Integer, String> box = new Box3<Integer, String>();
        box.add(Integer.valueOf(103), "Hello World");
        System.out.printf("Integer Value :%d\n", box.getFirst());
        System.out.printf("String Value :%s\n", box.getSecond());

        Box3<String, String> box1 = new Box3<String, String>();
        box1.add("Message", "Hello World");
        System.out.printf("String Value :%s\n", box1.getFirst());
        System.out.printf("String Value :%s\n", box1.getSecond());
    }
}

class Box3<T, S> {
    private T t;
    private S s;

    public void add(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getFirst() {
        return t;
    }

    public S getSecond() {
        return s;
    }
}