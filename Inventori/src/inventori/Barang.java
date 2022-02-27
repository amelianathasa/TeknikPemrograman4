package inventori;

/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-02-25
 */
public class Barang {
    //Kamus Data (Pendeklarasian variabel) 
    String kode_barang;
    String nama_barang; 
    //Mengganti access modifier variabel stok menjadi private
    private int stok;       
    
    public Barang(String kode, String nama, int stk){
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }  
    //Membuat getter Stok untuk mendapatkan nilai dari variabel stok 
    public int getStok() {
        return stok;    //Mengembalikan nilai stok 
    }

    //Membuat setter Stok untuk memasukkan nilai variabel stok 
    public void setStok(int stok) {
        //Karena program melakukan perhitungan stok, maka tambahkan operasi matematika penjumlahan 
        //Penjumlahan dari jumlah stok awal barang dan jumlah barang baru 
        this.stok = this.stok + stok;     
    }   
}










