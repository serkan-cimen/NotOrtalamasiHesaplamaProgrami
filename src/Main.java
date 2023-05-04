import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur.
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;

        // Scanner sınıfımızı tanımladık.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al.
        System.out.print("Matematik Notunuz : ");
        Matematik = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        Fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        Kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        Turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        Tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        Muzik = inp.nextInt();
        int toplam = (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : "+ sonuc);
        int ortalama = (int) sonuc; //Ortalama notu tam sayıya dönüştür.
        System.out.println(ortalama >= 60? "Geçtiniz" : "Kaldınız");
    }
}