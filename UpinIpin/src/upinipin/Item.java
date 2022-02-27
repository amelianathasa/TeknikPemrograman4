package upinipin;

/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-02-26
 */
public class Item {
    //Melakukan Deklarasi variabel nama dengan access modifier private  (akses di satu kelas) 
    private String name;  
    private Item(){
        name = "Ipin";
    }
   
    public Item(String name){
        //Proses memasukkan item yang baru 
        this.name = new Item().name;
        System.out.println(this.name);  
    }
}

























