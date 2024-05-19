public class ASCIITablePrinter {

    public static void main(String[] args) {
        System.out.println("ASCII Values and Their Equivalent Characters:");
        for (int i = 0; i <= 255; i++) {
            System.out.println("ASCII value: " + i + ", Character: " + (char) i);
        }
    }
}
