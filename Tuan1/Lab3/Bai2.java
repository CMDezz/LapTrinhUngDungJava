public class Bai2{
    public static void main(String[] args) {
        System.out.print("----------Bang cuu chuong----------\n");
        display2();
    }
    public static void display2() { // 2 loop
        for (int j = 2 ; j <10 ; j ++){
            for (int i = 1 ; i <= 10 ; i ++){
                System.out.printf("%d x %d = %d \n",j,i,j*i);
            }
            System.out.println("-------------------- ");
        }  
    }
    // public static void display() { // 1 loop
    //     int n = 2;
    //     for (int i = 1 ; i <= 10 ; i ++){
    //         if(n==10){ //2-9, 10 break;
    //             break;
    //         }
    //         System.out.printf("%d x %d = %d \n",n,i,n*i);
    //         if (i==10){ // reset var
    //             System.out.print("-------------------- \n");
    //             i = 0;
    //             n=n+1;
    //             continue;
    //         }
    //     }
    
    // }

}