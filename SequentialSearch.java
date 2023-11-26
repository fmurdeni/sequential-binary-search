public class SequentialSearch {
    // Method search
    public static int search(int[] data, int n){
        int index = -1;

        for (int i = 0; i < data.length; i++){

            // jika data n ditentukan, simpan indexnya dan hentikan loop
            if (data[i] == n) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args){
        // tentukan data
        int[] data = {10, 20, 30, 40, 50};

        // kata kunci pencarian
        int n = 40;

        int result = search(data, n);

        if (result == -1) {
            System.out.println("Angka "+ n + " tidak ditemukan di dalam Array");
        } else {
            System.out.println("Angka "+ n + " ditemukan di dalam array pada index ke-"+ result + ".");
        }
    }
    
}