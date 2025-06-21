public class main {
    publlic static void main(String[] args) {
        // Create a new instance of the HashSet class
        java.util.HashSet<String> hashSet = new java.util.HashSet<String>();

        // Add elements to the HashSet
        hashSet.add("html");
        hashSet.add("css");
        hashSet.add("javascript");
        hashSet.add("reactjs");
        hashSet.add("expressjs");
        hashSet.add("nodejs");
        hashSet.add("javascript"); // Duplicate element, will not be added

        // Iterate through the HashSet and print each element
        for (String webdev : hashSet) {
            System.out.println(webdev);
        }
    }
}