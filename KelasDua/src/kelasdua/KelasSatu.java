package kelasdua;

/**
 *
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-02-26
 */
public class KelasSatu {
    //Yang kedua diproses 
    {
        System.out.println(11);
    }
    /*Yang pertama kali diproses method dengan keyword adalah static,
    static dapat dipanggil tanpa harus membuat instansiasi objek.*/
    static
    {
        System.out.println(2);
    }
    //Yang pertama diproses setelah memproses method KelasSatu objek dua karena terdapat parameter integer 
    public KelasSatu(int i)
    {
        System.out.println(3);
    }
    //Yang ketiga diproses karena yang dipanggil tadi adalah KelasSatu tanpa parameter
    public KelasSatu()
    {
        System.out.println(4);
    }
    //Setelah itu kembali ke class KelasDua  
}





