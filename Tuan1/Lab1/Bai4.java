import java.util.Scanner;

public class Bai4{
    public static void main(String[] args) {
        System.out.println("PTB2 : Ax^2 + Bx + C = 0 ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap A : ");
        Double a = scanner.nextDouble(); 
        System.out.print("Nhap B: ");
        Double b = scanner.nextDouble(); 
        System.out.print("Nhap C: ");
        Double c = scanner.nextDouble(); 
        Double delta = Math.pow(b,2)-4*a*c;
        Double sqrtDelta = Math.sqrt(delta);
        if (delta<0) {System.out.printf("Delta : %.1f ",delta);}
        else{
             System.out.printf("Delta : %.1f - Sqrt Delta : %.1f",delta,sqrtDelta);
        }

    }

}