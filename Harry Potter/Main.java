#include<iostream>
using namespace std;
int main()
{
  int n,first,last,sum;
  cin>>n;
  first=n/1000;
  last=n%10;
  sum=first+last;
  cout<<sum;
}