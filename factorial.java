import java.util.*;
import java.util.Scanner;


class factorial
{
	public static void main(String arv[])
	{
	 Scanner scan = new Scanner(System.in);
	 int t =scan.nextInt();
	 while(t>0)
	 {
	 int n = scan.nextInt();
	 t--;
	 int count =0;
	 do
	 {
	 	n=n/5;
	 	count+=n;
	 }
	 while(n>0);
	 System.out.println(count);
	  }
	}
		 
}