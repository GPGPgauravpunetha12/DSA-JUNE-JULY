public class patternmatching {
    public static void main(String[] args) {
       String str = "ABCABCABDABE" ;
       String pat = "ABC" ;
       int n=str.length();
int p=pat.length();
for (int i=0; i<=(n-p); i++){ //prortise it (n-p)
    int j;
    for (j=0; j<p; j++){
    if(pat.charAt(j)!=str.charAt(i+j)){
        // System.out.println("pattern dosent exist found");
        break;
    }
  
    }
      // j loop end 
      if(j==p){
        System.out.println("patern found"+i);
    }
} }
}
