#include<iostream>
using namespace std;
int main()
{
  float m;
  int p,d,r;
  cin>>m>>p>>d;
  r=m*p;
  if(r>=d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}