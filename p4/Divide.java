package p4;
import java.util.Scanner;
public class Divide {
    float d;
    
    public void Div(){

        System.out.print("Enter num1 ");
        Scanner sc = new Scanner (System.in);
        float num1 = sc.nextFloat();

        System.out.print("Enter num2 ");
        float num2 = sc.nextFloat();

        d = num1/num2;

        System.out.print("The Division of " + num1 + " " + num2 + " is " + d);

        sc.close();

    }
}
