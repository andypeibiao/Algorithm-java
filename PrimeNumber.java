/*【程序2】 
题目：判断101-200之间有多少个素数，并输出所有素数。 
1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 
则表明此数不是素数，反之是素数。 */
public class PrimeNumber{
	public static void main(String args[]){
		int count=0;
		for(int i=101;i<201;i++){
			int j=2;
			boolean isPrimeNumber = false;
			while(j<i){
				if((i%j)==0){
					isPrimeNumber = true;
					count++;
				}
				j++;
			}
			i++;
		}
		System.out.println("素数总共有"+count+"个");
	}
}