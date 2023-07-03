package Day05;

public class Ex01 {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);

		int money[]= {50000,10000,5000,1000,500,100,50,10};

		int a=sc.nextInt();

		for(int i=0;i<money.length;i++) {

			if(a%money[i]==0)break;

			else

			{

				System.out.println(money[i]+" : "+(a/money[i]));

				a=a-(a/money[i]*money[i]);

			}

		}

		System.out.println("잔돈 "+a);

	}



}
