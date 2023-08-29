package comparable;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Names implements Comparable<Names> {
	private String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names o) {
		if (name.length() == o.name.length()) {
			return 0;
		} else if (name.length() < o.name.length()) {
			return 1;
		} else {
			return -1;
		}

	}

	@Override
	public String toString() {
		return name;
	}

}

public class App {

	public static void main(String[] args) {
		List<Names> names = new LinkedList<>();

		names.add(new Names("AnkurS"));
		names.add(new Names("Rajan"));
		names.add(new Names("SimonRG"));
		names.add(new Names("Cap.Price"));
		names.add(new Names("Alex"));

		App app = new App();
		app.printList(names);

		System.out.println("**********************");

		Collections.sort(names);
		app.printList(names);
		System.out.println("**********************");

	}

	void printList(List<Names> list) {
		Iterator<Names> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("element : " + iterator.next());
		}
	}
}
