import java.util.Objects;

public class Author {
    private String authorlastName;
    private String authorFirstName;
    private String autherSurName;

    public Author(String authorlastName, String authorFirstName, String autherSurName) {
        this.authorlastName = authorlastName;
        this.authorFirstName = authorFirstName;
        this.autherSurName = autherSurName;
    }

    public String getAuthorlastName() {
        return authorlastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAutherSurName() {
        return autherSurName;
    }

    public void setAuthorlastName() {
        this.authorlastName = authorlastName;
    }

    public void setAuthorFirstName() {
        this.authorFirstName = authorFirstName;
    }

    public void setAutherSurName() {
        this.autherSurName = autherSurName;
    }

    public boolean eguals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorlastName, author.authorlastName) && Objects.equals(authorFirstName, author.authorFirstName) && Objects.equals(autherSurName, author.autherSurName);
    }

    public int hashCode() {
        return Objects.hash(authorlastName, authorFirstName, autherSurName);
    }

    public String toString() {
        return authorlastName + " " + authorFirstName + " " + autherSurName;
    }
}
