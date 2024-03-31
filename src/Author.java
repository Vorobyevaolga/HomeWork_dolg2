public class Author {

    private final String name;
    private final String lastName;


    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
            }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }


    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (!super.equals(object))
            return false;
        Author author = (Author) object;
        return java.util.Objects.equals(name, author.name) && java.util.Objects.equals(lastName, author.lastName);
    }

    public int hashCode() {
        return java.util.Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        return  name + " "+ lastName;
    }
}
