import java.util.Scanner;

class Sorted{
    int temp=0;
    int b;
    int key;
    int low=0;
    public void BubbleSort(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Elements");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements Before Sorting");
        for (int a=0;a<arr.length;a++){
            System.out.println(arr[a] + "");
        }


        int len=arr.length;
        System.out.println("Elements After Sorting");
        for (int j=0;j<len;j++)
        {
            for (int k=0;k<len-j-1;k++)
            {
                if (arr[k]>arr[k+1])
                {
                    temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        for (int b:arr){
            System.out.println(b);
        }

        System.out.println("Enter Searching Number");
        key= sc.nextInt();
        int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==key){
                System.out.println("Element Found At Index " + "" + mid);
                break;
            }
            else if (key>arr[mid]) {
                low=mid+1;
            }
            else
                high=mid-1;
        }
    }


}


public class ArraySorted {
    public static void main(String[] args) {
        Sorted s = new Sorted();
        s.BubbleSort();
    }
}
