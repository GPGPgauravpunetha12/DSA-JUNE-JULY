
    
    import java.util.HashSet;
    import java.util.LinkedHashSet;
    import java.util.TreeSet;
    
    public class setDemo {
        public static void main(String[] args) {
            // HashSet<Integer> set = new HashSet<>();
            // LinkedHashSet<Integer> set = new LinkedHashSet<>();
            TreeSet<Integer> set = new TreeSet<>();
            set.add(2);
    
            for (int i = 1; i <= 10; i++) {
                set.add(i * 3);
            }
            set.add(4);
            set.add(8);
            set.add(3);
            set.add(6);
            // System.out.println(set);
            for (Integer s : set) {
                System.out.println(s);
            }
        }
    
    }
    