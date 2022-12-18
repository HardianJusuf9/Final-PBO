package source;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pilihan;
        boolean ulang = true;

        do {
            System.out.println("Masukkan Pilihan : ");
            System.out.println("1. Menghitung luas persegi ");
            System.out.println("2. Menghitung luas lingkaran ");
            System.out.println("3. Menghitung keliling lingkaran ");
            System.out.println("4. Menghitung luas segitiga \n");
            System.out.print("Maskkan Pilihan anda: ");
            pilihan = in.next();

            if(pilihan.equals("1")){
                System.out.print("Masukkan panjang sisi: ");
                double sisi = in.nextDouble();

                Persegi persegi = new Persegi(sisi);

                String luas = "Luas = " + persegi.getSisi() + " * " + persegi.getSisi() + " = " + persegi.hitungLuas() + "\n";

                buatFile("persegi.txt");
                tulisFile("persegi.txt", luas);
                
                
            } else if(pilihan.equals("2")){
                System.out.print("Masukkan panjang jari-jari: ");
                double jari2 = in.nextDouble();

                Lingkaran myLingkaran = new Lingkaran(jari2);

                String luas = "Luas = " + myLingkaran.phi + " * " + myLingkaran.getJari2() + " * " + myLingkaran.getJari2() + " = " + myLingkaran.hitungLuas() + "\n";

                buatFile("lingkaran.txt");
                tulisFile("lingkaran.txt", luas); 

                    
            } else if(pilihan.equals("3")){
                System.out.print("Masukkan panjang jari-jari: ");
                double jari2 = in.nextDouble();
    
                Lingkaran myLingkaran = new Lingkaran(jari2);
    
                String keliling = "keliling = 2 * " + myLingkaran.phi + " * " + myLingkaran.getJari2() + " = " + myLingkaran.hitungKeliling() + "\n";
    
                buatFile("lingkaran.txt");
                tulisFile("lingkaran.txt", keliling);

                    
            } else if(pilihan.equals("4")){
                System.out.print("Masukkan panjang alas: ");
                double alas = in.nextDouble();
                System.out.print("Masukkan panjang tinggi: ");
                double tinggi = in.nextDouble();
    
                Segitiga mySegitiga = new Segitiga(alas, tinggi);
    
                String Luas = "Luas = (" + mySegitiga.getAlas() + " * " + mySegitiga.getTinggi() + ") / 2 = " + mySegitiga.hitungLuas() + "\n";
    
                buatFile("Segitiga.txt");
                tulisFile("Segitiga.txt", Luas);

            } else {
                System.out.println("Input anda tidak valid");
            }

            System.out.print("\nApakah anda ingin melanjutkan (ketik n jika tidak)? ");
            pilihan = in.next();

            if(pilihan.equals("n")) {
                break;
            }

            System.out.println();
            
        } while(ulang);

    }

    public static void buatFile(String namaFile) {

        try {
            File file = new File("D:/Final-PBO/histori_perhitungan/" + namaFile);
            if (file.createNewFile()) {
              System.out.println("Berhasil membuat file: " + file.getName());
            } else {
              System.out.println("File " + file.getName() + "sudah ada");
            }
        } catch (IOException e) {
            System.out.println("Terjadi error");
            e.printStackTrace();
        }

    }

    public static void tulisFile(String namaFile, String content) {

        try {
            FileWriter myWriter = new FileWriter("D:/Final-PBO/histori_perhitungan/" + namaFile, true);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Berhasil menyimpan data");
        } catch (IOException e) {
            System.out.println("Terjadi error.");
            e.printStackTrace();
        }

    }
    
}