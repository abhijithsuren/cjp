//palindrome

import java.util.*;
public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rev=0, rem=0, num;
        System.out.println("Enter a number");
        num = sc.nextInt();
        int temp=num;
        while(num>0){
            rem = num % 10;
            rev = (rev*10)+rem;
            num = num / 10;
        }
        if(temp==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}