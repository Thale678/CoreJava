package corejava.Programs;

import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        

        
    int n;

Scanner sc = new Scanner(System.in);
System.out.println("Enter a no : ");
n=sc.nextInt();

int rev = 0;
int r;
while(n>0){
r=n%10;
rev=rev*10 + r;
n=n/10;


}
System.out.println("Reverse No : "+rev);

    }
}
