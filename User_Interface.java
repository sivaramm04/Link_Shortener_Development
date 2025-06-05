import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        LinkShortener linkShortener = new LinkShortener();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a long URL to shorten:");
            String longURL = scanner.nextLine();

            String shortURL = linkShortener.shortenURL(longURL);
            System.out.println("Short URL: " + shortURL);

            System.out.println("Enter a short URL to expand:");
            String shortURLToExpand = scanner.nextLine();

            String expandedURL = linkShortener.expandURL(shortURLToExpand);
            System.out.println("Expanded URL: " + expandedURL);
        }
    }
}
