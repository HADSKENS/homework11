public class Autorun {
    public static void main(String[] args) {
        Author Danil = new Author("Danil","Balakhonov");
        Book Dragons= new Book("Dragons",1992);
        String name=Danil.getFirstname();
        Dragons.setFirstname(name);
        String name1=Danil.getLastname();
        Dragons.setLastname(name1);
        System.out.println("Книгу с названием " + Dragons.getBookname()+" Написал " + Dragons.getFirstname()+" "+Dragons.getLastname()+" Она была опубликована в " + Dragons.getAgepublication()+" Году");
        Author Anton= new Author("Anton","Krasnov");
        Book Cars = new Book("Cars",2015);
        String name2=Anton.getFirstname();
        Cars.setFirstname(name2);
        String name3=Anton.getLastname();
        Cars.setLastname(name3);
        System.out.println("Книгу с названием " + Cars.getBookname()+" Написал " + Cars.getFirstname()+" "+Cars.getLastname()+" Она была опубликована в " + Cars.getAgepublication()+" Году");
        Dragons.setAgepublication(2015);
        System.out.println("Книгу с названием " + Dragons.getBookname()+" Написал " + Dragons.getFirstname()+" "+Dragons.getLastname()+" Она была опубликована в " + Dragons.getAgepublication()+" Году");
    }
}
