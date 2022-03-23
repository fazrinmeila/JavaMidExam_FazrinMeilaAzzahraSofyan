package application;

import data.*;
import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) {
        String Nama, Prosesor, Os, Storage;
        int Stok, Core, Ram;
        
        Scanner masukan = new Scanner(System.in);
        
        Axioo pico = new Axioo();
        Acer aspire = new Acer();
        
        /* Untuk test Axioo Pavilion 15 */
        pico.axSlogan();
        System.out.print("Nama\t\t\t : "); Nama = masukan.nextLine();
        System.out.print("Prosesor\t\t : "); Prosesor = masukan.nextLine();
        System.out.print("Jumlah Core\t\t : "); Core = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System\t : "); Os = masukan.nextLine();
        System.out.print("Ukuran RAM(GB)\t\t : "); Ram = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage\t\t : "); Storage = masukan.nextLine();
        System.out.print("Stok\t\t\t : "); Stok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        pico.setNama(Nama);
        pico.setProsesor(Prosesor);
        pico.setCore(Core);
        pico.setOs(Os);
        pico.setRam(Ram);
        pico.setStorage(Storage);
        pico.setStok(Stok);
        pico.getAllLaptopData();
        System.out.println("Store Position " + pico.getNama() + 
                " adalah " + pico.getStorePositionLaptop());
        System.out.println("==========================================");
                
        // ============================================================== //
        
        /* Untuk test Dell inspiron */
        aspire.acerSlogan();
        System.out.print("Nama\t\t\t : "); Nama = masukan.nextLine();
        System.out.print("Prosesor\t\t : "); Prosesor = masukan.nextLine();
        System.out.print("Jumlah Core\t\t : "); Core = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System\t : "); Os = masukan.nextLine();
        System.out.print("Ukuran RAM(GB)\t\t : "); Ram = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage\t\t : "); Storage = masukan.nextLine();
        System.out.print("Stok\t\t\t : "); Stok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        aspire.setNama(Nama);
        aspire.setProsesor(Prosesor);
        aspire.setCore(Core);
        aspire.setOs(Os);
        aspire.setRam(Ram);
        aspire.setStorage(Storage);
        aspire.setStok(Stok);
        aspire.getAllLaptopData();
        System.out.println("Store Position " + aspire.getNama() + 
                " adalah " + aspire.getStorePositionLaptop());
        System.out.println("==========================================");       
    }
}