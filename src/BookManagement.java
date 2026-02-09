import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {

    Scanner sc = new Scanner((System.in));
    ArrayList<Book> books = new ArrayList<>();

    public Book buildBookObject(){
        Book book = new Book();

        System.out.print("Enter Book ID : ");
        int b_id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name : ");
        String b_name = sc.nextLine();

        System.out.print("Enter Author Name : ");
        String b_a_name = sc.nextLine();

        book.setBookName(b_name);
        book.setBookID(b_id);
        book.setAuthorName(b_a_name);
        book.setIsAvailable(true);

        return book;
    }

    public void addBook(Book book){
        try{
            books.add(book);
            System.out.println("Book added successfully : " + book.getBookName() );
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void viewBooks(){
        for(Book book : books){
            System.out.println("Book ID : "+book.getBookID());
            System.out.println("Book Name : "+book.getBookName());
            System.out.println("Author Name : " + book.getAuthorName());
            System.out.println("IsAvailable : " + book.getIsAvailable());
            System.out.println("-----------------");
        }
        System.out.println("TOTAL BOOKS :" + books.size());
    }


}
