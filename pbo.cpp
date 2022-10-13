#include <iostream>
using namespace std;
int main() {
  int i, j, m, n, matriks1[10][10], matriks2[10][10], hasil[10][10];
  char pilih;
  do{
  //input baris dan kolom
  cout << "Masukkan jumlah baris matriks: ";
  cin >> m;
  cout << "Masukkan jumlah kolom matriks: ";
  cin >> n;
  //input matrix 1
  cout << "Masukkan elemen matrix pertama: \n";
  for(i = 0; i < m; i++){
    for(j = 0; j < n; j++){
      cin >> matriks1[i][j];
    }
  }
  //input matrix 2
  cout << "Masukkan elemen matrix kedua: \n";
  for(i = 0; i < m; i++){
    for(j = 0; j < n; j++){
      cin >> matriks2[i][j];
    }
  }
  //proses penjumlahan matrix
  for(i = 0; i < m; i++){
    for(j = 0; j < n; j++){
      hasil[i][j] = matriks1[i][j] + matriks2[i][j];
    }
  }
  //output hasil penjumlahan matrix
  cout << "hasil penjumlahan matrix: \n";
  for(i = 0; i < m; i++){
    for(j = 0; j < n; j++){
      cout << hasil[i][j] << "\t";
    }
    cout << endl;
  }
  //pilihan untuk mengulang program
  cout <<"\n\nApakah ingin Mengulang Program Y/N : ";
  cin >> pilih;
  cout <<"\n";
  
  if (pilih == 'N'){
  	cout << "Program selesai";
  }
  cout <<"\n---------------------------------------------\n";
}while(pilih == 'Y');
  
  return 0;
}




