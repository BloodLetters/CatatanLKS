#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	// Deklarasi variable
	double alas,tinggi,hasil;

  // Memasukan Inputan
	cout << "--- Menghitung Luas Segitiga --- \n";
	cout << "alas: ";
	cin >> alas;
	
	cout << "Tinggi: ";
	cin >> tinggi;

  // Menghitung luas
	hasil = 0.5 * alas * tinggi;
	
  // Menampilkan Hasil
  	cout << "\n --- HASIL --- \n";
	cout << "Luas Segitiga: " << hasil << " Cm";
}
