#include<iostream>
using namespace std;
int main()
{
  float x1,x2,y1,y2,z1,z2;
  float x,y;
  std::cin>>x1>>x2>>y1>>y2>>z1>>z2;
  x=(x1+y1+z1)/3;
  y=(x2+y2+z2)/3;
  std::cout<<x<<"\n"<<y;
}