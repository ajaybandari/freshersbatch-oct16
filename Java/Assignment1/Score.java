import java.util.*;
public class Score {
	public static void marks_Calculator(int[]marks, int num) {
		int i=0;
		int j=1;
		if(marks[i]>60&&marks[j]>60) 
		{
			if(marks[j]>60&&marks[j+1]>60) 
			{
				System.out.println("Passed");
			}
			else 
			{
				System.out.println("Promoted");
			}
		}
		else {
				System.out.println("Failed");
			}
			
	}

	public static void main(String[] args) {
		int num = 3;
		int[]marks;
		marks=new int[num];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the subject marks");
		for(int i=0;i<num;i++) {
			marks[i]=sc.nextInt();
		}
		System.out.println("The subject marks are:");
		for(int i=0;i<num;i++) {
			System.out.println(""+marks[i]);
		}
		marks_Calculator(marks, num);

	}

}
