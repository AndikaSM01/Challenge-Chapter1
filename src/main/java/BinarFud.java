package main.java;

import java.util.Scanner;

public class BinarFud{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Scanner scan = new Scanner(System.in);

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

            int jum=0,i=0;
            double [] sub_total = new double[5];
            int [] harga = new int[5];
            int h1 = 15000, h2 = 13000, h3 = 18000, h4 = 3000, h5 = 5000;
            String [] menu = new String[5];

            for (String j = "Y"; j.equals("Y")||j.equals("y");) {
                System.out.print("=>  ");
                int inNomor = input.nextInt();
                System.out.print("Masukan qty  : ");
                harga[i]=input.nextInt();

                if (inNomor == 1) {
                    menu[i]= "Nasi Goreng";
                    System.out.println("==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println(""+ menu[i] + " | "+h1 );
                    System.out.print("( Input 0 untuk kembali) ");
                    harga[i] = input.nextInt();
                    sub_total [i] = harga[i]*h1;

                } else if (inNomor == 2) {
                    menu [i]= "Mie Goreng";
                    System.out.println("\n==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println("\n"+ menu[i] + " | "+h2 );
                    System.out.println("( Input 0 untuk kembali) ");
                    System.out.println("=>  ");

                } else if (inNomor == 3) {
                    menu[i] = "Nasi + Ayam";
                    System.out.println("\n==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println("\n"+ menu[i] + " | "+h3 );
                    System.out.println("( Input 0 untuk kembali) ");

                }else if (inNomor == 4) {
                    menu [i]= " Es Teh Manis ";
                    System.out.println("\n==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println("\n"+ menu[i] + " | "+h4 );
                    System.out.println("( Input 0 untuk kembali) ");

                }else if (inNomor == 5) {
                    menu [i] = "Es Jeruk";
                    System.out.println("\n==============================");
                    System.out.println("Berapa Pesanan Anda ");
                    System.out.println("==============================");
                    System.out.println("\n"+ menu[i] + " | "+h5);
                    System.out.println("( Input 0 untuk kembali) ");

                }else if (inNomor == 99) {

                }else if (inNomor == 0) {
                    System.out.println("Terima Kasih Telah berbelanja di BinarFud");
                } else {
                    System.out.println("Nomor yang dipilih tidak ada di menu.");
                }
                System.out.println("Apakah anda mau melanjutkan? Y/T");
                j = scan.next();
            }

            System.out.println(" ");
            System.out.println("No   Nama Barang                       QTY    Sub Total");
            //Menampilkan seluruh elemen di dalam array
            for (i=0; i<jum;i++){
                System.out.println(i+1+" "+menu[i]+"   "+"    "+harga[i]+"     "+"     "+sub_total[i]);

            }

            System.out.println("\n========================================");
            System.out.println("Binar Fud ");
            System.out.println("\n========================================");

            System.out.println("\n Terima kasih sudah memesan di BinarFud");
            System.out.println("\n Dibawah ini adalah pesanan anda");
            System.out.println("Total pembayaran sebesar " +harga+".");
            System.out.println("Terimakasih atas kunjungannya.");
        }
}



