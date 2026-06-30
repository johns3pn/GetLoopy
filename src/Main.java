public class Main {
    public static void main(String[] args) {

        // ---------------- TASK 1 ----------------
        System.out.println("Task 1: Count up 0 to 30");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // ---------------- TASK 2 ----------------
        System.out.println("Task 2: Count down 30 to 0");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // ---------------- TASK 3 ----------------
        System.out.println("Task 3: Count up by 3 (0 to 18)");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // ---------------- TASK 4 ----------------
        System.out.println("Task 4: Count down by 2 (10 to 0)");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
