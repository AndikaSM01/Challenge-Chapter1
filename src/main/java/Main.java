package main.java;

class Main {
    public static void main(String[] args) {
        System.out.println("===== Latihan Pert 3 =====");
        System.out.println("NO. 1");
        int n = 2;
        for (int i =0; i<=4; i++){
         System.out.print(n+" ");
         n = n * 2 ;
       }
    }
}
class Main2 {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 0; i <= 5; i++) {
            System.out.print(n + " ");
            n = n * 2;
        }
    }
}
class Main3{
    public static void main(String[] args) {
                int number = 66592;
                int[] angka = new int[5];

                // Memisahkan angka
                for (int i = 4; i >= 0; i--) {
                    angka [i] = number % 10;
                    number /= 10;
                }

                // Menggunakan Bubble Sort untuk mengurutkan digit-digit
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4 - i; j++) {
                        if (angka[j] < angka[j + 1]) {
                            // Menukar posisi jika elemen saat ini lebih kecil dari elemen berikutnya
                            int posisi = angka[j];
                            angka[j] = angka[j + 1];
                            angka[j + 1] = posisi;
                        }
                    }
                }

                // Menampilkan angka yang sudah diurutkan
                for (int hasil : angka) {
                    System.out.print(hasil+" ");
                }
    }
}
class Main4{
    public static void main(String[] args) {
                String kata = "MAKANNASI";
                char[] huruf = kata.toCharArray();

                for (int i = 0; i < huruf.length - 1; i++) {
                    for (int j = 0; j < huruf.length - i - 1; j++) {
                        if (huruf[j] > huruf[j + 1]) {
                            // Menukar posisi jika huruf saat ini lebih besar dari huruf berikutnya
                            char susun = huruf[j];
                            huruf[j] = huruf[j + 1];
                            huruf[j + 1] = susun;
                        }
                    }
                }

                System.out.println(new String(huruf));

    }
}
class Main5 {
    public static void main(String[] args) {
        int[] angka = {100, 20, 15, 30, 5, 75, 40};

        bubbleSort(angka);


        for (int num : angka) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int hasil = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = hasil;
                }
            }
        }
    }
}


