#include<iostream>
using namespace std;
int facto(int n){
  if(n==0)
    return 1;
  else
    return n*facto(n-1);}
int main()
{
  int a;
  cin>>a;
  cout<<"The factorial of "<<a<<" is "<<facto(a);
  
}
