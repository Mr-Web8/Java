//small game program to search the number the range is 0-50
import java.util.*;

public class online {
   static  void my(){
       int attempts = 1;
       System.out.println("You have 5 attempts to guess the no.");
       Random r = new Random();
       int x = r.nextInt(50) + 1;
       Scanner sc = new Scanner(System.in);

       System.out.println("HIND :- the number boundry is 0-50");
       for (int a = 1; a <= 5; a++) {
           System.out.println("What do u think the number is ?? enter it");
           int user = sc.nextInt();
           if (user == x) {
               System.out.println("Yes..!! you r right the no. was " + x);
               System.out.println("Great work...!!");
           } else if (user > x) {
               System.out.println("the no is smaller");
           } else {
               System.out.println("the no. is greater");
           }

       }
       System.out.println("Sorry...!! You have no more attempts");
       System.out.println("the number was "+x);
       System.out.println("Better Luck next Time");
   }
    public static void main(String[] args) {
        for(int i=1;;){
            my();
        }
    }
}
