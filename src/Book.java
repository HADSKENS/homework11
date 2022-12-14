public class Book {
    private String bookname;
    private int agepublication;
    private String firstname;
    private String lastname;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Book(String bookname, int agepublication) {
        this.bookname = bookname;
        this.agepublication = agepublication;
    }

    public String getBookname() {
        return this.bookname;
    }

    public int getAgepublication() {
        return this.agepublication;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setAgepublication(int agepublication) {
        this.agepublication = agepublication;
    }
}
