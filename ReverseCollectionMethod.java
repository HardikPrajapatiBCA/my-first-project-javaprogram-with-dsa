
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class ReverseCollectionMethod {
    public static void main(String[] args) {
         int i,size,temp;
        System.out.println("Enter the size of array");
       Scanner sc=new Scanner(System.in);
       size=sc.nextInt();
        if(size<=5)
        {
         Integer arr[]=new Integer [size];
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
            
            List<Integer> list=Arrays.asList(arr);
            Collections.reverse(list);
            System.out.println(list);
        }
        else
        {
            System.out.println("Enter the size of array Max size 5 only");
        }
    }
}
