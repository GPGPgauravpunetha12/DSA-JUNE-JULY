
    import java.util.ArrayList;
    import java.util.Collection;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;
    
    public class listTomap {
        public static void main(String[] args) {
            List<String> names = new ArrayList<>();
            names.add("ram");
            names.add("shyam");
            names.add("sohan");
            names.add("mohan");
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < names.size(); i++) {
                String key = names.get(i);
                map.put(key, i + 1);
            }
            map.putIfAbsent("Tom", 1000);
            map.put("vim", map.getOrDefault("vim", 10));
    
            System.out.println(map);
            Collection<Integer> list = map.values();
            System.out.println(list);
            Set<String> keys = map.keySet();
            System.out.println(keys);
    
        }
    }
    