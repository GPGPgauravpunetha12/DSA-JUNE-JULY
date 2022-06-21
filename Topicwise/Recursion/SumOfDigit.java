public class SumOfDigit{
    //here also u can declare sum
static int SOD(int n,int sum){// declare sum in function or outside function
 //termination case
    //  if(n<=9)
    //   return  1;
//processing logic
//  return ((n%10==0)?0:n%10+SOD(n/10));


//Approch-2 by me 
//   Tail recursion:first processing then return  dosenot have further nothing to do nothing process just return which destroys a stack from memory
if(n==0) return sum;
sum+=n%10;
return SOD(n/10,sum);
}

    public static void main(String[] args) {
        int n=123;
        System.out.println(SOD(n,0));
    }
}