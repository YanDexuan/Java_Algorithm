package Sorting_Algorithm;

import java.util.Arrays;

//ѡ�������㷨_�����
public class Select_Sorting_Brief {

	public static void main(String[] args) {

		// ����һ�����顣
		int[] a = new int[] { 18, 62, 68, 82, 65, 9 };
		// ���ԭʼ���顣
		System.out.print("ԭʼ��������Ϊ:");
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
		}
		//��ѭ��һ�����ˣ��ɵõ����ս����
		for(int i=0;i<a.length-1;i++)//i=0,1,2,3,4��
		{
			for(int j=i+1;j<a.length;j++)//j=1,2,3,4,5��jΪ���ȽϵĶ�����˲�����Ϊ��һ��������j��СΨһ��
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println();
			System.out.print("��" + (i+1)+"��������:" + Arrays.toString(a));
		}

	}

}
