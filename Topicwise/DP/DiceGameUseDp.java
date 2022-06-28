import java.util.ArrayList;

public class DiceGameUseDp {
    //using memoization
    

//     static ArrayList<String> reachToTen(int currentValue, int endValue,int cache[]) {
//      // Termination Case

//      if (currentValue == endValue) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add("");
//         return list;
//     }
//     // Negative Case or Boundary Case
//     if (currentValue > endValue) {
//         ArrayList<String> list = new ArrayList<>();
//         return list;
//     }
    
//     // Dice Roll 1 to 6 Times
//     ArrayList<String> finalResult = new ArrayList<>();
//     for (int dice = 1; dice <= 6; dice++) {
//         // Small Problem
//         // currentValue + dice
//         int newValue = currentValue + dice;
//          cache[dice]=newValue;
//          if(cache[dice]!=0){
//             return cache[dice];
//         }
//         ArrayList<String> result = reachToTen(newValue, endValue, cache[]);
     
//         for (String s : result) {
//             finalResult.add(s + dice);
//         }
//     }
//     return finalResult;

// }

// public static void main(String[] args) {
//     ArrayList<String> result = reachToTen(0, 10,0);
//     System.out.println(result);
// }




//////////////////////////////Using Tabulation technique
static ArrayList<String> reachToTen(int currentValue, int endValue) {
    // Termination Case

    if (currentValue == endValue) {
       ArrayList<String> list = new ArrayList<>();
       list.add("");
       return list;
   }
   // Negative Case or Boundary Case
   if (currentValue > endValue) {
       ArrayList<String> list = new ArrayList<>();
       return list;
   }
   
   // Dice Roll 1 to 6 Times
   ArrayList<String> finalResult = new ArrayList<>();
   for (int dice = 1; dice <= 6; dice++) {
       // Small Problem
       // currentValue + dice
       int newValue = currentValue + dice;
      
        
       ArrayList<String> result = reachToTen(newValue, endValue);
    
       for (String s : result) {
           finalResult.add(s + dice);
       }
   }
   return finalResult;

}

public static void main(String[] args) {
   ArrayList<String> result = reachToTen(0,10);
   System.out.println(result);
}
}
