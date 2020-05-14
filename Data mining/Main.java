#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  int o=0,e=0;
  while(a>0){
    int temp=a%10;
    temp%2==0?e+=temp:o+=temp;
    a=a/10;
  }
  if(o==e)
    cout<<"Yes";
  else
    cout<<"No";
}