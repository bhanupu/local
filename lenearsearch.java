import java.util.*;
public class lenearsearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        int l=0,h=arr.length-1,mid=(l+h)/2;
        int x=9;
        for (int i=0;i<arr.length;i++){
            if (arr[mid]==x){
                System.out.println("found at"+ mid);
            }
            if (x>arr[mid]){
                l=mid+1;
            }
            if (x<arr[mid]){
                h=mid-1;
            }
            }
        }
    }