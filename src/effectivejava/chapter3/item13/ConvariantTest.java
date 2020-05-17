package effectivejava.chapter3.item13;

public class ConvariantTest {
	protected Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	private static class ConvariantTestEx extends ConvariantTest {
		public Animal getAnimal() {
			return animal;
		}

	}

	private static class Dog extends Animal {

	}

	private static class Animal {

	}
}
