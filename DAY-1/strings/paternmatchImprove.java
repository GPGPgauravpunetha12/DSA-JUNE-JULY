public class paternmatchImprove {
   
        public static void main(String[] args) {
           String str = "WABCABCABDABE" ;
           String pat = "ABC" ;
           int n=str.length();
    int p=pat.length();
    for (int i=0; i<=(n-p); ){ //prortise it (n-p)
        int j;
        for (j=0; j<p; j++){
        if(pat.charAt(j)!=str.charAt(i+j)){
            // System.out.println("pattern dosent exist found");
           // works only for distincr=t character
            break;
        } }
          // j loop end 
          if(j==p){
            System.out.println("patern found"+i);
        }
        if(j==0){
          i++;//when pat is zro
        }
        else{
            // when pat is in middle i=i+j
            i=i+j; 
        }
    } }
    }
    