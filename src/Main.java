import java.util.Scanner;

/*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi
farklı çözüm yolları bulunuz.
 */
public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner yazici = new Scanner(System.in);
        System.out.print("Lutfen sicaklik degerini giriniz: ");
        sicaklik = yazici.nextInt();
        if (5 > sicaklik)
            System.out.println("Kayak yapabilirsiniz.");
        else if (sicaklik < 25) {
            if (sicaklik<15)
                System.out.println("Sinemaya Gidebilirsiniz");
            if (sicaklik>=10 && sicaklik<25)
                System.out.println("Piknige gidebilirsiniz.");

        }
        else
            System.out.println("Yuzmeye gidebilirsiniz.");

    }
}
