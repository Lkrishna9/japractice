package japractice;

public class Whileevensumoddsum {

	public static void main(String[] args) 
	{
	int evensum,oddsum;
	int num=1;
	
	while(num<=20)
	{
		evensum=0;
		oddsum=0;
		if(num%2==0)
		{
			evensum=evensum+num;
			
		}else {
			oddsum=oddsum+num;
		}
		num++;
		System.out.println(evensum);
		System.out.println(oddsum);
	}

	}

}
