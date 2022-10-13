import java.util.Scanner;
public class AgeCompare {
    public static void main (String args[])
    {
        int p1,p2,p3;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Age of First person :");
        p1 = in.nextInt();
        System.out.println("Enter The Ages of Second persons :");
        p2= in.nextInt();
        System.out.println("Enter The Ages of Third persons :");
        p3 = in.nextInt();

        if(p1>p2 && p1>p3 ) {
            System.out.println("Entered age of person is highest" + p1);
        }
        else if(p2>p3 && p2>p1) {
            System.out.println("Entered age of person is highest" + p2);
        }
        else {
            System.out.println("Entered age of person is highest" + p3);
        }
    }
}
