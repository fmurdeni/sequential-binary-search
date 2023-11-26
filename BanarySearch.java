public class BanarySearch {
    // search
    public static int search(int[] data, int n){
        // variables
        int start = 0;
        int end = data.length -1;
        int mid;

        // loop
        while (start <= end) {
            mid = (start + end) / 2;

            // Jika angka n mengembalikan indexnya
            if (data[mid] == n) {
                return mid;
            }

            // jika angka n lebih kecil dari index tengah, cari bagian kiri array
            if (n < data[mid]) {
                end = mid -1;
            }

            // jika angka n lebih besar dari index tengah, cari bagian kanan 
            if (n > data[mid]) {
                start = mid + 1;
            }         


        }

        // jika anak n tidak ditemukan nilai default -1;
        return -1;
    }

    // main method
    public static void main(String[] args){
        int[] data = { 10, 20, 30, 40, 50 };
        int n = 30;

        // search
        int result = search(data, n);
        if (result == -1) {
            System.out.println("Angka " + n + " tidak ditemukan di dalam Array");
        } else {
            System.out.println("Angka " + n + " ditemukan di dalam array pada index ke-" + result + ".");
        }
    }
}
