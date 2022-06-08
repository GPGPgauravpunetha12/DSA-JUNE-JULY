public class StringMethods {
    public static void main(String[] args) {
        String name = "Amit Srivastava";
        int arr[] = { 10, 20, 30 };
        // char a[] = { 'A', 'B' };
        System.out.println(arr.length);
        System.out.println(name.length());
        // char w[] = name.toCharArray(); // String convert into char []
        // byte w1[] = name.getBytes(); // String convert into byte []
        System.out.println(name.indexOf("m")); // index or -1
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.contains("m")); // true , false
        name = "      Amit    Srivastava        ".trim(); // Remove Leading and Trailing Spaces
        String msg = "Hello How are you";
        // String e[] = msg.split(" ");
        // for (String t : e) {
        // System.out.println(t);
        // }
        String e[] = msg.split("");
        for (String t : e) {
            System.out.print(t + ",");
        }
        System.out.println();
        System.out.println("Amit".substring(1));
        System.out.println("Amit".substring(1, 2));//(1 ,2-1)=(1,1)index which is m
        System.out.println("amit@gmail.com".startsWith("amit"));
        System.out.println("amit@gmail.com".endsWith(".com"));

    }
}
