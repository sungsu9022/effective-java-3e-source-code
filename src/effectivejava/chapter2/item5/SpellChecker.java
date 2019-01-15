package effectivejava.chapter2.item5;

// 코드 5-3
public class SpellChecker {
	private final Lexicon dictionary;

	public SpellChecker(Lexicon dictionary) {
		this.dictionary = Objects.requireNonNull(dictionary);
	}

	public boolean isVlaid(String word) {
		return true;
	}

	public List<String> suggestions(String type) {
		return new ArrayList();
	}
}
