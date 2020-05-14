#include<iostream>
using namespace std;
int main()
{
  int p,n,r,i;
  float t,d,a;
  cin>>p>>r>>n;
  i=(p*n*r)/100;
  d=(2.0/100)*i;
  a=p+i;
  t=a-d;
  cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<t;
}