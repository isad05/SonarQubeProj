import java.util.ArrayList;
import java.util.List;

public class BugExample {

    public void unreachableCode() {
        System.out.println("This is reachable code.");
        System.out.println("This code is flagged as unreachable, but it's still here.");
    }

    public double divideByZero() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;
    }

    public void nullPointerDereference() {
        String str = null;
        System.out.println(str.length());
    }

    public void indexOutOfBounds() {
        List<String> myList = new ArrayList<>();
        String value = myList.get(1);
    }

    public static void main(String[] args) {
        BugExample example = new BugExample();
        example.unreachableCode();
        example.divideByZero();
        example.nullPointerDereference();
        example.indexOutOfBounds();
    }
}
