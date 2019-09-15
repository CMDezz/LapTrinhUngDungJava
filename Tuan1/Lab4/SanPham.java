import java.util.Scanner;

public class SanPham{
    public String tenSanPham;
    public Double donGia;
    public Double giamGia;
    Scanner scanner = new Scanner(System.in);

    public sanPham(String tenSanPham, double donGia, double giamGia) {
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
    public  void nhap(){
        System.out.print("Nhap ten San Pham : ");
        this.tenSanPham = scanner.next();
        System.out.print("Nhap Don Gia : ");
        this.donGia = scanner.nextDouble();
        System.out.print("Nhap Giam Gia : ");
        this.giamGia = scanner.nextDouble();
    }

    public  void xuat(){
        System.out.println("Ten San Pham : " + this.tenSanPham);
        System.out.println("Don Gia: " + this.donGia);
        System.out.println("Giam Gia : " + this.giamGia);
        System.out.println("Thue Nhap Khau : " + this.getThueNhapKhau(this.donGia));
    }
  

    public  double getThueNhapKhau(double donGia){
        return (10*donGia)/100;
    }

}