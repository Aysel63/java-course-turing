package az.edu.turing;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addHead(10);
        list.addTail(30);
        System.out.println(list);

        list.delete(1);
        System.out.println(list);

        list.update(1, 40);
        System.out.println(list);

        list.insert(1, 50);
        System.out.println(list);

        System.out.println(Arrays.toString(list.toArray()));

    }
}
