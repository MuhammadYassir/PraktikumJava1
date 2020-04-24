public class Main {
    public static void main(String[] args) {
        String namaDepan = "Muhammad";
        String namaTengah = "Zida";
        String namaBelakang = "Yassir";
        int usia = 20;
        int targetTahunKuliah = 4;
        boolean tampan = true;

        char[] uniskaChar = {'U','I','S','K','A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);
        System.out.println(namaDepan + namaTengah + namaBelakang);

        String namaLengkap = namaDepan + " " +
                namaTengah + " " + namaBelakang;
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5));
        System.out.println(namaLengkap.substring(5,12));
        System.out.println(namaLengkap.replace( target: "Zi", replacement: "Barr"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split( regex: " ");

        for(String nama : namaArray){
            System.out.println(nama);
        }
    }
}
