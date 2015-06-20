import java.util.Scanner;
class random2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1;

		while(true)
		{
			System.out.println("숫자를 입력하세요 :");
			int ran = sc.nextInt();
			if (ran>num){
				System.out.println("down");
			}else if(ran<num){
				System.out.println("up");
			}else{
				System.out.println("정답!");
				break;
			}
		}
	}
}
