public class Book {
      private int bookID;
       private String author;
       private String title;
        private boolean isAvailable;
       public Book(int bid,String author,String title){
          this.bookID=bid;
          this.author=author;
          this.title=title;
          this.isAvailable=true;
       }

       public int getBookID() {
              return bookID;
       }

       public String getAuthor() {
              return author;
       }

       public String getTitle() {
              return title;
       }

       public boolean isAvailable() {
              return isAvailable;
       }
}
class Library {
    private Book[] books;
    int size = 0;

    public Library() {
        this.books = new Book[5];
    }
    public void addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
        } else {
            System.out.println("Library Full");
        }
    }
    public void removeBook(int bookID) {
        for (int i = 0; i < size; i++) {
            if (books[i].getBookID() == bookID) {
                books[i] = null;
                size--;
                break;
            }
        }
    }
    public Book searchBook(int bookID) {
        for(int i = 0; i < size; i++) {
            if (books[i].getBookID() == bookID) {
                return books[i];
            }else{
                return null;
            }
        }
        return null;
    }
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println("BookID" + books[i].getBookID());
            System.out.println("Author :" + books[i].getAuthor());
            System.out.println("title :" + books[i].getTitle());
            String istrue = (books[i].isAvailable()) ? "YES" : "NO";
            System.out.println("Available :" + istrue);
        }
    }
}
