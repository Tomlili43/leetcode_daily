#include <iostream>
using namespace std;
typedef long long LL;

const int N = 1e5+10;
int s1[5] = {1, 2, 3, 4, 5};
int s2[4] = {3, 4, 5, 6};
int s3[5] = {10, 10, 10, 7, 8};

class MinDistanceCalculator {
public:
   LL calculateMinDistance(int l, int m, int n) {
      LL res = 1e18;
      for(int i=0,j=0,k=0; i<l && j<m && k<n; ){
         int x=s1[i], y=s2[j], z=s3[k];
         res = min(res, (LL)max(max(x,y), z) - min(min(x,y), z));

         if(x<=y && x<=z)        i++;
         else if(y<=x && y<=z)   j++;
         else                    k++;
      }
      return res * 2;
   }
};

int main(){
   MinDistanceCalculator calculator;
   cout << calculator.calculateMinDistance(5, 4, 5) << endl;
   return 0;
}