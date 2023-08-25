package main.java;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class PenjualanBarang {
    public static void menu(){
        //Inisialisasi objek untuk masing-masing kelas
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        System.out.println("\n==============================");
        System.out.println("Selamat datang di BinarFud ");
        System.out.println("==============================");

        System.out.println("Silahkan pilih makanan :");
        System.out.println("1. Nasi Goreng  | Rp 15.000");
        System.out.println("2. Mie Goreng   | Rp 13.000");
        System.out.println("3. Nasi + Ayam  | Rp 18.000");
        System.out.println("4. Es Teh Manis | Rp 3.000");
        System.out.println("5. Es Jeruk     | Rp 5.000");
        System.out.println("99. Pesan dan Bayar ");
        System.out.println("0. Keluar aplikasi  ");
        //Deklarasi variabel
        int jum = 0, i = 0;
        double total_bayar = 0;
        int total_qty = 0;
        //Deklarasi array
        int[] menu = new int[5];
        int[] qty = new int[5];
        int[] harga = new int[5];
        double[] sub_total = new double[5];
        String[] Menu = new String[5];


        System.out.print("jumlah pesanan :  ");
        jum = input.nextInt();
        System.out.println(" ");
        //Memasukan elemen didalam array
        for (i = 0; i < jum; i++) {
            System.out.print("Masukan Menu Ke-" + (i + 1) + " : ");
            menu[i] = input.nextInt();

            //Menentukan barang berdasarkan kode yang dimmasukan
            switch (menu[i]) {
                case 1:
                    Menu[i] = "Nasi Goreng  ";
                    harga[i] = 15000;
                    System.out.println("==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println(""+ Menu[i] + " | "+harga[i] );

                    break;
                case 2:
                    Menu[i] = "Mie Goreng ";
                    harga[i] = 13000;
                    System.out.println("==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println(""+ Menu[i] + " | "+harga[i] );

                    break;
                case 3:
                    Menu[i] = "Nasi+Ayam";
                    harga[i] = 18000;
                    System.out.println("==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println(""+ Menu[i] + " | "+harga[i] );

                    break;
                case 4:
                    Menu[i] = "Es Teh Manis        ";
                    harga[i] = 3000;
                    System.out.println("==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println(""+ Menu[i] + " | "+harga[i] );

                    break;
                case 5:
                    Menu[i] = "Es Jeruk   ";
                    harga[i] = 5000;
                    System.out.println("==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println(""+ Menu[i] + " | "+harga[i] );
                    break;
                case 0 :
                    System.exit(0);
                    break;

                default:
                    System.out.println("Kode Barang Tidak Tersedia");
            }
            System.out.println(" ");
            System.out.println("( Input 0 untuk kembali) ");
            System.out.print("Masukan qty Ke-" + (i + 1) + " : ");
            qty[i] = input.nextInt();
            qty[i] = input.nextInt();
            if(qty[i] == 0){
                menu();
            }

        }
        //Pengaturan format number
        System.out.print("=>");
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        for (i = 0; i < jum; i++) {
            int pilihan = input.nextInt();
            if (pilihan == 99) {
                System.out.println("==============================================");
                System.out.println("Konfirmasi & Pembayaran");
                System.out.println("==============================================");
                for(i=0; i < jum; i++) {
                    sub_total[i] = ((harga[i] * qty[i]));
                    total_bayar += sub_total[i];
                    total_qty += qty[i];
                    System.out.println(Menu[i] + "\t " + qty[i] + " \t       " + kursIndonesia.format(sub_total[i]));
                }
                System.out.println("---------------------------------------------+");
                System.out.println("Total" + "\t\t\t " + total_qty + "\t\t " + kursIndonesia.format(total_bayar));
                System.out.println("1.Konfirmasi Pesanan");
                System.out.println("2.Kembali ke menu Utama ");
                System.out.println("3.Keluar Aplikasi  ");
                System.out.print("=>");
                for (i=0;i<jum;i++){
                    int pilih = input.nextInt();
                    if (pilih==1){
                        System.out.println("==============================================");
                        System.out.println("Binarfud");
                        System.out.println("==============================================");
                        System.out.println("\nTerima Kasih sudah memesan di BinarFud ");
                        System.out.println("Dibawah ini adalah pesanan anda");
                        for(i=0; i < jum; i++) {
                            // sub_total[i] = ((qty[i] * harga[i]));
                            // total_bayar += sub_total[i];
                            // total_qty += qty[i];
                            System.out.println(Menu[i] + "\t    " + qty[i] + " \t   " + kursIndonesia.format(sub_total[i]));
                        }
                        System.out.println("---------------------------------------------+");
                        System.out.println("Total" + "\t\t\t " + total_qty + "\t\t " + kursIndonesia.format(total_bayar));
                        System.out.println("\nPembayaran : BinarCash");
                        System.out.println("==============================================");
                        System.out.println("Simpan struk ini sebagai bukti pembayaran ");
                        System.out.println("==============================================");
                        break;
                    } else if (pilih==2) {
                        menu();
                    }else {
                        System.out.println("Anda keluar dari Aplikasi");
                        System.exit(0);
                    }
                }

            }else {
                System.out.println("Terima Kasih Telah berbelanja Di BinarFud");
            }
        }
    }
    public static void main(String args[]) {
        //Inisialisasi objek untuk masing-masing kelas
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        System.out.println("\n==============================");
        System.out.println("Selamat datang di BinarFud ");
        System.out.println("==============================");

        System.out.println("Silahkan pilih makanan :");
        System.out.println("1. Nasi Goreng  | Rp 15.000");
        System.out.println("2. Mie Goreng   | Rp 13.000");
        System.out.println("3. Nasi + Ayam  | Rp 18.000");
        System.out.println("4. Es Teh Manis | Rp 3.000");
        System.out.println("5. Es Jeruk     | Rp 5.000");
        System.out.println("99. Pesan dan Bayar ");
        System.out.println("0. Keluar aplikasi  ");
        //Deklarasi variabel
        int jum = 0, i = 0;
        double total_bayar = 0;
        int total_qty = 0;
        //Deklarasi array
        int[] menu = new int[5];
        int[] qty = new int[5];
        int[] harga = new int[5];
        double[] sub_total = new double[5];
        String[] Menu = new String[5];


        System.out.print("jumlah pesanan :  ");
        jum = input.nextInt();
        System.out.println(" ");
        //Memasukan elemen didalam array
        for (i = 0; i < jum; i++) {
            System.out.print("Masukan Menu Ke-" + (i + 1) + " : ");
            menu[i] = input.nextInt();

            //Menentukan barang berdasarkan kode yang dimmasukan
            switch (menu[i]) {
                case 1:
                    Menu[i] = "Nasi Goreng  ";
                    harga[i] = 15000;
                    System.out.println("==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println(""+ Menu[i] + " | "+harga[i] );

                    break;
                case 2:
                    Menu[i] = "Mie Goreng ";
                    harga[i] = 13000;
                    System.out.println("==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println(""+ Menu[i] + " | "+harga[i] );

                    break;
                case 3:
                    Menu[i] = "Nasi+Ayam";
                    harga[i] = 18000;
                    System.out.println("==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println(""+ Menu[i] + " | "+harga[i] );

                    break;
                case 4:
                    Menu[i] = "Es Teh Manis        ";
                    harga[i] = 3000;
                    System.out.println("==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println(""+ Menu[i] + " | "+harga[i] );

                    break;
                case 5:
                    Menu[i] = "Es Jeruk   ";
                    harga[i] = 5000;
                    System.out.println("==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println(""+ Menu[i] + " | "+harga[i] );
                    break;
                case 0 :
                    System.exit(0);
                    break;

                 default:
                    System.out.println("Kode Barang Tidak Tersedia");
            }
            System.out.println(" ");
            System.out.println("( Input 0 untuk kembali) ");
            System.out.print("Masukan qty Ke-" + (i + 1) + " : ");
            qty[i] = input.nextInt();
            if(qty[i] == 0){
                menu();
            }

        }
        //Pengaturan format number
        System.out.print("=>");
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        for (i = 0; i < jum; i++) {
        int pilihan = input.nextInt();
            if (pilihan == 99) {
                System.out.println("==============================================");
                System.out.println("Konfirmasi & Pembayaran");
                System.out.println("==============================================");
                for(i=0; i < jum; i++) {
                    sub_total[i] = ((harga[i] * qty[i]));
                    total_bayar += sub_total[i];
                    total_qty += qty[i];
                    System.out.println(Menu[i] + "\t " + qty[i] + " \t       " + kursIndonesia.format(sub_total[i])+"\n");
                }

                System.out.println("---------------------------------------------+");
                System.out.println("Total" + "\t\t " + total_qty + "\t\t " + kursIndonesia.format(total_bayar));
                System.out.println("1.Konfirmasi Pesanan");
                System.out.println("2.Kembali ke menu Utama ");
                System.out.println("3.Keluar Aplikasi  ");
                System.out.print("=>");
                for (i=0;i<jum;i++){
                    int pilih = input.nextInt();
                    if (pilih==1){
                        System.out.println("==============================================");
                        System.out.println("Binarfud");
                        System.out.println("==============================================");
                        System.out.println("\nTerima Kasih sudah memesan di BinarFud\n");
                        System.out.println("\nDibawah ini adalah pesanan anda");
                        for(i=0; i < jum; i++) {
                            System.out.println(Menu[i] + "\t    " + qty[i] + " \t   " + kursIndonesia.format(sub_total[i]));
                        }
                        System.out.println("---------------------------------------------+");

                        System.out.println("Total" + "\t\t " + total_qty + "\t\t " + kursIndonesia.format(total_bayar)+"\n");
                        System.out.println("\nPembayaran : BinarCash");
                        System.out.println(" ");
                        System.out.println("==============================================");
                        System.out.println("Simpan struk ini sebagai bukti pembayaran ");
                        System.out.println("==============================================");
                        break;
                    } else if (pilih==2) {
                        menu();
                    }else {
                        System.out.println("Anda keluar dari Aplikasi");
                        System.exit(0);
                    }
                }

            }else {
                System.out.println("Terima Kasih Telah berbelanja Di BinarFud");
            }
        }
    }

}
