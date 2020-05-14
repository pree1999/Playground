#include<iostream>
using namespace std;
int main()
{
  int x1,y1,d1,d2;
  int x=3,y=4;
  cin>>x1>>y1;
  d1=x-x1;
  d2=y-y1;
  (d1<d2)?cout<<abs(d1):cout<<abs(d2);
}