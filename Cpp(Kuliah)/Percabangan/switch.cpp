#include <iostream>

using namespace std;

int main(int argc, char** argv) {
char grade;

    cout << "Inputkan Nilai: ";
    cin >> grade;

	cout << "\n --- Nilai --- \n";
    switch (toupper(grade)){
        case 'A':
            cout << "Mantap" << endl;
            break;

        case 'AB':
            cout << "Bagus" << endl;
            break;

		case 'B':
            cout << "Lumayan" << endl;
            break;
        
        case 'BC':
            cout << "Berusaha lagi ya" << endl;
            break;
            
		case 'C':
            cout << "lu remed jir" << endl;
            break;

        default:
            cout << "Masukan nilai yg benar plis" << endl;
    }
}
