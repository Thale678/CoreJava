package corejava.basic;

public class switchcasw {


	int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 8;
		
		//old switch case
		switch(n) {
		
		case 1 : System.out.println("Monday");
		break;
		case 2 : System.out.println("Tuesday");
		break;
		case 3 : System.out.println("Wednesday");
		break;
		case 4 : System.out.println("Thursday");
		break;
		case 5 : System.out.println("Friday");
		break;
		case 6 : System.out.println("Saturday");
		break;
		case 7  : System.out.println("Sunday");
		break;
		default : System.out.println("Invalid day no");
		break;
		}
		
		//New switch case directly assigning switch reuslt to variable
		
		String day = "Sunday";
		
		
		String result = switch(day) {
		
		case "Monday","Tuesday","Wednesday","Thursday","Friday" -> "Working day";
		case "Saturday","Sunday" -> "Weekoff";
		default ->"Invalid Day";  //intsetad of '->' ,we can use ' : yield' also)
		};
		System.out.println(result);
	}

}
