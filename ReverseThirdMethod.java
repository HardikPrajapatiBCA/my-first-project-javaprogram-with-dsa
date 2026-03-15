
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class ReverseThirdMethod {
    public static void main(String[] args) {
         int i,size,temp,start=0;
        System.out.println("Enter the size of array");
       Scanner sc=new Scanner(System.in);
       size=sc.nextInt();
       int end=size-1;
        if(size<=5)
        {
         int arr[]=new int [size];
            System.out.println("Enter the Array Element");
            for(i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("My array list");
            for(i=0;i<size;i++)
            {
                System.out.print(arr[i]+"\t");
            }
            System.out.println("");
            System.out.println("Find Reverse of Array Element");
            while(start<end)
            {
              temp=arr[start];
              arr[start]=arr[end];
              arr[end]=temp;
              start++;
              end--;
            }
//            for(i=0;i<size;i++)
//            {
//                System.out.print(arr[i]+"\t");
//            }
               for(int j:arr)//For each Loop used
               {
                   System.out.print(j+"\t");
               }
            System.out.println("");
        }
        else
        {
            System.out.println("Enter the size of array Max size 5 only");
        }
    }
}
