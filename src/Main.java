import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<? super Object> list = new ArrayList<>();
        addToList(list);
    }


    public static void addToList(List<?super Object> list) { // 1
        list.add(new LittleBoy()); // 2
        list.add(new Child());
        list.add(new Parent());
            list.add(new Object());
            list.add(new Grandparents());
            list.add("Daddy");
        System.out.println("New child");
    }


}
