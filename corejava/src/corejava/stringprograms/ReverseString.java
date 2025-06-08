package corejava.stringprograms;

//import corejava.basic.dsa.reversestrings;

public class ReverseString {

    
public static StringBuilder reversestrings(StringBuilder str){
 
    String revstr = "";
    StringBuilder sb = new StringBuilder("");

    for(int i=str.length()-1;i>=0;i--){
sb = sb.append(str.charAt(i));

System.out.println(sb.hashCode());
    }

   System.out.println("Reverse String : "+str.reverse());
 
    return sb;

}

public static void main(String[] args) {
    StringBuilder str = new StringBuilder("karan");
    StringBuilder sbb = ReverseString.reversestrings(str);

    System.out.println(sbb);

    if(str.toString()==sbb.toString()){

        System.out.println("Palindrome");

    }
    else{
        System.out.println("Not Palindrome");
    }
}


}



