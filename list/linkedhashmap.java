public class main{
    public static void main(String[] args) {
        // Create a new instance of the LinkedHashMap class
        java.util.LinkedHashMap<String, String> capitalcities = new java.util.LinkedHashMap<String, String>();

        // Add elements to the LinkedHashMap
        capitalcities.put("india", "delhi");
        capitalcities.put("england", "london");
        capitalcities.put("america", "washington");
        capitalcities.put("france", "paris");
        capitalcities.put("germany", "berlin");

        for(String country : capitalcities.keySet()) {
            System.out.println("Country: " + country + ", Capital: " + capitalcities.get(country));
        }
        
    }
}