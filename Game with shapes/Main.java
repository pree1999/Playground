#include<iostream>
using namespace std;
int main()
{
  int c,s;
   std::cin>>c>>s;
  if(s>=2*c)
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
}