package corejava.basic;

public class datatypes {

	int i  = 12;
	float f = 12.5f;
	double d = 12.5;
	byte by = 127;
	short sh = 2345;
	long l = 24l;
	String c = "c";
	char k = 'k';
	boolean b = true;

public static void main(String[] args) {
String s1="1236";

	String s2 = new String("hi");
	StringBuffer sb = new StringBuffer("");
	StringBuffer sb2 = new StringBuffer("");

System.out.println("S1 hashcode : "+s1.hashCode()+"\n S2 Hashcode : "+s2.hashCode());
System.out.println("Sb hashcode : "+sb.hashCode()+"\n Sb2 Hashcode : "+sb2.hashCode());



 
	System.out.println("String : "+s1+" : "+s2+" : "+sb);	
}

	
	
	
}
