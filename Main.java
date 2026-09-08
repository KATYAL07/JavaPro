import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Java Algorithms Mini-Project ---");
            System.out.println("1. Generate Permutation");
            System.out.println("2. Test LRU Cache");
            System.out.println("3. Test Trie Dictionary");
            System.out.println("4. Test Topological Sort (Course Schedule)");
            System.out.println("5. Exit");
            System.out.print("Select an option (1-5): ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    runPermutation(scanner);
                    break;
                case "2":
                    runLRUCache();
                    break;
                case "3":
                    runTrie();
                    break;
                case "4":
                    runTopologicalSort();
                    break;
                case "5":
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }

    private static void runPermutation(Scanner scanner) {
        System.out.println("\n--- Permutation Generator ---");
        System.out.print("Enter n (e.g., 4): ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter k (e.g., 9): ");
        int k = Integer.parseInt(scanner.nextLine());

        Solution solution = new Solution();
        String result = solution.getPermutation(n, k);
        System.out.println("The " + k + "th permutation of sequence 1 to " + n + " is: " + result);
    }

    private static void runLRUCache() {
        System.out.println("\n--- LRU Cache Demo ---");
        LRUCache cache = new LRUCache(2);
        System.out.println("Created cache with capacity 2");
        cache.put(1, 1);
        System.out.println("Put (1, 1)");
        cache.put(2, 2);
        System.out.println("Put (2, 2)");
        System.out.println("Get 1: " + cache.get(1));
        cache.put(3, 3);
        System.out.println("Put (3, 3) - evicts key 2");
        System.out.println("Get 2: " + cache.get(2));
        cache.put(4, 4);
        System.out.println("Put (4, 4) - evicts key 1");
        System.out.println("Get 1: " + cache.get(1));
        System.out.println("Get 3: " + cache.get(3));
        System.out.println("Get 4: " + cache.get(4));
    }

    private static void runTrie() {
        System.out.println("\n--- Trie Dictionary Demo ---");
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println("Inserted 'apple'");
        System.out.println("Search 'apple': " + trie.search("apple"));
        System.out.println("Search 'app': " + trie.search("app"));
        System.out.println("StartsWith 'app': " + trie.startsWith("app"));
        trie.insert("app");
        System.out.println("Inserted 'app'");
        System.out.println("Search 'app': " + trie.search("app"));
    }

    private static void runTopologicalSort() {
        System.out.println("\n--- Topological Sort Demo ---");
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        System.out.println("Courses: 4, Prerequisites: [1->0], [2->0], [3->1], [3->2]");
        System.out.println("Resolving dependency order...");
        
        java.util.List<Integer> order = GraphUtils.topologicalSort(numCourses, prerequisites);
        System.out.println("Valid completion order: " + order);
    }
}
