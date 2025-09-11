//Programe una función menor que reciba 3 números decimales y devuelva el menor de los 3.
#include <iostream>
using namespace std;

double menor(double a, double b, double c) {
    double min = a;

    if (b < min)
        min = b;
    if (c < min)
        min = c;

    return min;
}

int main() {
    double x, y, z;
    cout << "Ingrese 03 numeros:\n";
    cin >> x >> y >> z;

    double resultado = menor(x, y, z);
    cout << "El menor es: " << resultado << endl;

    return 0;
}
