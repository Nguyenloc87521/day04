import java.util.Scanner;
public class demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("số phần từ muốn nhập :");
        int[] arrayA = new int [n];
     for (int i=0; i<n; i++ ){
         System.out.println("Phần "+i+ "mảng là :");
         arrayA[i]= sc.nextInt();
     }
    int sum=0;
     for (int i:arrayA){

         System.out.println(i+"");

         sum +=1;
     }
        System.out.println("tổng "+sum);
        }
    }

