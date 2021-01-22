package Sorting_Algorithm;

import java.util.Arrays;

//选择排序算法_精简版
public class Select_Sorting_Brief {

	public static void main(String[] args) {

		// 定义一个数组。
		int[] a = new int[] { 18, 62, 68, 82, 65, 9 };
		// 输出原始数组。
		System.out.print("原始数组排序为:");
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
		}
		//外循环一共五趟，可得到最终结果。
		for(int i=0;i<a.length-1;i++)//i=0,1,2,3,4。
		{
			for(int j=i+1;j<a.length;j++)//j=1,2,3,4,5。j为被比较的对象，因此不可能为第一个数，故j最小唯一。
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println();
			System.out.print("第" + (i+1)+"趟排序结果:" + Arrays.toString(a));
		}

	}

}
