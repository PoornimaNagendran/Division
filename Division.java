import java.util.Scanner;
public class Division {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x;
		System.out.println("Enter dividend");
		int a=s.nextInt();
		System.out.println("Enter divisor");
		int b=s.nextInt();
		int count=-1;
		int r=0;
		while(r<a)
		{
			r=r+b;
			count++;
		}
		System.out.println("The quotient is");
System.out.println(count);
System.out.println("The remainder is");
x=a-(b*count);
System.out.println(x);
	}

}
