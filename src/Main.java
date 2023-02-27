import java.util.Scanner;

public class Main {

    static int asal(int x,int y){

        if(y==1)
            return 1;

        if (x%y==0)
            return 0;

        return asal(x,y-1);
    }


    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi=input.nextInt();



        if(asal(sayi,sayi/2)==0)
            System.out.println(sayi+" sayısı asal değildir.");
        else
            System.out.println(sayi+" sayısı asaldır.");
    }
}