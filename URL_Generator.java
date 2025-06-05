public class URLGenerator {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public String generateShortURL() {
        StringBuilder shortURL = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            shortURL.append(ALPHABET.charAt((int) (Math.random() * ALPHABET.length())));
        }
        return shortURL.toString();
    }
}
