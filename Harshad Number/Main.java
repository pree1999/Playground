#include<iostream>
using namespace std;
int main()
{
  int a,temp,sum=0;
  cin>>a;
  temp=a;
  while(a>0){
    sum=sum+(a%10);
    a=a/10;
  }
  if(temp%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}
