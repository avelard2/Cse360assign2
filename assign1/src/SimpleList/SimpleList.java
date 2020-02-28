package SimpleList;
import java.util.*;
public class SimpleList {
	private int list[];
	private int count;
	public int len = 10;
	
	public SimpleList()
	{
		list = new int[len];
		count = 0;
	}
	public void add(int n)
	{
		if(count == len - 1)
		{
			len = len + len/2;
			int[] temp = new int[len];
			
			for(int i = 0; i < count; i++)
			{
				temp[i] = list[i];
			}
			list = temp;
		}
		
		for(int i = count; i >= 0; i--)
		{
			list[i + 1] = list[i];
		}
		count++;
		list[0] = n;
	}
	public void remove(int n)
	{
		int[] newList = new int[len];
		int place = search(n);
		for(int i = 0; i < place; i++)
		{
			newList[i] = list[i];
		}
		for(int i = place; i < count; i++)
		{
			newList[i] = list[i + 1];
		}
		list = newList;
		count--;
	
	}
	public String toString()
	{
		for(int i = 0; i < count; i++)
		{
			if(i < count - 1)
			{
				System.out.print(list[i] + " ");
				
			}
			if(i == count - 1)
			{
				System.out.print(list[i] + "\n");
			}
		}
		return " ";
	}
	public int search(int n)
	{
		for(int i = 0; i <= count; i++)
		{
			if(n == list[i])
			{
				return i;
			}
		}
		return -1;
	}
	public int first()
	{
		return list[0];
	}
	public int size()
	{
		return count;
	}
	public void append(int n)
	{
		if(count == len - 1)
		{
			len = len + len/2;
			int[] temp = new int[len];
			
			for(int i = 0; i < count; i++)
			{
				temp[i] = list[i];
			}
			list = temp;
		}
		count++;
		list[count - 1] = n;
		
	}
}
