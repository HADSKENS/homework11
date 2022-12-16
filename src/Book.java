public class Book {
    private String bookname;
    private int agepublication;
    Author name;


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


    public void setAgepublication(int agepublication) {
        this.agepublication = agepublication;
    }
}
