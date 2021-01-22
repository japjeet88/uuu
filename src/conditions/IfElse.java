package conditions;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade = 'A';
		int marks = 99;
		if (marks >= 90 && marks <= 100)
		{
			grade = 'A';
		}
		
		else if (marks >= 80 && marks < 90) {
			
			grade = 'B' ;
		} else {
			
			grade = 'F' ;
		}
System.out.println("Grade is = " + grade);
		
		
	}

}
