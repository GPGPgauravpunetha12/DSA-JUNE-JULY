import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// wrong but attempted problem in implementation  
public class showAllOccurence {
    int start=0;

        
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,8,1};

        int search=1;
        System.out.println(showAllOccurencee(a,search,a.length-1));
            }
            
            public static Integer showAllOccurencee(int[] a,int search,int index) {
                List<Integer> li=new ArrayList<>();
             if(index==0)
                 return li.get(index);
        
        if(a[index]==search){
            li.add(index);
           index++;
        }
        else{
            index++;
        }
return li;
    }
}
//APP-2 int freq = Collections.frequency(Arrays.asList(array), 10);
