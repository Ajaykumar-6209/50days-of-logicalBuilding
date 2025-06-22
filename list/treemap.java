public class main{
    public static void main(String[] args) {
        // Create a new instance of the LinkedHashMap class
        java.util.LinkedHashMap<String, Integer> linkedHashMap = new java.util.LinkedHashMap<String, Integer>();


        linkedHashMap.put("fried", 549);
        linkedHashMap.put("pizza", 399);
        linkedHashMap.put("burger", 199);
        linkedHashMap.put("pasta", 299);
        linkedHashMap.put("noodles", 149);
        // Iterate through the LinkedHashMap and print each element
        for(String food : linkedHashMap.keySet()) {
            System.out.println(food.get(1));

            linkedHashMap.set(food, linkedHashMap.get(food) + 50); // Incrementing the price by 50

            System.out.println(linkedHashMap.get(food)); // Print the updated price

            linkedHashMap.remove("pizza", 399); // Remove the food item from the LinkedHashMap
            System.out.println("After removing pizza, the LinkedHashMap is: " + linkedHashMap);
        }
    }
}