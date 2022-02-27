package inventori;

/**
 *
 * @author Amelia Nathasa
 * @version 1.o
 * @since 2022-02-25
 */
public class Inventori {

    Barang[] barangs;
    
    //Mendefinisikan objek barang yang terdiri dari kode, nama dan stok awal barang
    void initBarang(){
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    
    //Untuk menampilkan nama dan jumlah stok barang
    void showBarang(){
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }
    
    //Proses manipulasi jumlah stok barang 
    void pengadaan(){
        initBarang();
        barangs[0].setStok(100);    //Stok Baru 
        barangs[1].setStok(100);    //Stok Baru 
        showBarang();
    }
    
    
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();       //Prpses pemanggilan 
        
    }
}


