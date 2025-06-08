package corejava.Programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
         
int n;

try(Scanner sc = new Scanner(System.in)){
System.out.println("Enter a no : ");
n=sc.nextInt();

if(n%2==0){
    System.out.print("Even");
}else{
    System.out.print("Odd");
}
}
catch(InputMismatchException e){
 System.out.println("Caught InputMismatchException");
    System.out.println(e);
}
catch(Exception e){
 System.out.println("Caught Exception");
    System.out.println(e);
}

    }
    
}
