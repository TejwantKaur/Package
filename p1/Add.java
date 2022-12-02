package p1;
import java.util.*;

public class Add {
    float sum;
    public void Addition(){
        
        System.out.print("Enter Num1 ");
        Scanner sc = new Scanner (System.in);
        float num1 = sc.nextFloat();

        System.out.print("Enter Num2 ");
        float num2 = sc.nextFloat();

        sum = num1+num2;

        System.out.println("Sum of " + num1 + " " + num2 + " is " + sum);

        sc.close();
    }
    
}
