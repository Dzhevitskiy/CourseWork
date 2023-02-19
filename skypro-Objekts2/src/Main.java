public class Main {

    public static void main(String[] args) {
        Author author = new Author("Роберт", "Грин");
        Book book = new Book("33 стратегии войны", author, 2006);
        Book book1 = new Book ("33 стратеии войны", author, 2006);
        System.out.println("Книга " + book.getTitle() + " Год " + book.getYear() + " Автор " + book.getAuthor().getFirstname() + " " + book.getAuthor().getLastname());
    if(book.equals(book1)) {
        System.out.println("Одинаковые книги");
    } else {
        System.out.println("Разные книги");
    }
    Author author1 = new Author("Роберт", "Грин");

    if(author1.equals(author)) {
        System.out.println("Одинаковый автор");
    } else {
        System.out.println("Другой автор");
    }
    }
}
