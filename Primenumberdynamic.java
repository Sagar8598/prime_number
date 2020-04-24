import java.util.Scanner;
public class Primenumberdynamic
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		primenumber p=new primenumber();
		System.out.print("Enter the number : ");
		int num3=scanner.nextInt();
		primenumber.Mynumber num1=p.new Mynumber(num3);
		boolean isprime=num1.isprime();
		System.out.println("isprime"+" "+isprime);
	}
public class Mynumber
	{
		private int num;
		public Mynumber(int num)
		{
			this.num=num;
		}
		public boolean isprime()
		{
			if(num<2)
			{
				return false;
			}
			for(int i=2;i<num-1;i++)
			{
				if (num%i==0)
				{
					return false;
				}
			}
			return true;
		}
	}
}