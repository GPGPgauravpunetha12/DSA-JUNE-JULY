import java.util.HashMap;
import java.util.Stack;

public class BalanceParethesis {

    static boolean isBalance(String str) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');
        for (char singleChar : str.toCharArray()) {
            if (singleChar == '(' || singleChar == '[' || singleChar == '{') {
                stack.push(singleChar);
            } else {
                // Closing Bracket Lookup
                Character topOpeningBracket = stack.pop(); // top element
                // lookup in stack
                Character closingBracket = bracketMap.get(topOpeningBracket);
                if (closingBracket != singleChar) {
                    return false; // Invalid Bracket
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "({[]}}";
        String result = isBalance(str) ? "Valid " : "Not Valid";
        System.out.println(result);

    }
}

   
   
    }
}
