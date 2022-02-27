package kelasdua;

/**
 *
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-02-26
 */
public class KelasDua {
    {
        System.out.println(5);
    }
    //Program akan masuk ke method main saat pertama kali mengakses class KelasDua 
    public static void main(String[] args) {
        //Mengeluarkan output 6
        System.out.println(6);
        //Lalu masuk ke method kelasSatu dengan objek satu
        KelasSatu satu = new KelasSatu();
        //Setelah memproses method KelasSatu objek satu, lalu memproses method KelasSatu objek dua
        KelasSatu dua = new KelasSatu(10);
        
    }
    
}


























