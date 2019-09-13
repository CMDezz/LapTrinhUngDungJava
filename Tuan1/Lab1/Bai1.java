import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Full Name : ");
        String hoTen = scanner.nextLine();
        System.out.print("Score : ");
        Double diemTB = scanner.nextDouble();
        System.out.printf("Name : %s -  Score : %.1f",hoTen,diemTB);
    }
}