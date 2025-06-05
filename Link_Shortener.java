import java.util.HashMap;
import java.util.Map;

public class LinkShortener {
    private Map<String, String> linkMap;

    public LinkShortener() {
        linkMap = new HashMap<>();
    }

    public String shortenURL(String longURL) {
        String shortURL = generateShortURL();
        linkMap.put(shortURL, longURL);
        return shortURL;
    }

    public String expandURL(String shortURL) {
        return linkMap.get(shortURL);
    }

    private String generateShortURL() {
        StringBuilder shortURL = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 6; i++) {
            shortURL.append(alphabet.charAt((int) (Math.random() * alphabet.length())));
        }
        return shortURL.toString();
    }
}
