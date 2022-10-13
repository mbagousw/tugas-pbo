import java.util.Scanner;

class Main {
  public static void main(String[] args) {
Scanner input = new Scanner (System.in);
        int[][] matriksA;
        int[][] matriksB;
        int[][] matriksC;

        int baris;
        int kolom;
        char pilih;


        do{
        System.out.print("Masukkan Baris : ");
        baris = input.nextInt();

        System.out.print("Masukkan Kolom : ");
        kolom = input.nextInt();

        System.out.println();

        matriksA = new int[baris][kolom];
        matriksB = new int[baris][kolom];
        matriksC = new int[baris][kolom];

        //input matrix A
        System.out.println("Matriks A");
        for(int i=0; i<baris; i++){
            for(int j=0; j<kolom; j++){
                System.out.print("MatriksA ["+i+"]["+j+"] = ");
                int isimatriks = input.nextInt();

                matriksA[i][j] = isimatriks;
            }
        }
        System.out.println("\n");
        //Input Matriks B
        System.out.println("Matriks B");
        for(int i=0; i<baris; i++){
            for(int j=0; j<kolom; j++){
                System.out.print("MatriksB ["+i+"]["+j+"] = ");
                int isimatriks = input.nextInt();

                matriksB[i][j] = isimatriks;
            }
        }
        //Hitung Penjumlahan Matriks A dan B
        for(int i = 0; i<baris; i++){
            for(int j = 0; j<kolom; j++){
                matriksC[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        System.out.println("\n");
        //tampilkan hasil penjumlahan

        System.out.println("Hasil Penjumlahan Matriks A dengan matriks B: ");
        for (int i = 0; i<baris; i++){
            for(int j = 0; j<kolom; j++){
                System.out.print(matriksC[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Apakah ingin mengulang program Y/N : ");
        pilih = input.next().charAt(0);

        if(pilih == 'N'){
            System.out.println("Program Selesai");
        }

        

        }while(pilih == 'Y');    
  }
}