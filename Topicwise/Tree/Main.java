import java.util.Arrays;

// public class SumOfDigit {
//     public static void main(String args[]) {
//         int x = sumOfDigits(1234567);
//         int y = sumOfDigits(97842132);
//         int z = sumOfDigits(254671524);
//         int sum = sumOfDigits(x + y + z);
//         System.out.println("Sum Of Digits " + sum);
//     }
//     public static int sumOfDigits(int number) {
//         if (number / 10 == 0)
//             return number;
//         return number % 10 + sumOfDigits(number / 10);
//     }
//     public static int sumOfDigitsIterative(int number) {
//         int result = 0;
//         while (number != 0) {
//         result = result + number % 10;
//             number = number / 10;
//         }
//         return result;
//     }
// }


// public class PhoneRings {

//     public static void main(String[] args) {
//         System.out.print(call(53) + " " + call(25));
//     }

//     public static int call(int number) {
//         System.out.print(number + ":");
//         if (number % 7 == 0) {
//             return 77;
//         }
//         if (number % 6 == 0) {
//             return 66;
//         }
//         return call(number - 1);
//     }
// }


// public class ArrayOutput
// {
//     public static void main(String s[])
//     {
//         int student_marks[] = new int[39];
//         float[] my_array = new float[student_marks.length];
//         System.out.println("My Array length is: " + my_array.length);
//         System.out.println("Student Marks Array length is: " + student_marks.length);
//     }
// }


// class ArrayOutput
// {
//     public static void main(String s[])
//     {
//         int input[][] = {{2, 4, 0},
//                     {5, 5, 3},
//                     {1, 0, 0}};
//         System.out.println("Determinant of given matrix is : " + getDeterminant(input));
//     }

//     public static int getDeterminant(int matrix[][])
//     {
//         int result = 0;
        
//         result = (matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[2][1] * matrix[1][2])
        
//                 - matrix[1][0] * (matrix[0][1] * matrix[2][2] - matrix[2][1] * matrix[0][2])

//                 + matrix[2][0] * (matrix[0][1] * matrix[1][2] - matrix[1][1] * matrix[0][2]));
        
//         return result;
//     }
// }


// public class DemoOnArray {
//     public static void main(String args[]) {
//         int[][] firstArray, secondArray;
//         firstArray = new int[1][1];
//         secondArray = new int[2][2];
//         firstArray[0][0] = '\n';
//         secondArray[0][1] = 'a';
//         System.out.print("Mod = " + secondArray[0][1] % firstArray[0][0]);
//     }
// }

//  class Stack
// {
// 	protected static final int CAPACITY = 100;
// 	protected int size,top = -1;
// 	protected Object stk[];
 
// 	public Stack()
// 	{
// 		stk = new Object[CAPACITY];
// 	}
 
// 	public void push(Object item)
// 	{
// 		if(size_of_stack==size)
// 		{
// 			System.out.println("Stack overflow");
// 				return;
// 		}
// 		else
// 		{
// 			top++;
// 			stk[top]=item;
// 		}
// 	}
// 	public Object pop()
// 	{
// 		if(top<0)
// 		{
// 			return -999;
// 		}
// 		else
// 		{
// 			Object ele=stk[top];
// 			top--;
// 			size_of_stack--;
// 			return ele;
// 		}
// 	}
// }
 
// public class DemoOnArray
// {
// 	public static void main(String args[])
// 	{
// 		Stack myStack = new Stack();
// 		myStack.push(10);
// 		Object element1 = myStack.pop();
// 		Object element2 = myStack.pop();
// 		System.out.println(element2);
// 	}
// }


// class CircularQueue
// {
// 	protected static final int CAPACITY = 100;
// 	protected int size,front,rear;
// 	protected Object q[];
// 	int count = 0;
 
