public class Book {
    private int bookID;
    private String bookName;
    private String authorName;
    boolean available;

    public int getBookID() {
        return bookID;
    }
    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean getIsAvailable() {
        return available;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setIsAvailable(boolean issuedStatus) {
        this.available = issuedStatus;
    }
}
