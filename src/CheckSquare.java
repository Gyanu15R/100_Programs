import java.util.Scanner;
public class CheckSquare {
    public static void main (String args[])
    {
        int l;
        int b;

        System.out.println("Enter The length and breadth of a rectangle from user and check if it is square or not. :");
        Scanner in = new Scanner(System.in);
        l = in.nextInt();
        b = in.nextInt();
        if(l==b)
            System.out.println("The length and breadth are equal so it is square ");
        else

            System.out.println("The length and breadth are not equal so it is rectangle");
    }
}