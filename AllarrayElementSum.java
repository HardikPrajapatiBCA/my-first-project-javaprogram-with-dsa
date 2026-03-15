
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class AllarrayElementSum {
    public static void main(String[] args) {
        int i,n,sum=0,last=0;
        System.out.println("Enter the array of size");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the array Elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("My array List");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("Find Array Element Sum");
        for(i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Total Sum of Array Elements:"+sum);
        
        
    }
}
