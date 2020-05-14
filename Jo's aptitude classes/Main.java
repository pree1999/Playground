#include<iostream>
using namespace std;
int gcd(int x,int y,int z)
{
int i,j;
for(i=1;i<=x;i++){
 if(x%i==0 && y%i==0 && z%i==0)
   j=i;
   }
   return j;
   }
   int main()
   {
   int a,b,c,d,l;
   cin>>a>>b>>c>>d;
   l=gcd(a,b,c);
   if(l==d)
   cout<<"Answer is correct.";
   else
   cout<<"Answer is wrong.";
   }