package p2;
import java.util.Scanner;
public class Subtract {
    float s;

    public void Subtration(){
        
        System.out.print("Enter Num1 ");
        Scanner sc = new Scanner (System.in);
        float num1 = sc.nextFloat();

        System.out.print("Enter Num2 ");
        float num2 = sc.nextFloat();

        s = num1-num2;

        System.out.println("Subtraction of " + num1 + " " + num2 + " is " + s);

        sc.close();
    }

}
