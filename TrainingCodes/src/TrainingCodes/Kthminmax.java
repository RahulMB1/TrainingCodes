package TrainingCodes;
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Kthminmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n,k,i;
		while(t-->0)
		{
			n = sc.nextInt();
			int[] arr = new int[n];
			for(i=0;i<n;i++)
				arr[i] = sc.nextInt();
			k=sc.nextInt();
			PriorityQueue<Integer> queue = new PriorityQueue<>();
			for(i=0;i<n;i++) {
				queue.add(arr[i]);
				if(queue.size()>k) 
					queue.poll();
			}
		System.out.println(queue.peek());
		}
	}

}
