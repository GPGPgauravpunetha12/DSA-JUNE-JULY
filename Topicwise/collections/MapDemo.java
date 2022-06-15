
    import java.util.HashMap;
    import java.util.Iterator;
    import java.util.LinkedHashMap;
    import java.util.Map;
    import java.util.Set;
    import java.util.TreeMap;
    
    public class MapDemo {
        public static void main(String[] args) {
            // Map<String, Integer> map = new HashMap<>();
            // Map<String, Integer> map = new LinkedHashMap<>();
            Map<String, Integer> map = new TreeMap<>();
            map.put("amit", 11111);
            map.put("ram", 22222);
            map.put("ram", 5345);
            System.out.println(map);
            System.out.println(map.get("amit")); // TC O(1)
            // map.remove("ram");
            String result = map.containsKey("amit") ? "Found Key " : "Not Found Key";
            // map.containsValue(11111)
            map.put(null, null);
            map.put(null, null);
            map.put("mike", null);
            map.put("tim", null);
            System.out.println(map);
            for (Map.Entry<String, Integer> m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
            Set<String> set = map.keySet();
            Iterator<String> itr = set.iterator();
            while (itr.hasNext()) {
                String key = itr.next();
                System.out.println(key + " " + map.get(key));
            }
        }
    }
    