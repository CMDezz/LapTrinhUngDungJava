import java.util.Scanner;
import java.util.Arrays;

public class Bai4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien : ");
        int soLuong = scanner.nextInt();
        String[][] arr = new String[soLuong][2];
        for (int i = 0 ; i < soLuong ; i++){
            System.out.print("Nhap ten sinh vien  : ");
            String hoTen = scanner.next();
            System.out.print("Nhap diem sinh vien  : ");
            String diem = scanner.next();
            arr[i][0] = hoTen;
            arr[i][1]= diem;
            
        }
        sapXep(arr);
        for (int i = 0 ; i < soLuong ; i ++ ){ //show result
            Double Diem = Double.parseDouble(arr[i][1]);
            String hocLuc = ((Diem<5)?"Yeu":(Diem<6.5)?"Trung Binh":(Diem<7.5)?"Kha":(Diem<9)?"Gioi":"Xuat Xac");
            System.out.println("--- "+Arrays.toString(arr[i])+ " - Hoc Luc : "+hocLuc);
        }
    

    }
    public static void sapXep(String[][] arr){
        String[] temp = new String[2]; 
        for (int i = 0 ; i <arr.length-1;i++){
         Double min = Double.parseDouble(arr[i][1]);
         int iMin= i;
             for (int j = i+1; j <arr.length;j++){   //tim min
                 if(Double.parseDouble(arr[j][1])<min) {
                     min =Double.parseDouble(arr[j][1]);
                     iMin = j;
                 }
              }
              //chuyen 
              temp = arr[i] ;
              arr[i]  = arr[iMin];
              arr[iMin] = temp;
        }  
     }
   
}