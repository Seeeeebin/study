import java.util.Scanner;
class random 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*100)+1;
		
		while (true)
		{
			System.out.println("숫자를 입력하세요 :");
			int b = sc.nextInt();
			if (a>b){
				System.out.println("up");
			}else if(a<b){
				System.out.println("down");
			}else{
				System.out.println("정답!");
				break;
			}
		}
		
	}
}

