package japractice;

public class Gender {

	public static void main(String[] args) {
		String gender= "male";
	
		
		int age=14;
		
		if(age>=18&&gender=="male")
		{
			System.out.println("valid for driving licence");
		}
		
		else if(age>=25 && gender=="female")
		
			
		{
			System.out.println("valid for driving liscence");
			
		}
		else
		{
			System.out.println("invalid");
		}
	}

}
