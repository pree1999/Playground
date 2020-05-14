#include<iostream>
using namespace std;
int main()
{
  int n,total=0;
  std::cin>>n;
  n-=1;
  while(n!=0)
  {
    total+=n;
    n--;
  }
  std::cout<<total;
}