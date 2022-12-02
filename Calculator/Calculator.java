package Calculator;
import java.util.Scanner;
import p1.Add;
import p2.Subtract;
import p3.Multiply;
import p4.Divide;

public class Calculator {
    public static void main(String args[]){
        System.out.print("Enter Your Choice 1,2,3,4 ");
        Scanner sc = new Scanner(System.in);
        int Ch = sc.nextInt();

        switch(Ch){
            case 1:
            Add a = new Add();
            a.Addition();
            break;

            case 2:
            Subtract s = new Subtract();
            s.Subtration();
            break;

            case 3:
            Multiply m = new Multiply();
            m.Product();
            break;

            case 4:
            Divide d = new Divide();
            d.Div();
            break;
            
        }

        sc.close();
    }
    
}
