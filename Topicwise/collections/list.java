
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Vector;
    
    public class list {

    
        static void show(List<Integer> list) {
    
        }
    
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>(); // Upcasting
            list.add(10);
            list.add(0, 100);
            List<Integer> list2 = new ArrayList<>();
            list2.add(1000);
            list2.add(2000);
            list.addAll(list2);
            list.remove(0);
            list.removeAll(list2); // Inner collection will be remove
            list.clear(); // all element will be remove
            int i = list.size();
            System.out.println(list.indexOf(10) >= 0 ? "Found" : "Not found");
            System.out.println(list.contains(10) ? "Found" : "Not Found");
            System.out.println(list);
            for (Integer ele : list) {
                System.out.println(ele);
            }
            // Java 1.8
            list.forEach((element) -> System.out.println(element));
            list.sort((first, second) -> first.compareTo(second));
            Collections.reverse(list);
            show(new ArrayList<>());
            show(new Vector<>());
            show(new LinkedList<>());
        }
    }
    