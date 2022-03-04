import java.util.LinkedList;

public class tugas3sda {
   public static void main(String[] args) {

    //Buatlah sebuah LinkedList yang mana pada LinkedList 
    //tersebut dapat menambah data berupa Nama_Mahasiswa, No_BP, Alamat.

    LinkedList<String> Nama_Mahasiswa = new LinkedList<>();
    LinkedList<String> No_BP = new LinkedList<>();
    LinkedList<String> Alamat = new LinkedList<>();

    //tambahkan beberapa fungsi/operasi pada LinkedList

    //addFirst(), add(), addLast()

    Nama_Mahasiswa.addFirst("Tesalonika Asyera Tampubolon");
    No_BP.addFirst("2111523008");
    Alamat.addFirst("Batusangkar");

    Nama_Mahasiswa.add("Kim Kardashian");
    No_BP.add("0000000000");
    Alamat.add("California");

    Nama_Mahasiswa.addLast("Kanye West");
    No_BP.addLast("1111111111");
    Alamat.addLast("Georgia");

    Nama_Mahasiswa.add("Angelina Jolie");
    No_BP.add("1010101010");
    Alamat.add("California");

    System.out.println(">>>>> Menambahkan Data Mahasiswa <<<<<");
    System.out.println("Nama Mahasiswa \t: " +Nama_Mahasiswa);
    System.out.println("NIM \t: " +No_BP);
    System.out.println("Alamat \t :" +Alamat);
    System.out.println("");

    //set()

    Nama_Mahasiswa.set(0, "Kendall Jenner");
    No_BP.set(2, "2222222222");
    Alamat.set(0, "Michigan");

    Nama_Mahasiswa.set(3, "Brad Pitt");
    No_BP.set(1, "2121212121");
    Alamat.set(2, "Texas");

    System.out.println(">>>>> Menyisipkan Data Mahasiswa <<<<<");
    System.out.println("Nama Mahasiswa\t: " +Nama_Mahasiswa);
    System.out.println("NIM\t: " +No_BP);
    System.out.println("Alamat\t: " +Alamat);
    System.out.println("");

    //remove(), removeLast()

    Nama_Mahasiswa.remove(2);
    No_BP.remove(1);
    Alamat.removeLast();

    System.out.println(">>>>> Menghapus Data Mahasiswa <<<<<");
    System.out.println("Nama Mahasiswa\t: " +Nama_Mahasiswa);
    System.out.println("NIM\t: " +No_BP);
    System.out.println("Alamat\t: " +Alamat);
    System.out.println("");

    //get()

    System.out.println(">>>>> FUNGSI GET <<<<<");
    System.out.println("Fungsi get Nama Mahasiswa\t: " +Nama_Mahasiswa.get(1));
    System.out.println("Fungsi get NIM\t: " +No_BP.get(0));
    System.out.println("Fungsi get Alamat\t: " +Alamat.get(2));
    System.out.println("");

    //pop()

    Nama_Mahasiswa.pop();
    No_BP.pop();
    Alamat.pop();
    System.out.println(">>>>> DATA SETELAH FUNGSI POP <<<<<");
    System.out.println("Fungsi POP Nama Mahasiswa\t: "+Nama_Mahasiswa);
    System.out.println("Fungsi POP NIM\t: "+No_BP);
    System.out.println("Fungsi POP Alamat\t: "+Alamat);
    System.out.println("");

    //push()

    Nama_Mahasiswa.push("Kim Jennie");
    No_BP.push("7777777777");
    Alamat.push("Coachella");
    System.out.println(">>>>> DATA SETELAH FUNGSI PUSH <<<<<");
    System.out.println("Fungsi PUSH Nama Mahasiswa\t: "+Nama_Mahasiswa);
    System.out.println("Fungsi PUSH NIM\t: "+No_BP);
    System.out.println("Fungsi PUSH Alamat\t: "+Alamat);
    System.out.println("");

    //indexOf()

    System.out.println(">>>>> INDEX OF <<<<<"); 
    System.out.println("fungsi index of pada Nama Mahasiswa\t: "+Nama_Mahasiswa.indexOf("Brad Pitt"));
    System.out.println("fungsi index of pada NIM\t: "+No_BP.indexOf("7777777777"));
    System.out.println("fungsi index of oada Alamat\t: "+Alamat.indexOf("Coachella"));
    System.out.println("");


   } 
}
