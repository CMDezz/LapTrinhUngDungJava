package mypack;
import java.util.Scanner;


public class Bai2{
    public static void main(String[] args) {
        System.out.println("PTB1 : Ax^2 + Bx + C= 0 ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap A : ");
        Double A = scanner.nextDouble(); 
        System.out.print("Nhap B : ");
        Double B = scanner.nextDouble(); 
        System.out.print("Nhap C : ");
        Double C = scanner.nextDouble();
        Ptb2(A,B,C);
        
 
    }
    public static void Ptb2(Double A, Double B, Double C) {  
        Double x ,x1,x2; 
        if(A==0){
            Bai1 PTB1 = new Bai1();
            PTB1.Ptb1(B,C);
        }else{
            Double delta = Math.pow(B,2)-4*A*C;
            Double sqrtDelta = Math.sqrt(delta);
            if(delta < 0 ){
                System.out.print("PT vo nghiem");
            } else if(delta == 0 ){
                x = -B/(2*A);
                System.out.printf("PT co nghiem kep x = %.1f",x);
            } else{
                x1 = (-B+sqrtDelta)/(2*A);
                x2 = (-B-sqrtDelta)/(2*A);
                System.out.printf("PT co nghiem  x1 = %.1f  &&  x2 = %.1f",x1,x2);
            }
        }
    }
}

