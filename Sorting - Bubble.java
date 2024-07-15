package array;
import java.util.*;
public class sortingwithoutfun {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Size ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int temp=0;

                if(arr[j]<arr[i])
                {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
        }
    }
    System.out.println("Sorted Array is : ");
for(int i=0;i<arr.length;i++)
{
    System.out.println(arr[i]+" ");
}
}


}
