package Functions;
import java.util.*;

public class Functions{
    public static void printMyName(String name){ //printMyName = function name, public static void = returntype, String name = type argument
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String name = sc.next();
            printMyName(name);//function call
    }
}