package corejava.Programs;

import java.util.Scanner;

public class Fibbonacci {
public static void main(String[] args) {
    

    int n;

Scanner sc = new Scanner(System.in);
System.out.println("Enter a no : ");
n=sc.nextInt();


int first=0,second=1,next;

for(int i=0;i<=n;i++){

System.out.print(first+" ");
next=first+second;
first=second;
second=next;



}


}

}
