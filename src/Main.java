import java.time.LocalDateTime;

public class Main {
    public static int i = 0;
    public static int max = 10;

    public static void main(String[] args) {
        iterate();
    }

    public static void iterate() {
        if (i < max) {
            i = i + 1;
            System.out.println(i);
            iterate();
        }
    }
}