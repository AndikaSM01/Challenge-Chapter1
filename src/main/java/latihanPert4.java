package main.java;
import java.util.Scanner;
public class latihanPert4 {
    public static void main(String[] args) {
        System.out.println("====== latihan no 1 =======");
        int[]angka={100,20,15,30,5,75,40};
         BubbleShort(angka);
         for (int i =0; i< angka.length;i++){
             System.out.print(angka[i]+" ");
         }

    }
static void BubbleShort(int[]angka){
        for(int i =0;i< angka.length;i++){
            for (int j=0;j< angka.length-1;j++){
                if(angka[j]>angka[j+1]){
                    int susun=angka[j];
                    angka[j]=angka[j+1];
                    angka[j+1]= susun;

                }
            }
        }
    }
}


class FizzBuzz{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Inputkan Bilangan ");
        int angka = input.nextInt();
        for (int i = 1; i < angka; i ++){
            if (i % 3 ==0 && i % 5 == 0){
                System.out.print(" FizzBuzz ");
            } else if ( i % 3 ==0 ) {
                System.out.print(" Fizz ");
            } else if (i % 5 ==0) {
                System.out.print(" Buzz ");
            } else{
                System.out.print( i+" " );
            }
        }
        input.close();
    }
}
