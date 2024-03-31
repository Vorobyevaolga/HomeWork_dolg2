public class Book {
    private final String nameBook;
    private final Author nameAuthor;
    private int yearBook;

    public Book(String nameBook, Author nameAuthor, int yearBook){
        this.nameBook=nameBook;
        this.nameAuthor=nameAuthor;
        this.yearBook=yearBook;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getYearBook() {
        return this.yearBook;
    }
    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (!super.equals(object))
            return false;
        Book book = (Book) object;
        return yearBook == book.yearBook && java.util.Objects.equals(nameBook, book.nameBook) && java.util.Objects.equals(nameAuthor, book.nameAuthor);
    }

    public int hashCode() {
        return java.util.Objects.hash(nameBook, nameAuthor, yearBook);
    }

    @Override
    public String toString() {
        return "Название книги: " + nameBook + ", автор: " + nameAuthor +
                ", год выпуска: " + yearBook ;
    }
}
