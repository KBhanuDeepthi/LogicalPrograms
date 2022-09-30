class FibonacciSeries {

	public static void main(String[] args) {
		int input1=0;
		int input2=1;
		int input3;
		int i;
		int count=10;
		System.out.print(+input1+" " +input2);
		for(i=2;i<count;i++) 
		{
			input3=input1+input2;
			System.out.print(" " +input3);
			input1=input2;
			input2=input3;
		}

	}

}
