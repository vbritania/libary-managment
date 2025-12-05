import java.util.ArrayList;

public class Libary {
    private ArrayList<Book> books;
    
    public Libary(){
        books = new ArrayList<Book>();
    }

    //Bucher funktionen
    public void addBook(Book book){
        books.add(book);
    }   

    public void removeBook(Book book){
        books.remove(book);
    }

    public Book findbookbyId(int id){
        for (Book book : books){
            if (book.getbookid() == id) {
                return book;
            }
        }
        return null;
        }

        public void showallBooks(){
            for (Book book : books){
                System.out.println(book);
            }
        }



        //Suchmethode

       public Book findBookByTitle(String title) {
        for (Book book : books) {
        if (book.gettitle().equals(title)) {
            return book;  
        }
    }
    return null;  
}   
         // //da ja ein author mehrere bucher schriebt hat ist es statt public Book public ArrayList<Book> ware es nur Book dann wurde es das erste buch mtir dem author und die anderen bucher nciht auspcken
        // hatten wir auch bei title machen konnen
        public ArrayList<Book> findbookbyauthor(String author){
            ArrayList<Book> MK = new ArrayList<>();

            for (Book book : books){
                if (book.getauthor().equals(author)) {
                    MK.add(book);
                }
            }
            return MK;
        }

        

    }
