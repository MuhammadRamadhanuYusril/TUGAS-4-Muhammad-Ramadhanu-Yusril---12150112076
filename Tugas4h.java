import java.util.stream.*;
public class Tugas4h {
    public static void main(String[] args) {
        int[] variable = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32};

        int hehe = IntStream.of(variable).sum();
        System.out.println("Jumlah Array = " + hehe);
    }
}
