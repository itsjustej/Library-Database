public class Author {
    private String firstName, lastName;

    public Author() {

    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName(String firstName) {
        return firstName;
    }

    String getLastName(String lastName) {
        return lastName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "Author: " + firstName + " " + lastName;
    }

}
