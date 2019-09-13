package mypack;
import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) {
        System.out.println("PTB1 : Ax + B= 0 ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap A : ");
        Double A = scanner.nextDouble(); 
        System.out.print("Nhap B : ");
        Double B = scanner.nextDouble(); 
        Ptb1( A,  B);
    }
    public static void Ptb1(Double A, Double B) {
        if(A == 0 ){
           String result = ((B==0)?"PT vo so nghiem":"PT vo  nghiem") ;
           System.out.printf(result);
        }
        else{
            Double X = -B/A;
            System.out.printf("Ket qua x =   %.1f",X);
        }    
    }
}