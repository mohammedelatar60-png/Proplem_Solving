import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] books = new String[100];
        boolean[] isBorrowed = new boolean[100];
        int bookCount = 0;

        boolean running = true;
        while (running) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (bookCount < books.length) {
                        String title = scanner.nextLine();
                        books[bookCount] = title;
                        isBorrowed[bookCount] = false;
                        bookCount++;
                        System.out.println("Book added successfully.");
                    } else {
                        System.out.println("Library capacity reached.");
                    }
                    break;

                case 2:
                    String borrowTitle = scanner.nextLine();
                    boolean foundBorrow = false;
                    for (int i = 0; i < bookCount; i++) {
                        if (books[i].equalsIgnoreCase(borrowTitle)) {
                            foundBorrow = true;
                            if (!isBorrowed[i]) {
                                isBorrowed[i] = true;
                                System.out.println("You borrowed: " + books[i]);
                            } else {
                                System.out.println("Book is already borrowed.");
                            }
                            break;
                        }
                    }
                    if (!foundBorrow) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    String returnTitle = scanner.nextLine();
                    boolean foundReturn = false;
                    for (int i = 0; i < bookCount; i++) {
                        if (books[i].equalsIgnoreCase(returnTitle)) {
                            foundReturn = true;
                            if (isBorrowed[i]) {
                                isBorrowed[i] = false;
                                System.out.println("You returned: " + books[i]);
                            } else {
                                System.out.println("Book was not borrowed.");
                            }
                            break;
                        }
                    }
                    if (!foundReturn) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Available Books:");
                    boolean hasAvailable = false;
                    for (int i = 0; i < bookCount; i++) {
                        if (!isBorrowed[i]) {
                            System.out.println("- " + books[i]);
                            hasAvailable = true;
                        }
                    }
                    if (!hasAvailable) {
                        System.out.println("No available books.");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}