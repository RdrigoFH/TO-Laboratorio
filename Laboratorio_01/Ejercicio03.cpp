//  Lanza un dado 20000 veces y guarda la frecuencia de cada una de las 6 caras en un arreglo

#include <iostream>
#include <cstdlib>
#include <vector>
#include <ctime> 
using namespace std;

int main() {
   int rolls = 20000;
   std::srand(std::time(nullptr));

   vector<int> store(6);   

   for(int i = 0; i < rolls; i++){
      int rand_num = rand() % 6;
      store[rand_num]++;
   }

   for(int i = 0; i < 6; i++){
      cout << "Cara "<< i << ": ";
      cout << store[i]<<'\n';
   }
}