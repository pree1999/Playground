#include<iostream>
int main()
{
  int a,b,c;
  std::cout<<"Enter first number : ";
  std::cin>>a;
  std::cout<<"Enter second number : ";
  std::cin>>b;
  std::cout<<"Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  std::cin>>c;
  switch(c)
  {
    case 1 : 
      std::cout<<a+b;
    break;
    case 2 :
      std::cout<<a-b;
    break;
    case 3 : 
      std::cout<<a*b;
    break;
    case 4 : 
      std::cout<<a/b;
    break;
    case 5 :
      std::cout<<a%b;
    break;
    case 6 :
      std::cout<<"Invalid operation";
  }
}