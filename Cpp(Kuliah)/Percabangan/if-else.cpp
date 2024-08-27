#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	int pilihan;
	
	cout << "-- Menu Pilihan --" << "\n";
	cout << "1). Hamburger" << "\n";
	cout << "2). Pizza" << "\n";
	cout << "3). Roti O lempuyangan" << "\n"; 
	cout << "Pilihan: ";
	cin >> pilihan;
	
	cout << "\n -- HASIL -- \n";
	
	if(pilihan == 1) {
		cout << "Aku pilih Hamburger";
	} else if(pilihan == 2) {
		cout << "Aku suka pizza";
	} else if(pilihan == 3) {
		cout << "Aduhai jomoknya";
	} else {
		cout << "Masukan pilihan yang benar";
	}
}
