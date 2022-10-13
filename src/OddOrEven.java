import java.util.Scanner;
public class OddOrEven {
   public static void main (String args[])
    {
        int i;
        System.out.println("Enter The Number to Check-- Even Or Odd :");
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        if(i % 2== 0)
            System.out.println("You Enter The Even Number");
        else
        System.out.println("You Enter The Odd Number");
    }
}
