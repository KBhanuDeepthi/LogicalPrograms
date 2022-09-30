
import java.util.Scanner;
class StopWatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double start,end;
		double tim;
		System.out.println("Type any character to start the watch :");
	    char s=sc.next().charAt(0);
		start=System.currentTimeMillis();
		System.out.println("Type any character to stop:");
		char m=sc.next().charAt(0);
		end=System.currentTimeMillis();
		tim=(end-start)/1000.0;
		System.out.println(tim);

	}

}
