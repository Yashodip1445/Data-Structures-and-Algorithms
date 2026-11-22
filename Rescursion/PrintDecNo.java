
public class PrintDecNo {
    public static void PrintDec(int n) {

        // base case
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + ""); // kaam
        PrintDec(n - 1); // Inner case
    }

    public static void main(String[] args) {

        // // Basic Logic
        // int n = 10;
        // for (int i = 10; i >= 1; i--) {
        // System.out.println(i);
        // }

        int n = 10;
        PrintDec(n);
    }
}