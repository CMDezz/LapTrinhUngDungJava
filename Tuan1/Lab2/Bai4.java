package mypack;
import java.util.Scanner;


public class Bai4{
    public static void main(String[] args) {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1.  Giai PTB1");
        System.out.println("2.  Giai PTB2");
        System.out.println("3.  Tinh tien dien");
        System.out.println("4.  Ket thuc");
        System.out.println("+---------------------------------------------------+");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input index  : ");
        int i = scanner.nextInt(); 
        
        switch (i) {
            case 1:
                Bai1 PTB1 = new Bai1();
                PTB1.main(null);
                break;
            case 2:
                Bai2 PTB2 = new Bai2();
                PTB2.main(null);
            break;
            case 3:
                Bai3 tinhTien = new Bai3();
                tinhTien.main(null);
            break;
            case 4:
                System.out.print("Chuong trinh ket thuc");
            break;
            default:
                System.out.print("Wrong index !");
                break;
        }
    }
}