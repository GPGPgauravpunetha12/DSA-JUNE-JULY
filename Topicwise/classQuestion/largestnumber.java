package classQuestion;
public class largestnumber {
    public static void main(String[] args) {
        int[] arr={34,12,459,100031,1242,2900,9000};

// Approch-1  Bruteforce
//         int max=0;
// for(int i=0;i<p.length;i++){
//     for(int j=1;j<p.length;j++){
//         if(p[i]>p[j])
//            { max=p[i];}
//         else{
//             max=p[j];
//             break;  } 
//     }  }
// System.out.println(max);

  int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Value is " + max);

        // Approch-2  Bruteforce
        // boolean isLargest = false;
        // // Traverse the Elements one by one
        // for (int i = 0; i < arr.length; i++) {
        // isLargest = true;
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[j] > arr[i]) {
        // isLargest = false;
        // break;

        // }
        // } // jth loop end
        // if (isLargest) {
        // System.out.println("Largest Element " + arr[i]);
        // return;
        // }
        // }


    }
}
