//simple program to search a number in an array
import java.util.Scanner;

public class leniers_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("the number of numbers");
        int n= sc.nextInt();
        int []a=new int[n];
        for (int i=0;i<a.length;i++){
            System.out.println("enter the value");
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number u wanna search");
        int x=sc.nextInt();
        for (int j=0;j<a.length;j++){
            if (a[j]==x){
                System.out.println("found the number "+x+" at index number "+j);
                break;
            }
        }
    }
}
