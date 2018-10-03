package ro.jademy.carRent.people;

public class Salesman extends People{
    private String username;
    private String password;

    public Salesman(String firstName, String lastName, String username, String password) {
        super(firstName, lastName);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
