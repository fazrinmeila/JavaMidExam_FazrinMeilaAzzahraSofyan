package data;

import java.util.Scanner;

public class LaptopApp {
    
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);  
        String Nama, Brand, Prosesor, Os, Storage;
        int Stok,Core, Ram;
        
        System.out.print("Nama\t\t\t : "); Nama = masukan.nextLine();
        System.out.print("Brand\t\t\t : "); Brand = masukan.nextLine();
        System.out.print("Prosesor\t\t : "); Prosesor = masukan.nextLine();
        System.out.print("Jumlah Core\t\t : "); Core = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System\t : "); Os = masukan.nextLine();
        System.out.print("Ukuran RAM(GB)\t\t : "); Ram = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage\t\t : "); Storage = masukan.nextLine();
        System.out.print("Stok\t\t\t : "); Stok = masukan.nextInt();
        masukan.close();
        
        System.out.println("=====================================");
        
        Laptop spesifikasi = new Laptop(Nama, Brand, Prosesor, Core, Os, Ram, Storage, Stok);
        spesifikasi.getAllLaptopData();
    }
}