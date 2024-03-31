public class Main {
    public static void main(String[] args) {
        Author tolstoj = new Author("Лев", "Толстой", 1828);
        Author pushkin = new Author("Александр", "Пушкин", 1799);
        System.out.println("Автор 1 = " + tolstoj.getName() + " " + tolstoj.getLastName() + " " + "год рождения" + " " + tolstoj.getAge());
        System.out.println("Автор 2 = " + pushkin.getName() + " " + pushkin.getLastName() + " " + "год рождения" + " " + pushkin.getAge());
        Book vIM = new Book("Война и мир", tolstoj, 1867);
        Book kD = new Book("Капитанская дочь", pushkin, 1836);
        System.out.println("Книга1 = " + vIM.getNameBook() + " " + vIM.getYearBook());
        System.out.println("Книга2 = " + kD.getNameBook() + " " + kD.getYearBook());
        vIM.setYearBook(1890);
        System.out.println("Книга1_1 = " + vIM.getNameBook() + " " + vIM.getYearBook());
        print(vIM);
        print(kD);
    }

    private static void print(Book book) {
    System.out.println(book);
    }

}