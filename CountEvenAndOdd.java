/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.*;
public class CountEvenAndOdd {
    public static void main(String[] args) {
        int j,i,n,count=0,count1=0;
        String evenNumber="",oddNumber="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array of Size");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array of Elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("My array list ");
        {
            for(i=0;i<n;i++)
            {
                System.out.print(arr[i]+"\t");
            }
            System.out.println();
        }
        System.out.println("Find the  arraylist");
        for(i=0;i<n;i++)
        {
            int reapt=0;
            while(i<n-1 && arr[i]==arr[i+1])
            {
            reapt++;
            i++;
            }
            if(arr[i]%2==0)
            {
                count+=reapt+1;
            System.out.println("Even Reapt of number::"+arr[i]+"->"+reapt+"TimesReapts");
            for(j=0;j<=reapt;j++)
            {
                evenNumber+=arr[i]+" ";
            }
            }
            else
            {
                count1+=reapt+1;
            System.out.println("Odd Reapt of number::"+arr[i]+"->"+reapt+"TimesReapts");
            for(j=0;j<=reapt;j++)
            {
                oddNumber+=arr[i]+" ";
            }
            }
        }
        System.out.println();
        System.out.println("Number of Even in array::"+count+"->"+evenNumber);
        System.out.println("Number of Odd in array::"+count1+"->"+oddNumber);
    }
}
