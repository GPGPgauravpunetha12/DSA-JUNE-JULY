public class Power {
static int pwr(int n,int p){
//termination case 
if(p==0){
    return 1;
}
//small problem 

//head recursion first call then processing
int smallRes=pwr(n,p-1);
//processing logic
return smallRes*n;
}
    public static void main(String[] args) {
    //    int r=pwr(2,5);
        System.out.println(pwr(2,5));
    }
}
