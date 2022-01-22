package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n,m,p;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the element of array:");
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n-1];
        System.out.print("enter the value:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("enter the index of value yo be deleted:");
        m=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(i<m)
            {
                b[i]=a[i];
            }
            else if(i==m)
            {
                continue;
            }
            else
            {
                b[i-1]=a[i];
            }
        }
        System.out.print("element are:");
        {
            for(int i=0;i<n-1;i++)
            {
                System.out.println(b[i]);
            }
        }




	// write your code here
    }
}
