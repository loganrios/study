// Inappropriate use of static utility - inflexible and untestable!
public class SpellChecker {
    private static final Lexicon dictionary = ...;
    private SpellChecker() {} // Noninstantiable
    public static boolean isValid(String word) { return false; }
    public static List<String> suggestions(String typo) {}
}

// Inappropriate use of a singleton, also inflexible and untestable.
public class SpellChecker {
    private final Lexicon dictionary = ...;
    private SpellChecker() {}
    public static INSTANCE = new SpellChecker();
    public boolean isValid(String word) {...}
    public List<String> suggestions(String typo) {...}
}

// Dependency injection provides flexibility and testability
public class SpellChecker {
    private final Lexicon dictionary;
    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {}
    public List<String> suggestions(String typo) {}
}
