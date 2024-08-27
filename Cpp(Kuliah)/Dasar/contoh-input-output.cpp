#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	// Deklarasi variable
	string nama;
	int umur;
	
	cout << "-- BIO Data --- \n";
	// Memasukan data ke dalam variable
	cout << "Nama: ";
	cin >> nama;
	
	cout << "Umur: ";
	cin >> umur;
	
	cout << "\n --- HASIL --- \n";
	// Menampilkan data ke dalam Console
	cout << "Nama: " << nama << "\n";
	cout << "Umur: " << umur;
	
}
