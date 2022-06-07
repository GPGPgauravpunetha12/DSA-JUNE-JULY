
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
    }
}
