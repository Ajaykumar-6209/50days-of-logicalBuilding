public class main{
    public static void main(String[] args) {
        // Create a new instance of the LinkedHashMap class
        java.util.LinkedHashMap<String, String> city = new java.util.LinkedHashMap<String, String>();

        // Add elements to the LinkedHashMap
        city.put("india", "delhi");
        city.put("england", "london");
        city.put("america", "washington");
        city.put("france", "paris");
        city.put("germany", "berlin");

        for(String country : city.keySet()) {
            System.out.println("Country: " + country + ", Capital: " + city.get(country));
        }
        
    }
}