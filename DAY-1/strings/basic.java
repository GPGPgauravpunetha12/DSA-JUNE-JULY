
public class basic {
  
    
    public static void main(String[] args) {
      
    // intern check in pool
   // string buffer  
    String name= "Gaurav";
    name=name+"gaurav";
    StringBuffer sb =new StringBuffer("klewewe");//+16 by default it is synchronisesd so single
    System.out.println(sb.length());
    System.out.println(sb.capacity());
    sb.append("lflleld,eldedlsdlsssd");
    System.out.println(sb.length());
    System.out.println(sb.capacity());
    sb.append("lweflleld,eldedlsdlsssd");
    // oldcapcity*2+2 
    System.out.println(sb.length());
    System.out.println(sb.capacity());

    // string builder is assync sb.reverse sb.delete string buffer mmutable here
    StringBuilder sbss = new StringBuilder("amit");
    System.out.println(sbss.length()); // 4
    System.out.println(sbss.capacity()); // 16 + 4 = 20
    sbss.append(" lljljkl fghfghghghf hfghgfhfg htfghfghfgh hfgfghfg hgfhfgh hfghfgh");
    System.out.println(sbss.length());
    System.out.println(sbss.capacity());
    sbss.append("jgfdlkgd"); // add at end
    sbss.insert(1, "a"); // add at index
    sbss.reverse();
    sbss.delete(2, 5); // Multi Char delete
    sbss.deleteCharAt(1); // single char delete

    System.out.println(sbss.length());
    System.out.println(sbss.capacity());

    // New cap= Old Cap * sizeOfOneChar + LastChar
    // = 20 * 2 + 2
    // String name = "Amit".intern();
    String name2 = new String("Amit").intern();
    String name3 = "Amit".intern();
    System.out.println(name == name2);
    System.out.println(name.equals(name2));
    System.out.println("RAM".equals("ram")); // false
    System.out.println("RAM".equalsIgnoreCase("ram")); // true
    System.out.println("Ram".compareTo("Amit")); // Positive Value
    System.out.println("Amit".compareTo("Ram")); // Negative
    System.out.println("Amit".compareTo("Amit")); // 0
    System.out.println(name == name3);
    System.out.println("Amit".charAt(0)); // single character

    }
}
