package day_11_indexOf;

import java.util.Scanner;

public class C06_endsWith {
    public static void main(String[] args) {
        //   Soru 1) Kullanicidan email adresini girmesini isteyin,
        //   mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        //   @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
        //   @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        String input = "emre@gmail.com";


        if(!input.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        }else if (input.endsWith("gmail.com")){
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontol edin yazdirin");
        }

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen email yaziniz");
        String email= scan.nextLine();

        if(!email.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        }else if (email.endsWith("gmail.com")){
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontol edin yazdirin");
        }
    }
}
