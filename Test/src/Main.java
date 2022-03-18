public class Main {
    public static void main(String[] args) {


        String name = "         nAme   23";
        String symbol = name.trim();

        String search = "delette";

        StringBuilder str = new StringBuilder("My name");

        int start = str.indexOf(search);
        int end = str.indexOf(" ",start);

        str.replace(start,end,"HI!");
       // String sub = str.substring(start,end);
        System.out.println(str);

        str.deleteCharAt(5);
        System.out.println(str);

        str.delete(2,5);
        System.out.println(str);

        str.insert(8,9);
        System.out.println(str);
    }
}
