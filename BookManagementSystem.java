import java.util.*;
public class BookManagementSystem{
       public static void main(String[] args){
            Library library=new Library();
            Scanner in=new Scanner(System.in);
            int n=1;
            while(n==1){
                System.out.println("1  Add book");
                System.out.println("2  Remove book");
                System.out.println("3  Search book");
                System.out.println("4  Display books");
                System.out.println("5 Exit");
                System.out.println("choose option");
                int option= in.nextInt();
                switch(option){
                    case 1:
                        System.out.println("Enter bookID : ");
                        int bookID=in.nextInt();
                        System.out.println("Enter Anthor : ");
                        in.nextLine();
                        String author=in.nextLine();
                        System.out.println("Enter title : ");
                        in.nextLine();
                        String title=in.nextLine();
                        Book book=new Book(bookID,author,title);
                        library.addBook(book);
                        break;
                    case 2:
                        System.out.println("Enter bookID : ");
                        int remove =in.nextInt();
                        library.removeBook(remove);
                        break;
                    case 3:
                        System.out.println("Enter bookID to Search : ");
                        int search=in.nextInt();
                        Book foundbook=library.searchBook(search);
                        if(foundbook !=null){

                        }else{
                            System.out.println("Book  not found ");
                        }
                    case 4:
                        library.display();
                        break;
                    case 5:
                        n=0;
                        break;
                    default:
                        System.out.println("Enter valid option...");

                }
            }
       }
}
