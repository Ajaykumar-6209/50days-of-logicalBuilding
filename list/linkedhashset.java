public clas main{
    public static void main(String[] args) {
        // Create a new instance of the LinkedHashSet class
        java.util.LinkedHashSet<String> linkedHashSet = new java.util.LinkedHashSet<String>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("google");
        linkedHashSet.add("microsoft");
        linkedHashSet.add("orace");
        linkedHashSet.add("apple");
        linkedHashSet.add("flipkart");
        linkedHashSet.add("amazon");
        linkedHashSet.add("microsoft"); // Duplicate element, will not be added

        // Iterate through the LinkedHashSet and print each element
        for (String companies: linkedHashSet) {
            System.out.println(companies);
        }
    }
}