package Sorting_Algorithm;

import java.util.Arrays;

//ѡ�������㷨_��ȫ��
public class Select_Sorting_Complete {

	public static void main(String[] args) {
		
		//����һ�����顣
		int [] a = new int[] {18,62,68,82,65,9};
		//���ԭʼ���顣
		System.out.print("ԭʼ��������Ϊ:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		//�Ե�һ����Ϊ��㣬��ʼ��֮��������αȽϡ�
		//����iΪʲô��1��ʼ��for�е�����Ϊ���Ƚ϶��󣬱��Ƚϣ����Ƚϡ�
		//��Ϊ����һ�����õ�һ������ȥ��֮����������ֽ��бȽϡ�
		//�����i���������±꣬��ζ��������ڶ���Ԫ��ֱ��������Ԫ�رȽϡ�
		for(int i=1;i<a.length;i++)//i=1,2,3,4,5��
		{
			if(a[0]>a[i])//�����һ��������֮���ĳһ��������ô�򽻻����ߵ�λ�á�
			{
				int temp = a[0];
				a[0] = a[i];
				a[i] = temp;
			}
		}
		System.out.println();
		System.out.print("��һ��������:" + Arrays.toString(a));//9����������ǰ�档
		
		//�Եڶ�����Ϊ��㣬��ʼ��֮��������αȽϡ�
		for(int i=2;i<a.length;i++) //i=2,3,4,5��
		{
			if(a[1]>a[i])
			{
				int temp = a[1];
				a[1] = a[i];
				a[i] = temp;
			}
		}
		System.out.println();
		System.out.print("�ڶ���������:" + Arrays.toString(a));
		
		//�Ե�������Ϊ��㣬��ʼ��֮��������αȽϡ�
		for(int i=3;i<a.length;i++)//i=3,4,5��
		{
			if(a[2]>a[i])
			{
				int temp = a[2];
				a[2] = a[i];
				a[i] = temp;
			}
		}
		System.out.println();
		System.out.print("������������:" + Arrays.toString(a));
		
		//�Ե��ĸ���Ϊ��㣬��ʼ��֮��������αȽϡ�
		for(int i=4;i<a.length;i++)//i=4,5��
		{
			if(a[3]>a[i])
			{
				int temp = a[3];
				a[3] = a[i];
				a[i] = temp;
			}
		}
		System.out.println();
		System.out.print("������������:" + Arrays.toString(a));
		
		//�Ե������Ϊ��㣬��ʼ��֮��������αȽϡ�
		for(int i=5;i<a.length;i++)//i=5��
		{
			if(a[4]>a[i])
			{
				int temp = a[4];
				a[4] = a[i];
				a[i] = temp;
			}
		}
		System.out.println();
		System.out.print("������������:" + Arrays.toString(a));
		
	}

}
