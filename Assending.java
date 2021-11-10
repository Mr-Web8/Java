/* This code arranges the entered number in assending order*/
import java.util.Arrays;//array class imported 

import java.util.Scanner;//Scanner class imported 

public class Assending{
    public static void main(String[] args) {//main method
        Scanner sc=new Scanner(System.in);//scanner class object creation
        System.out.println("Enter the number of Values you would use:- ");
        int n= sc.nextInt();
        int []a=new int[n];
        for (int i=0;i<a.length;i++){
            System.out.println("Enter the value");
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);//to sort the array 
        System.out.println(" the assending value is :- ");//printing the arryay in assending order
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
