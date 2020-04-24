import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataType{
 public static void main(String[]args){

  Scanner scanner = new Scanner(System.in);

  String namaDepan ="Muhammad";
  String namaTengah ="Zida";
  String namaBelakang ="Yassir";
  int usia =20;
  int targetTahunKuliah = 4;
  boolean tampan = true;
  
  System.out.print("Input Nama Depan : ");
  namaDepan = scanner.nextLine();
  System.out.print("Input Usia : ");
  usia = scanner.nextInt();
  System.out.print("Tampan? : ");
  tampan = scanner.nextBoolean();

  System.out.println("----------OUTPUT------------");
  System.out.println("Nama Depan :" + namaDepan);
  System.out.println("Nama Tengah :" + namaTengah);
  System.out.println("Nama Belakang :" + namaBelakang);
  System.out.println("Usia :" + usia);
  System.out.println("Target Kuliah :" + targetTahunKuliah +" tahun");
  System.out.println("Tampan :" + tampan);

  JOptionPane.showMessageDialog(null."Hai, " + namaDepan + namaTengah + namaBelakang);
 }
}