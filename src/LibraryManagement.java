import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManagement bookManagement = new BookManagement();
        int option;
        do {
            System.out.println("MENU------>");
            System.out.println("1 -> Add a book");
            System.out.println("2 -> view available books");
            System.out.println("3 -> exit");

            System.out.print("Enter your choice : ");
            option = sc.nextInt();
                if(option == 1){
                    Book book = bookManagement.buildBookObject();
                    bookManagement.addBook(book);
                } else if (option == 2) {
                    bookManagement.viewBooks();
                }

        }while(option != 3);
        System.out.println("program exited");
        sc.close();
    }
}
