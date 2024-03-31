public class Author {

    private String name;
    private String lastName;
    private int age;

    public Author(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (!super.equals(object))
            return false;
        Author author = (Author) object;
        return age == author.age && java.util.Objects.equals(name, author.name) && java.util.Objects.equals(lastName, author.lastName);
    }

    public int hashCode() {
        return java.util.Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        return  name + " "+ lastName;
    }
}
