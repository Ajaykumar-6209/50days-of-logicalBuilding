public class main {
    public static void main(String[] args) {
        // Create a new instance of the HashSet class
        java.util.HashSet<String, Integer> hashSet = new java.util.HashSet<String, Integer>();

        // Add elements to the HashSet
        hashSet.add("btech", 1);
        hashSet.add("mtech", 2);
        hashSet.add("phd", 3);
        hashSet.add("bachelor degree", 4);
        hashSet.add("mbbs");

        // Iterate through the HashSet and print each element
        for (String college : hashSet) {
            System.out.println("College: " + college);
        }

        // Check if an element exists in the HashSet
        if (hashSet.contains("phd")) {
            System.out.println("HashSet contains phd.");
        } else {
            System.out.println("HashSet does not contain phd.");
        }
    }
}