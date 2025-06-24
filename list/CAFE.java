package list;
import java.util.*;
public class CAFE {
public static void main(String[] args){

     System.out.println("Welcome to the Java Cafe");
    Map<String, Double> menu = new HashMap<>(); 
    menu.put("milk", 15.0);
    menu.put("tea", 10.0);
    menu.put("coffee", 20.0);
    menu.put("boost", 20.0);
    menu.put("egg puff", 30.0);
    menu.put("biscuits", 10.0);
    menu.put("samosa", 6.0);
    menu.put("chicken roll", 35.0);

    List<String> Customer = new ArrayList<>();
    
    Queue<String> customers = new PriorityQueue<>();

    Set<Integer> resTables = new HashSet<>();

    Map<String, Integer> sales = new TreeMap<>();

    Customer.add("Alice");
    customers.add("boost");

    Customer.add("Bob");
    customers.add("Coffee");

    Customer.add("Anil");
    customers.add("egg puff");

    Customer.add("Charlie");
    customers.add("chicken roll");

    resTables.add(1);
    resTables.add(6);
    resTables.add(4);
    resTables.add(2);

    sales.put("chicken", 6);
    sales.put("egg puff", 3);
    sales.put("tea", 40);
    sales.put("coffee", 20);
    sales.put("boost", 30);

    System.out.println("processing orders | preparing items:");

    System.out.println("Menu Cafe :" + menu);

    for(String S : Customer){
        System.out.println(S);
    }
    
    System.out.println("Customers order items :" + customers);

    System.out.println("Customer booked Tables : " + resTables);

    System.out.println("sales of day :" + sales);


}

}
