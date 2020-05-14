#include<iostream>
using namespace std;
int swa(int &x,int &y)
{
int te;
te=x;
x=y;
y=te;
}
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swa(a,b);
  cout<<"After swapping a= "<<a<<" and b="<<b;
}

