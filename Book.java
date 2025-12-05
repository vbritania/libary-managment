
public class Book{
    private String author;
    private String title;
    private int bookid;
    private BookCategory category;
    private BookStatus status;
    private static int nextid;


public Book(String author, String title, int bookid, BookCategory category){
    this.author = author;
    this.title = title;
    this.bookid = nextid++;
    this.category = category;
    this.status = BookStatus.AVAILABLE;
}

//Getter

public BookCategory getcategory(){
    return this.category;
}

public BookStatus getstatus(){
    return this.status;
}

public String getauthor(){
    return this.author;
}

public String gettitle(){
    return this.title;
}

public int getbookid(){
    return this.bookid;
}

//Setter
public void setauthor(String author){
    this.author = author;
}

public void settitle(String title){
    this.title = title;
}

public void setCategory(BookCategory category){
    this.category = category;
}

public void setStatus(BookStatus status){
   this.status = status;
}

//Bucher Funktionen

public void borrowBook(){
    this.status = BookStatus.BORROWED;
}

public void returnBook(){
    this.status = BookStatus.AVAILABLE;
}

/*public void printBookInfoStatus(Book book){
    switch (book.getstatus) {
            case DAMAGED: 
            System.out.println("Kaputt");
            break;
            case BORROWED:
                System.out.println("AUsgeliehen");
            break;

            default AVAILABLE:
            System.out.println("Verfugabr");
            break;
    }
}
    */


@Override
public String toString(){
    return String.format("%s von %s (ID: %d) - Kategorie: %s - Status: %s",
            title, author, bookid, category, status);
}





}
