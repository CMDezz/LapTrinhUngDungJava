package mypack;
import java.util.Scanner;


public class Bai3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dien cua thang : ");
        Double soDien = scanner.nextDouble(); 
        if(soDien<0){
            System.out.printf("So lieu khong hop le");
        }else{
            int result = (int)((soDien<50)?(soDien*1000):(50*1000+(soDien-50)*1200));
            System.out.printf("Tien dien : %d ", result);
        }
    }
}