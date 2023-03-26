public class Main {
    public static void print() {
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();

        Author pushkin = new Author("Александр ", "Пушкин");
        Book dubrovsky = new Book("Дубровский", pushkin, 1833);

        System.out.println("Книга = " + dubrovsky.getTitle());
        System.out.println("Автор = " + pushkin.getName() + pushkin.getSurname());
        System.out.println("Год издания = " + dubrovsky.getYear());
        print();

        dubrovsky.setYear(1841);
        System.out.println("Год издания = " + dubrovsky.getYear());
        print();

        Author gogol = new Author("Николай ", "Гоголь");
        Book Viy = new Book("Вий", gogol, 1835);

        System.out.println("Книга = " + Viy.getTitle());
        System.out.println("Автор = " + gogol.getName() + gogol.getSurname());
        System.out.println("Год издания = " + Viy.getYear());
        print();
    }
}
