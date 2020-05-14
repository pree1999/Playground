#include<iostream>
using namespace std;
int main()
{
  int n;
  float h,heat,inc;
  cin>>n>>h;
  if(n<=2)
  {
    heat=(h*50)/100;
    inc=h+heat;
    cout<<inc;
  }
  else if(n==3)
  {
    heat=h*2;
    cout<<heat;
  }
  else
    cout<<"Number of items is more";
}