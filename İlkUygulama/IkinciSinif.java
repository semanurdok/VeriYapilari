package YeniPkg;

import java.util.Scanner;

public class IkinciSinif {
    private int dogumyili;
    private String dogumyeri;
    private String yasadigiyer;


    public IkinciSinif() {

    }

    public IkinciSinif(int dogumyili, String dogumyeri, String yasadigiyer) {
        this.dogumyili = dogumyili;
        this.dogumyeri = dogumyeri;
        this.yasadigiyer = yasadigiyer;
    }


    public int getdogumyili() {
        return dogumyili;
    }
    public void setdogumyili(int dogumyili) {
        this.dogumyili = dogumyili;
    }

    public String getdogumyeri() {
        return dogumyeri;
    }
    public void setdogumyeri(String dogumyeri) {
        this.dogumyeri = dogumyeri;
    }

    public String getyasadigiyer() {
        return yasadigiyer;
    }
    public void setyasadigiyer(String yasadigiyer) {
        this.yasadigiyer = yasadigiyer;
    }

    public void IkinciSinifDegerYazdir() {
        System.out.println("Doğum Yılı: " + getdogumyili());
        System.out.println("Doğum Yeri: " + getdogumyeri());
        System.out.println("Yaşadığı Yer: " + getyasadigiyer());
    }

    public void IkinciSinifDegerAta(int dogumyili, String dogumyeri, String yasadigiyer) {
        this.setdogumyili(dogumyili);
        this.setdogumyeri(dogumyeri);
        this.setyasadigiyer(yasadigiyer);
    }

    public static void main(String[] args) {
 
        IkinciSinif[] sinifDizisi = new IkinciSinif[10];
        

        for (int i = 0; i < sinifDizisi.length; i++) {
            sinifDizisi[i] = new IkinciSinif(); 
        }
        

        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < sinifDizisi.length; i++) {
            System.out.println((i + 1) + ". nesne için değerler giriniz:");

            System.out.print("Doğum Yılı: ");
            int dogumyili = scanner.nextInt();
            
            System.out.print("Doğum Yeri: ");
            String dogumyeri = scanner.next();
            
            System.out.print("Yaşadığı Yer: ");
            String yasadigiyer = scanner.next();

            sinifDizisi[i].IkinciSinifDegerAta(dogumyili, dogumyeri, yasadigiyer);
        }
        
     
        System.out.println("\nGirilen değerler ekrana yazdırılıyor:");
        for (int i = 0; i < sinifDizisi.length; i++) {
            System.out.println("\n" + (i + 1) + ". nesnenin özellikleri:");
            sinifDizisi[i].IkinciSinifDegerYazdir();
        }
    }
}