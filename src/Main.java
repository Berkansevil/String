
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;
import  java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
        System.out.println("dizeyi giriniz");
        String dize=scanner.nextLine();
        int uzunluk=dize.length();
        System.out.println("dizenin uzunluğu " + uzunluk);
        }
    }

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir dizi giriniz");
        String dize =scanner.nextLine();

        String BuyukHarf=dize.toUpperCase();
        String KucukHarf=dize.toLowerCase();
        System.out.println("Tamamen büyük harf : " + BuyukHarf);
        System.out.println("Tamamen küçük harf : " + KucukHarf);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir dize giriniz :");
        String dize =sc.nextLine();
        String sub= dize.substring(0,5);

        System.out.println("Girdiğiniz dizede ki alt dize :" +sub );
    }
}
public class Main  {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ilk dizenizi giriniz : ");
        Scanner scanner1=new Scanner(System.in);
        System.out.println("İkinci dizenizi giriniz");

        String dize1=scanner.nextLine();
        String dize2=scanner1.nextLine();
        if (dize1.equals(dize2)||dize1.equalsIgnoreCase(dize2)) {
            System.out.println("Girdiğiniz dizeler eşittir");
        } else {
            System.out.println("Girdiğiniz dizeler eşit değildir");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("İlk dizenizi giriniz : ");
        Scanner scanner1=new Scanner(System.in);
        System.out.println("İkinci dizenizi giriniz ");
        String dize1=scanner.nextLine();
        String dize2=scanner1.nextLine();

        String birleşmişDize=dize1.concat(dize2);
        System.out.println("Birleştirilmiş dize : " + birleşmişDize);

    }
}*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir dizi giriniz : ");
        String dize=scanner.nextLine();
        System.out.println("Ayırıcı karakteri girin ");
        char ayırıcı=scanner.next().charAt(0);
        String [] altDizeler=dize.split(String.valueOf(ayırıcı));
        System.out.println("Elde edilen alt dizeler ");
        for (String altDize : altDizeler){
            System.out.println(altDize);
        }

    }
}