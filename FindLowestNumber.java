/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.Scanner;
public class FindLowestNumber { 
    public static void main(String[] args) {
        // find lowestnumber without other values used and function used
         int i,size,min;
        System.out.println("Enter the size in Array");
        Scanner sc=new Scanner (System.in);
        size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the Array elements");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("My Array list");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");
        System.out.println("Find the lowestNumber in an Array");
                min=arr[0];
        for( i=1;i<size;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Lowest Number="+min);
    } 
    }
 

