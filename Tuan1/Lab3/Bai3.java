import java.util.Scanner;
import java.util.Arrays;

public class Bai3{
    public static void main(String[] args) {
        double total = 0,index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Day so nguyen co dang : 1 2 3 10 11 66 33 ");
        System.out.print("Nhap day so nguyen : ");
        String num = scanner.nextLine();
        String[] a  = num.trim().split("[^0-9]+");    //trim() bo space 2 ben, split() bo? char not Number.
        int[] arr =new int[a.length]; //Create arr has length = a.length

       for (int i=0;i<a.length;i++){
            arr[i] = Integer.parseInt(a[i].trim()); // convert String a to Int arr,
            if(arr[i]%3==0){        // tinh trung binh cong
                total+=arr[i];
                index+=1;
            }
       }
       System.out.println(Arrays.toString(arr));
       Arrays.sort(arr);
       System.out.println("----- Sap xep : "+Arrays.toString(arr));
       System.out.println("----- Phan tu nho nhat : "+arr[0]);
       System.out.println("----- Trung binh cong phan tu chia het cho 3 : "+(total/index));       
    }
}