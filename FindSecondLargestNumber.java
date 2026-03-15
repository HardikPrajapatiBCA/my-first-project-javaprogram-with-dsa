/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.Scanner;
public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int i,size,largest=0,secondlargest=0;
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the array Element");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("My Array List");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");
        System.out.println("Find the Largest Number");
        for(i=0;i<size;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("Largest Number in Array="+largest);
        System.out.println("Find the Second largest");
        for(i=0;i<size;i++)
        {
            if(arr[i]>secondlargest && arr[i]!=largest)
            {
             secondlargest=arr[i];
            }
        }
        System.out.println("SecondLargest in Array="+secondlargest);
    }
}