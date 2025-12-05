import java.util.ArrayList;

public class User {
    private String name;
    private String password;
    private int userid;
    private static int nextuserid;

    private UserRole role;
    private ArrayList<Book> borrowedBooks;

    public User(String name, String password, UserRole role){
        this.name = name;
        this.password = password;
        this.userid = nextuserid++;
        this.role = role;
        this.borrowedBooks = new ArrayList<>();  //startet von 0 
    }

    //getter

    public String getname(){
        return this.name;
    }

    public String getpassword(){
        return this.password;
    }

    public UserRole getRole(){
        return role;
    }

    public boolean isAdmin(){
        return role == UserRole.ADMIN;
    }

    public boolean canBorrowBook() {
        return role.canBorrowBooks() && borrowedBooks.size() < 5;
    }

   //Login
    //(ArrayList<User> userliste) diese liste wird danach erstellt im main 
    public static User login(ArrayList<User> userliste, String username, String password){
        for (User user : userliste){
            if (user.getname().equals(username) && user.getpassword().equals(password)) {
               return user;
            }
            
        }
        return null;
    }

    



}
