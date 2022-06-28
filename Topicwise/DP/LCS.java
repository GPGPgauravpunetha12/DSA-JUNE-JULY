public class LCS {
    static int lcsRec(String first,String second,int m,int n){
int count=0;
if(m==-1||n==-1)
return 0;

if(first.charAt(m)==second.charAt(n))
{
    count=1+lcsRec(first,second,m-1,n-1);
    return count;
}
else{
    int x=lcsRec(first,second,m,n-1);
    // if wiill not match then othe r strin g cond n will work
    int y=lcsRec(first,second,m-1,n);
    return Math.max(x,y);
}

    }
  public static void main(String[] args) {
    int len=lcsRec("AGGTAB","GXTXAYB","AGGTAB".length()-1,"GXTXAYB".length()-1);
 System.out.println(len);
}  
}
