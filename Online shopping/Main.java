#include<iostream>
using namespace std;
int main()
{
  float a,b,c,d,e,f,g,h,i,F,S,A;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  F=(a*(100-b))/100+c;
  S=(d*(100-e))/100+f;
  A=(g*(100-h))/100+i;
  std::cout<<"In Flipkart Rs."<<F
    <<"\nIn Snapdeal Rs."<<S<<"\nIn Amazon Rs."<<A;
    if(F<=S&&F<A)
    {
      std::cout<<"\nHe will prefer Flipkart";
    }
  else if(S<F&&S<A)
  {
    std::cout<<"\nHe will prefer Snapdeal";
  }
  else
  {
    std::cout<<"\nHe will prefer Amazon";
  }
}