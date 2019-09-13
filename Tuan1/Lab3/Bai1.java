import java.util.Scanner;


public class Bai1{
    public static void main(String[] args) {
        try{
            System.out.println("------------------Kiem tra so nguyen to------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap n : ");
            int n = scanner.nextInt();
            boolean flag = checkN(n);       // falg = true || flag = false
            String result=((flag==true)?"So nguyen to!":"Khong phai so nguyen to!");    // short if else
            System.out.println(result);
            }
        catch(Exception e){
            System.out.print("Opps! Sai cu phap");
        }
    }
    
    public static boolean checkN(int n) {
        
        for(int i = 2 ; i <= n/2 ; i ++ ){
            if (n%i == 0 ){
                return false;  //if chia het return false
            }
        }
        return true;         //if k chia het, return true;
    }
}