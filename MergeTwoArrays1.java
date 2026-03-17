/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.*;
public class MergeTwoArrays1 {
    public static void main(String[] args) {
        int i,j,n,m,p;
        System.out.println("Enter the array size");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the Second array size");
        m=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int [m];
        p=n+m;
        System.out.println("p="+p);
        int arr2[]=new int[p];
        System.out.println("Enter the First Array elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Second Array elements");
        for(j=0;j<m;j++)
        {
            arr1[j]=sc.nextInt();
        }
        System.out.println("My first Array list");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("My Second Array list");
        for(j=0;j<m;j++)
        {
            System.out.print(arr1[j]+"\t");
        }
        System.out.println();
        System.out.println("Merage Two Arrays");
        for(i=0;i<n;i++)
        {
            arr2[i]=arr[i];
        }
        for(j=0;j<m;j++)
        {
            arr2[i+j]=arr1[j];
        }
        for(int k=0;k<p;k++)
        {
            System.out.print(arr2[k]+"\t");
        }
    }
}
