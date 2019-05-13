package week1;

public class SumEvenNumbersBetween1And20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{

		    int sum = 0;
		    for(int i = 10; i <= 20; i++)
		    {
		        if(i%2 == 0)
		        {
		            sum = sum + i;

		        }
		    }
		        System.out.println("Sum : " + sum);     
		}   
		}
	}


