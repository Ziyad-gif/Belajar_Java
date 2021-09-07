package Belajar;

import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
        Scanner ziyad = new Scanner(System.in);
        System.out.print("masukan char");
        String grade = ziyad.nextLine();

        switch(grade){
            case "A":
            System.out.println("KAMU LULUS");
            break;
            case "B":
            System.out.println("anda belum lulus");
            break;
            default:
            System.out.println("sdas");


        }
    }
    
}
