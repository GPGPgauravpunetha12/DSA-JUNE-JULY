
/**
 * Last_element_of_search_array
 */
public class Last_element_of_search_array {

    public static void main(String[] args) {
int a[] = {1,2,3,4,5,6,8,1};

int search=1;
System.out.println(findLastElment(a,search,a.length-1));
    }
    
    private static int findLastElment(int[] a,int search,int index) {
      
  if(index==0)
         return index;

if(a[index]==search){
    return index;}
else{
    index--;
}
return index;
    }
}