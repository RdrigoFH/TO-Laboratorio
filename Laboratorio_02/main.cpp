#include <iostream>
#include <vector>
using namespace std;

int countChange(int money, const vector<int> &coins, int index = 0)
{
   // Caso base: monto exacto
   if (money == 0)
      return 1;
   // Caso base: monto negativo o sin monedas
   if (money < 0 || index >= coins.size())
      return 0;

   // Opción 1: usar la moneda coins[index]
   int withCoin = countChange(money - coins[index], coins, index);
   // Opción 2: no usarla, pasar a la siguiente
   int withoutCoin = countChange(money, coins, index + 1);

   return withCoin + withoutCoin;
}

int main()
{
   vector<int> coins = {1, 2};
   int money = 4;

   cout << "Cantidad de formas de dar cambio: "
        << countChange(money, coins) << endl;

   return 0;
}
