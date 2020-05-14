#include<iostream>
int main()
{
  int maxwt,fwt;
  std::cin>>maxwt>>fwt;
  if(maxwt>fwt)
    std::cout<<"Yes, you can enter.";
  else if(maxwt==fwt)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}
  