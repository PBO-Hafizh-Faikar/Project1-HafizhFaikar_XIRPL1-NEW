package com.app.cash.tools;

import com.app.cash.tools.classes.*;

import java.util.Scanner;

public class Main {

    public DaftarMenu daftarMenu;
    // initiate pajak start
    public static double PAJAK_PPN = 0.10;
    public static double BIAYA_SERVICE = 0.05;
    // initiate pajak end

    // generate method
    public void generateDaftarMenu(){
        daftarMenu = new DaftarMenu();
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));
        daftarMenu.tambahMenu(new Kuah("Kuah Orisinil"));
        daftarMenu.tambahMenu(new Kuah("Kuah TomYum"));
        daftarMenu.tambahMenu(new Kuah("Kuah Extra Hot"));
        daftarMenu.tambahMenu(new Kuah("Kuah Susu"));
        daftarMenu.tambahMenu(new Toping("Baby Crab", 6000));
        daftarMenu.tambahMenu(new Toping("Chicken Katsu", 8000));
        daftarMenu.tambahMenu(new Toping("Jamur Goreng", 4000));
        daftarMenu.tambahMenu(new Toping("Bakso Goreng", 7000));
        daftarMenu.tambahMenu(new Toping("Sliced Beef", 5000));
        daftarMenu.tambahMenu(new Minuman("Jus Mangga", 10000));
        daftarMenu.tambahMenu(new Minuman("Jus Stroberi", 11000));
        daftarMenu.tambahMenu(new Minuman("Capucino Coffee", 15000));
        daftarMenu.tambahMenu(new Minuman("V60", 14000));

        daftarMenu.tampilDaftarMenu();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Main app = new Main();
        app.generateDaftarMenu(); {
            //transaction start
            System.out.println("=======>> TRANSAKSI <<<=======");

            System.out.print("No Transaksi : ");
            String no_transaksi = input.next();
            System.out.print("Pemesan : ");
            String nama_pemesanan = input.next();
            System.out.print("Tanggal : [dd-mm-yyyy] ");
            String tanggal = input.next();
            System.out.print("Makan ditempat? [Y/N] ");
            String makan_ditempat = input.next();

            if (makan_ditempat.equalsIgnoreCase("Y")) {
                System.out.print("Nomor Meja : ");
                String no_meja = input.next();
            }
        }
    }

}
