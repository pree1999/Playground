#include<iostream>
using namespace std;
int main()
{
  float age,time;
  float t;
  std::cin>>age>>time;
  t=10.15;
  if(age>=13)
  {
    if(time==t)
    {
      std::cout<<"$8.00";
    }
    else
    {
      std::cout<<"$5.00";
    }
  }
  else if(age<13)
  {
    if(time==t)
    {
      std::cout<<"$4.00";
    }
    else
    {
      std::cout<<"$2.00";
    }
  }
}
