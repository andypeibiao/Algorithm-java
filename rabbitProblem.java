/*【程序1】
题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？ 
1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21.... 
*/
public class rabbitProblem{
	public static void main(String[] args){
		int month = 20;
		long bCount = 1L, Fcount = 1L;//basicCount & finalCount
		long f;//中间变量
		for(int i = 3; i < month; i++){
			f = Fcount;
			Fcount = bCount + Fcount;
			bCount = f;
			System.out.println("第"+i+"个月共有"+Fcount+"只兔子");
		}
	}
}