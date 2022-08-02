import java.util.Arrays;

/**
 * ac
 */
public class ac {
    static int start = 2;
  
    final int end;
  
    public ac(int x) {
  
                   x = 4;
  
                   end = x;
  
    }
  
    public void fly(int distance) {
  
                   System.out.println(end-start+" ");
  
                   System.out.println(distance);
  
    }


    public static void main(String[] args) {
       
//         for(int i = 0; i < 5; i++) 
//   System.out.print(i + ' ' + " ");


//   for(int i=0;i<= 0; i++) 
//   System.out.println("Hello World!");

 
// new ac(10).fly(5);


// String chair, table = "metal";
  // chair = chair + table;
// System.out.println(chair);

// Integer integer = new Integer(4);
//   System.out.print(integer.byteValue());
//   System.out.print("-");
  
// int i = new Integer(4);
  
// System.out.print(i.byteValue());

byte x = 127;
  x++;
x++;
System.out.print(x);


int tab[] = new int [6];    
  
for (int i = 6; i > 0; i--)

  tab[6-i] = i;

Arrays.fill(tab, 1, 5, 0);  

for (int i = 0; i < 6 ; i++)

  System.out.print(tab[i]);
    }
}