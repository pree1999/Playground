#include<iostream>
using namespace std;
int main()
{
  int n,x1,x2,y1,y2,x3,y3;
  cin>>n>>x1>>y1>>x2>>y2;
  if(n==1)
  {
    x3=x1+x2;
    y3=y1+y2;
    cout<<x3;
    if(y3>=0){cout<<"+";}else{cout<<"-";}
    cout<<y3;
    cout<<"i";
  }
  else if(n==2)
  {
    x3=x1-x2;
    y3=y1-y2;
    cout<<x3;
    if(y3>=0){cout<<"+";}
    else{cout<<"-";}
    cout<<y3;
    cout<<"i";
  }
  else if(n==3)
  {
    x3=(x1*x2)-(y1*y2);
    y3=(x1*y2)+(y1*x2);cout<<x3;
    if(y3>=0){cout<<"+";}
    cout<<y3;cout<<"i";
  }
  else{cout<<"Invalid choice";}
}