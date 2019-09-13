import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Bai4{
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien : ");
        int size = scanner.nextInt();
        String[][] arr = new String[size][] ;
        for (int i = 0 ; i < size ; i ++){
            String temp = new String[1];
            System.out.print("Nhap Ten SV : ");
            String hoTen = scanner.nextLine();
            temp[0] = hoTen;
            System.out.print((temp));

            // arr[i] = hoTen;
            // System.out.print("Nhap diem SV : ");
            // String diem = scanner.nextLine();
            // arr[i][1] = diem;
           
        // System.out.print(Arrays.toString(arr));
        }
        
    }
}