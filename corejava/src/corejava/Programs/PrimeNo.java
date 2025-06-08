package corejava.Programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNo {


    public static void main(String[] args) {
        int n;

        try(Scanner sc = new Scanner(System.in)){
System.out.println("Enter a no : ");
n=sc.nextInt();

int flag1 = 0;

for(int i=2;i<=n/2;i++){

if(n%i==0){
    System.out.println("Not a Prime no");
flag1 = 0;
    break;
}
flag1 = 1;
}
System.out.println(flag1);

if(flag1==1){
    System.out.println("Prime No");
}else{
    System.out.println("Not a Prime No");
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
