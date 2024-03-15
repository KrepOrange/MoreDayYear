import java.util.Scanner;

public class MoreDayYear {
    public static void main(String[] args) {
        //variables
        int year;
        boolean isMoreDayYear = false;
        Scanner input = new Scanner(System.in);
        /*
         * Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl.
         * Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına
         * 29 Şubat’ın eklenmesi ile elde edilir.
         */

        System.out.print("Artık yıl olup olmadığını öğrenmek istediğiniz yılı giriniz: ");
        year = input.nextInt();

        if (year % 400 == 0)
            isMoreDayYear = true;
        else if(year % 4 == 0 && year % 100 != 0)
            isMoreDayYear = true;

        if (isMoreDayYear)
            System.out.println(year + " bir artık yıldır!");
        else
            System.out.println(year + " bir artık yıl değildir!");
    }
}
