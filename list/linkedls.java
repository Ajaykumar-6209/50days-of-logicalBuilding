public static void main(String[] args) {
    // Create a new instance of the LinkedList class
    LinkedList<String> list = new LinkedList<String>();

    // Add elements to the linked list
    list.add("java");
    list.add("python");
    list.add("c++");
    list.add("javascript");
    list.add("C#");
    list.add("ruby");

    // Iterate through the linked list and print each element
    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
    }
}