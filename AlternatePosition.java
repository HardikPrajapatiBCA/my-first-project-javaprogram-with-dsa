/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.*;
public class AlternatePosition {
    public static void main(String[] args) {
        int i,n;
        System.out.println("Enter the array of size");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the array Elements");
        for(i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.println("My Array list");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("Array in Alternate Position of Arraylist");
        for(i=0;i<n;i++)
        {
            System.out.println(i+"Position"+"->"+arr[i]+"\t");
            i+=1;
        }
    }
}
