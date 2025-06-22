public class LogicalBuilding {
    public static void main(String[] args) {
        // Create a new instance of the TreeSet class
        java.util.TreeSet<String> list= new java.util.TreeSet<String>();

        // Add elements to the TreeSet
       
        list.add("banana");
        list.add("apple");
        list.add("kiwi fruit");
        list.add("orange");
        list.add("grape");

        // Iterate through the TreeSet and print each element
        for (String fruit : treeSet) {
            System.out.println(fruit);

            list.get(1);
            System.out.println("The second element is: " + list.get(1));
            list.set(1, "pineapple");
            System.out.println("After updating, the second element is: " + list.get(1));
        }

        
    }
   
}