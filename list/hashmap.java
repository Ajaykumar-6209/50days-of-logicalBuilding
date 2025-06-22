public class main {
    public static void main(String[] args) {
        // Create a new instance of the HashSet class
        java.util.HashSet<String, Integer> hashSet = new java.util.HashSet<String, Integer>();

        // Add elements to the HashSet
        hashSet.add("bachelor of technology", 1);
        hashSet.add("master of technology", 2);
        hashSet.add("Doctor of philosophy", 3);
        hashSet.add("bachelor degree", 4);
        hashSet.add("Bachelor of medicine bachelor of surgery", 5);

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