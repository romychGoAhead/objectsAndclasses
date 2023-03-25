public class Main {
    public static void print() {
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();

        Book oneBook = new Book("Шишка", "Виктор", 2005);
        Book secondBook = new Book("join", "Григорий", 1880);
        System.out.println("oneBook.title = " + oneBook.getTitle());
        System.out.println("oneBook.author = " + oneBook.getAuthor());
        System.out.println("oneBook.year = " + oneBook.getYear());
        print();
        oneBook.setYear(1990);
        System.out.println("oneBook.year = " + oneBook.getYear());
        print();
        System.out.println("secondBook.name = " + secondBook.getTitle());
        System.out.println("secondBook.author = " + secondBook.getAuthor());
        System.out.println("secondBook.year = " + secondBook.getYear());
        print();
        oneBook.setYear(1990);
        System.out.println("oneBook.year = " + oneBook.getYear());
        print();

        Author oneAuthor = new Author("Виктор", "Мухачев");

        System.out.println("oneAuthor.name = " + oneAuthor.getName());
        System.out.println("oneAuthor.Surname = " + oneAuthor.getSurname());
        print();
        Author secondAuthor = new Author("Никита", "Михалков");
        System.out.println("secondAuthor.name = " + secondAuthor.getName());
        System.out.println("secondAuthor.Surname = " + secondAuthor.getSurname());
    }

}
