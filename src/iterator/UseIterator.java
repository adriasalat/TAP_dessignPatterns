package iterator;

/**
 * @autor Adrià Salat
 * Client demo showing how to traverse a NameRepository using the Iterator<T> API.
 *
 * What this demonstrates:
 * - The client depends only on abstractions (Container, Iterator).
 * - Internal storage (array) remains hidden inside NameRepository.
 * - The traversal logic (cursor/index) lives in the iterator, not in the client.
 */
public class UseIterator {

    public static void main(String[] args) {
        // 1) Build a repository with some data
        String[] data = {"Anna", "Biel", "Carla", "Dídac"};
        NameRepository repo = new NameRepository(data);

        // 2) Obtain a fresh iterator
        Iterator<String> it = repo.getIterator();

        // 3) Iterate uniformly, without touching arrays or indices
        System.out.println("Forward iteration:");
        while (it.hasNext()) {
            System.out.println("- " + it.next());
        }

        // 4) Obtain another iterator to traverse again from the start
        System.out.println("\nIterating again with a new iterator:");
        Iterator<String> it2 = repo.getIterator();
        while (it2.hasNext()) {
            System.out.println("- " + it2.next());
        }
    }
}
