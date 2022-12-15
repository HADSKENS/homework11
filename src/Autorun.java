public class Autorun {
    public static void main(String[] args) {
        Author Danil = new Author("Danil","Balakhonov");
        Book Dragons= new Book("Dragons",1992);
        System.out.println("Книгу с названием " + Dragons.getBookname()+" Написал " + Danil.getFirstname()+" "+Danil.getLastname()+" Она была опубликована в " + Dragons.getAgepublication()+" Году");
        Author Anton= new Author("Anton","Krasnov");
        Book Cars = new Book("Cars", 2015);
        System.out.println("Книгу с названием " + Cars.getBookname()+" Написал " + Anton.getFirstname()+" "+Anton.getLastname()+" Она была опубликована в " + Cars.getAgepublication()+" Году");
        Dragons.setAgepublication(2015);
        System.out.println("Книгу с названием " + Dragons.getBookname()+" Написал " + Danil.getFirstname()+" "+Danil.getLastname()+" Она была опубликована в " + Dragons.getAgepublication()+" Году");
    }
}
