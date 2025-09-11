// El usuario ingresará números en un arreglo unidimensional de 10, cada número que ingrese el
// usuario debe ser mayor al anterior. Guarde estos números en el arreglo.

#include <iostream>
using namespace std;

int main() {
    const int TAM = 10;
    int arreglo[TAM];
    int numero;

    cout << "Ingrese 10 numeros en orden creciente:\n";

    for (int i = 0; i < TAM; ++i) {
        while (true) {
            cout << "Numero " << i + 1 << ": ";
            cin >> numero;

            if (i == 0 || numero > arreglo[i - 1]) {
                arreglo[i] = numero;
                break;
            } else {
                cout << "El numer debe ser mayor que el anterior (" << arreglo[i - 1] << "). Intente nuevamente.\n";
            }
        }
    }
    cout << "\nNumeros ingresados correctamente:\n";
    for (int i = 0; i < TAM; ++i) {
        cout << arreglo[i] << " ";
    }
    cout << endl;

    return 0;
}
