import java.util.Scanner;
public class AverageScores
{ 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a the students name: ");
		String name =sc.nextLine();
		System.out.print("Enter a the students Id: ");
		String id =sc.nextLine();
		System.out.print("Enter how many test scores: ");
		int number =  sc.nextInt();
		double total=0;
		for (int k=1; k<=number;k++)
		{
			System.out.print("Enter a test grade: ");
			double num = sc.nextDouble();
			total += num ;
		}
		double average = total / number;
		System.out.println( name + " " + id);
		System.out.println("The average is: "+ average);
		
		
	}
}