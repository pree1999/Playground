#include<iostream>
using namespace std;
int main()
{
  int r,c,n,s;
  cin>>r>>c>>n;
  s=r*c;
  if(n>=1&&n<=r||n%c==0||n%r==1)
    cout<<"Yes";
  else
    cout<<"No";
}