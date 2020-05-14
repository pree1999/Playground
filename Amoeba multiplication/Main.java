#include<iostream>
using namespace std;
int main()
{
  int a=-1,b=1,c,s;
  cin>>c;
  while(c!=0){
    s=a+b;a=b;b=s;
    c--;}
  cout<<s;
}
