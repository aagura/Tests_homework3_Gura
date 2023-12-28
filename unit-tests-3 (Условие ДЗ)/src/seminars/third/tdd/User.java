package seminars.third.tdd;

public class User {

    String name;
    String password;

    boolean isAdmin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    //3.6.
    public boolean login(String name, String password) {
        if (name.equals(this.name) && password.equals(this.password)) {
            isAuthenticate = true;
            if (name.equals("admin")){
                isAdmin = true;
            }
            return true;
        }
        return false;
    }

    public boolean logOut(String name, String password) {
        if (name.equals(this.name) && password.equals(this.password)) {
            isAuthenticate = false;
            return true;
        }
        return false;
    }

}