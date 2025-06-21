public class main{
    public static void main(String[] args) {
        
        Arraylist<String> list = new Arraylist<String>();
    
        list.add("Volvo");
        list.add("BMW");
        list.add("Ford");
        list.add("Mazda");
        list.add("Toyota");
        list.add("Honda");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}