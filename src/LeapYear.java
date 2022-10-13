import java.time.Year;
import java.util.Scanner;
public class LeapYear {
    private static boolean isLeap(int year){
        //!this condition will return year is leap year or not
        return (year%4 == 0) && (year%100 != 0) ||(year%400 ==0);
    }
    public static void main(String[] args) {
        System.out.println("Enter Year");
        int year = new Scanner(System.in).nextInt();
        System.out.print(
                isLeap(year)?
                        year + " is leap year" :
                        year + " is not leap year"
        );
    }
}
