package Sorting_Algorithm;

import java.util.Arrays;

//选择排序算法_完全版
public class Select_Sorting_Complete {

	public static void main(String[] args) {
		
		//定义一个数组。
		int [] a = new int[] {18,62,68,82,65,9};
		//输出原始数组。
		System.out.print("原始数组排序为:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		//以第一个数为起点，开始与之后的数依次比较。
		//这里i为什么从1开始？for中的数字为被比较对象，被比较，被比较。
		//因为，这一轮是用第一个数字去与之后的所有数字进行比较。
		//这里的i代表数组下标，意味着依次与第二个元素直至第六个元素比较。
		for(int i=1;i<a.length;i++)//i=1,2,3,4,5。
		{
			if(a[0]>a[i])//如果第一个数大于之后的某一个数，那么则交换两者的位置。
			{
				int temp = a[0];
				a[0] = a[i];
				a[i] = temp;
			}
		}
		System.out.println();
		System.out.print("第一趟排序结果:" + Arrays.toString(a));//9被换到了最前面。
		
		//以第二个数为起点，开始与之后的数依次比较。
		for(int i=2;i<a.length;i++) //i=2,3,4,5。
		{
			if(a[1]>a[i])
			{
				int temp = a[1];
				a[1] = a[i];
				a[i] = temp;
			}
		}
		System.out.println();
		System.out.print("第二趟排序结果:" + Arrays.toString(a));
		
		//以第三个数为起点，开始与之后的数依次比较。
		for(int i=3;i<a.length;i++)//i=3,4,5。
		{
			if(a[2]>a[i])
			{
				int temp = a[2];
				a[2] = a[i];
				a[i] = temp;
			}
		}
		System.out.println();
		System.out.print("第三趟排序结果:" + Arrays.toString(a));
		
		//以第四个数为起点，开始与之后的数依次比较。
		for(int i=4;i<a.length;i++)//i=4,5。
		{
			if(a[3]>a[i])
			{
				int temp = a[3];
				a[3] = a[i];
				a[i] = temp;
			}
		}
		System.out.println();
		System.out.print("第四趟排序结果:" + Arrays.toString(a));
		
		//以第五个数为起点，开始与之后的数依次比较。
		for(int i=5;i<a.length;i++)//i=5。
		{
			if(a[4]>a[i])
			{
				int temp = a[4];
				a[4] = a[i];
				a[i] = temp;
			}
		}
		System.out.println();
		System.out.print("第五趟排序结果:" + Arrays.toString(a));
		
	}

}
