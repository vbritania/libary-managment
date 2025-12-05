import java.lang.reflect.Member;

public enum UserRole {
    GUEST("Gast"),
    MEMBER("Mitglied"),
    ADMIN("Angestellter");

    private String beschreibung;

    
    UserRole(String beschreibung){  
        this.beschreibung = beschreibung;
    }

    public String getrolle(){
        return this.beschreibung;
    }


    //Berechtigugen

    public boolean canBorrowBooks(){
        return this == MEMBER || this == ADMIN;
    }

    public boolean canmanagebooks(){
        return this == ADMIN;
    }

    public boolean canManageUser(){
        return this == ADMIN;
    }
}


