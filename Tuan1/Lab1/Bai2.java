import java.util.Scanner;

public class Bai2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Chieu Dai HCN : ");
        Double dai = scanner.nextDouble(); 
        System.out.print("Nhap Chieu Rong HCN : ");
        Double rong = scanner.nextDouble(); 
        Double chuVi = tinhChuVi(dai,rong);
        Double dienTich = tinhDienTich(dai,rong);
        System.out.printf("Chu vi : %.1f - Dien tich : %.1f",chuVi,dienTich);

    }
    public static Double tinhChuVi(Double dai,Double rong){
        return (dai+rong)*2;
    }
    public static Double tinhDienTich(Double dai,Double rong){
        return (dai*rong);
    }
}