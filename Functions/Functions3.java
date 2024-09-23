package Functions;
//Ques. Make a function to multiply 2 numbers and return the product.
import java.util.*;

public class Functions3 {
    public static int calculateProduct(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = calculateProduct(a, b);
        System.out.println("Product of 2 numbers is: "+ product);
    }
}
