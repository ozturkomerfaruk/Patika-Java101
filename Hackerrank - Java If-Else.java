import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num % 2 == 1) {
            System.out.println("Weird");
        } else if (num % 2 == 0 && num >= 2 && num <= 5) {
            System.out.println("Not Weird");
        } else if (num % 2 == 0 && num >= 6 && num <= 20) {
            System.out.println("Weird");
        } else if (num % 2 == 0 && num >= 20) {
            System.out.println("Not Weird");
        }
    }
}