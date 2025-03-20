package model;

public class ClubMember{
    private static int ID_COUNTER = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public ClubMember(String firstName, String lastName, String email) {
        if (email == null) {
            throw new IllegalArgumentException("email cannot be null");
        }
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("email not properly formatted");
        }
        id = ID_COUNTER++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
