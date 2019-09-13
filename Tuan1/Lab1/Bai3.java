import java.util.Scanner;

public class Bai3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Chieu Dai Canh Lap Phuong : ");
        Double dai = scanner.nextDouble(); 
        Double theTich = Math.pow(dai,3);
        System.out.printf("The tich : %.1f",theTich);
    }
}