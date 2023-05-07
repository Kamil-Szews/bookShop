public class book {
    private String bookName;
    private String author;
    private int length;

    book(String bookName, String author, int length){
        this.bookName = bookName;
        this.author = author;
        this.length = length;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getLength() {
        return length;
    }
}