// 	public CircularQueue()
// 	{
// 		this(CAPACITY);
// 	}
// 	public CircularQueue (int n)
// 	{
// 		size = n;
// 		front = 0;
// 		rear = 0;
// 		q = new Object[size];
// 	}
 
 
// 	public void enqueue(Object item)
// 	{
// 		if(count == size)
// 		{
// 			System.out.println("Queue overflow");
// 				return;
// 		}
// 		else
// 		{
// 			q[rear] = item;
// 			rear = (rear+1)%size;
// 			count++;
// 		}
// 	}
// 	public Object dequeue()
// 	{
// 		if(count == 0)
// 		{
// 			System.out.println("Queue underflow");
// 			return 0;
// 		}
// 		else
// 		{
// 			Object ele = q[front];
// 			q[front] = null;
// 			front = (front+1)%size;
// 			count--;
// 			return ele;
// 		}
// 	}
// 	public Object frontElement()
// 	{
// 		if(count == 0)
// 		return -999;
// 		else
// 		{
// 			Object high;
// 			high = q[front];
// 			return high;
// 		}
// 	}
// 	public Object rearElement()
// 	{
// 		if(count == 0)
// 		return -999;
// 		else
// 		{
// 			Object low;
// 			rear = (rear-1)%size;
// 			low = q[rear];
// 			rear = (rear+1)%size;
// 			return low;
// 		}
// 	}
// }
// public class DemoOnArray
// {
// 	public static void main(String args[])
// 	{
// 		Object var;
// 		CircularQueue myQ = new CircularQueue();
// 		myQ.enqueue(10);
// 		myQ.enqueue(3);
// 		var = myQ.rearElement();
// 		myQ.dequeue();
// 		myQ.enqueue(6);
// 		var = mQ.frontElement();
// 		System.out.println(var+" "+var);
// 	}
// }

// class Array 
// {
//     public static void main(String args[]) 
//     {
//         int array[] = new int [5];
//         for (int i = 5; i > 0; i--)
//             array[5-i] = i;
//         Arrays.fill(array, 1, 4, 8);
//         for (int i = 0; i < 5 ; i++)
//             System.out.print(array[i]);
//     }
// }

// import java.util.*;
// class Bitset 
// {
//     public static void main(String args[]) 
//     {
//         BitSet obj = new BitSet(5);
//         for (int i = 0; i < 5; ++i)
//             obj.set(i);
//         obj.clear(2);
//         System.out.print(obj);
//     }


// }


// import java.util.*;
// class Collection_iterators 
// {
//     public static void main(String args[]) 
//     {
//         ListIterator a = list.listIterator();
//             if(a.previousIndex()! = -1)
//                 while(a.hasNext())
//                 System.out.print(a.next() + " ");
//             else
//                System.out.print("EMPTY");
//     }
// }


// import java.util.*;
// class Collection_iterators 
// {
//     public static void main(String args[]) 
//     {
//         LinkedList list = new LinkedList();
//         list.add(new Integer(2));
//         list.add(new Integer(8));
//         list.add(new Integer(5));
//         list.add(new Integer(1));
//         Iterator i = list.iterator();
//         Collections.reverse(list);
//     Collections.shuffle(list);
//         i.next();
//         i.remove();
//         while(i.hasNext())
//         System.out.print(i.next() + " ");
//     }
// }

// class array_output 
// {
//     public static void main(String args[]) 
//     {
//         int array_variable [] = new int[10];
//     for (int i = 0; i < 10; ++i) 
//         {
//             array_variable[i] = i;
//             System.out.print(array_variable[i] + " ");
//             i++;
//         }
//     } 
// }

// class multidimention_array 
// {
//     public static void main(String args[])
//     {
//         int arr[][] = new int[3][];
//         arr[0] = new int[1];
//         arr[1] = new int[2];
//         arr[2] = new int[3];               
//     int sum = 0;
//     for (int i = 0; i < 3; ++i) 
//         for (int j = 0; j < i + 1; ++j)
//                 arr[i][j] = j + 1;
//     for (int i = 0; i < 3; ++i) 
//         for (int j = 0; j < i + 1; ++j)
//                 sum + = arr[i][j];
//     System.out.print(sum); 	
//     } 
// }



// class array_output 
// {
//     public static void main(String args[]) 
//     {
//         int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
//         int sum = 0;
//         for (int i = 0; i < 3; ++i)
//             for (int j = 0; j <  3 ; ++j)
//                 sum = sum + array_variable[i][j];
//         System.out.print(sum / 5);
//     } 
// }

// class Modulus 
//     {
//         public static void main(String args[]) 
//         {    
//              double a = 25.64;
//              int  b = 25;
//              a = a % 10;
//              b = b % 10;
//              System.out.println(a + " "  + b);
//         } 

//     }


public class Main 
{
  public static void main(String args[]) 
  {
    int tab[] = new int [6];
    
    for (int i = 6; i > 0; i--)
      tab[6-i] = i;
    
    Arrays.fill(tab, 1, 5, 0);
    
    for (int i = 0; i < 6 ; i++)
      System.out.print(tab[i]);
  }
}
