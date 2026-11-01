import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user1, user2;
        System.out.print("Enter User 1 name: ");
        user1 = sc.nextLine();

        System.out.print("Enter User 2 name: ");
        user2 = sc.nextLine();

        System.out.println("\n--- Chat Started (type 'exit' to stop) ---");

        String message;

        while (true) {
            System.out.print(user1 + ": ");
            message = sc.nextLine();
            if (message.equalsIgnoreCase("exit")) break;

            System.out.print(user2 + ": ");
            message = sc.nextLine();
            if (message.equalsIgnoreCase("exit")) break;
        }

        System.out.println("Chat ended.");
        sc.close();
    }
}