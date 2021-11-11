import java.util.Scanner;//scanner class being imported
public class Text_To_Ascii {
    public static void main(String[] args) {//main method
        Scanner sc=new Scanner(System.in);
        System.out.println("**********************************************");//not so important line
        System.out.println("**********************************************");//not so important line
        System.out.println("Input the plain text:-");
        int z=0;//initalizing and declaring interger value
        String a=sc.nextLine();//for entering (using keyboard as input)
        System.out.println("**********************************************");//not so important line
        System.out.println("**********************************************");//not so important line
        System.out.println("The ASCII value is :- ");
        for (int i=0;i<a.length();i++){//for loop to get each character of the string
            z=a.charAt(i);//the char data type is being coverted to interger (type conversion/implicit conversion)
            System.out.print(z+" ");//for printing the value
           }
    }
}
