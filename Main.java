import java.util.*;//To get input from the user(scanner)
public class Main
{
    public static void main(String args[])
    {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse_number = reverseNumber(n);
        System.out.println("The reverse of the given number is: "+reverse_number);
    }



    public static int reverseNumber(int number)
    {
        boolean isNoNegative = number < 0 ? true : false; //Instead of "number < 0 ? true : false" i could've simplified to "number<0"
        if(isNoNegative)
        {
            number = number * -1; //makes the number positive if the given number is negative
        }
        int reverse = 0;
        int lastDigit = 0;
        while (number >= 1)//this is basically all
        {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        return isNoNegative == true? reverse*-1 : reverse;// Instead of "isNoNegative == true?" i could've simplified to "isNoNegative"
    }
}
