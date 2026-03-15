
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class FindAverageMarks {
    public static void main(String[] args) {
        int i,j,size1,size2;
        int average=0;
        System.out.println("Enter the size1");
        Scanner sc=new Scanner(System.in);
        size1=sc.nextInt();
        System.out.println("Enter the size2");
        size2=sc.nextInt();
        int arr[][]=new int[size1][size2];
        System.out.println("Enter the students Marks");
        for(i=0;i<size1;i++)
        {
            System.out.println("Enter marks for student"+(i+1));
            for(j=0;j<size2;j++)
            {System.out.println("Subject"+(j+1)+":");
               arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Students Marks Records");
        for(i=0;i<size1;i++)
        {
            for(j=0;j<size2;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
        }
        System.out.println("Find the each student AverageMarks");
        for(i=0;i<size1;i++)
        {
            int sum=0;
            for(j=0;j<size2;j++)
            {
            sum=sum+arr[i][j];
            }
            System.out.println("Marks for Student"+(i+1));
            System.out.println("Marks Sum="+sum);
            average=sum/size2;
            System.out.println("Average of Marks ="+average);
        }
    }
}
