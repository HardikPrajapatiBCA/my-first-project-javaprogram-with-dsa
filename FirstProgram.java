
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class FirstProgram {
    //Reverse an Array 
    public static void main(String[] args) {
        int i,size;
        System.out.println("Enter the array of size");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array of elements");
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
        System.out.println("Reverse an Array");
        for(i=size-1;i>=0;i--)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
