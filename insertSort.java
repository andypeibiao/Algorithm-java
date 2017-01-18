//插入排序
public class insertSort{
	public static int a[] = {21,11,12,10,22,16,5,55,16,1,10};
	public static void main(String args[]){
		int temp = 0;
		for(int i=1;i<a.length;i++){
			int j = i-1;
			temp = a[i];
			for(;j>=0&&temp<a[j];j--){
				a[j+1] = a[j];
				print("第"+i+"次排序");
			}
			a[j+1] = temp;
			print("第"+i+"次排序");
		}
		print("最终结果");
	}
	public static void print(String str){
		for(int i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
		System.out.println(str);
	}
}