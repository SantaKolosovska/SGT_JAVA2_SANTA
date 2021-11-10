package lesson8_practicaltask.task7;

public class AuthorTest {
    public static void main(String[] args) {

        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        System.out.println(anAuthor);
        anAuthor.setEmail("paul@nowhere.com");
        System.out.println(anAuthor);
    }
}
