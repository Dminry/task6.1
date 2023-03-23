import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordChecker {
    private Set<String> words;

    public WordChecker(String text) {
        this.words = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return words.contains(word);
    }
}
