public class Main {
    public static void main(String[] args) {
        Author author = new Author("Роберт", "Грин");
        Book book = new Book("33 стратегии войны", author, 2006);
        System.out.println("Книга " + book.getTitle() + " Год " + book.getYear() + " Автор " + book.getAuthor().getFirstname() + " " + book.getAuthor().getLastname());
    }
}