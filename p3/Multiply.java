package p3;
import java.util.Scanner;
public class Multiply {
    float m;

    public void Product(){

        System.out.print("Enter Num1 ");
        Scanner sc = new Scanner (System.in);
        float num1 = sc.nextFloat();

        System.out.print("Enter Num2 ");
        float num2 = sc.nextFloat();

        m = num1*num2;

        System.out.println("Product of " + num1 + " " + num2 + " is " + m);

        sc.close();
    }
}
