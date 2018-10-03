import java.util.Scanner;

/**
 * 
 * @author danielhan
 *
 */
public class RectangleProject 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter the length of the rectangle: ");
		double length = in.nextDouble();
		in.nextLine();
		System.out.print("\nEnter the width of the rectangle: ");
		double width = in.nextDouble();
		in.nextLine();
		System.out.print("\nThe area of the rectangle is: ");
		System.out.printf("%10.2f", length * width);
		System.out.print("\nThe perimeter of the rectangle is: ");
		System.out.printf("%.2f", length * 2 + width * 2);
		System.out.print("\nThe diameter of the rectangle is: ");
		System.out.printf("%6.2f", Math.sqrt(length * length + width * width));
		
			
	}
}
