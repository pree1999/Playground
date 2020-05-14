#include<iostream>
using namespace std;
int main()
{
  int fd,fc,sd,sc;
  cin>>fd>>fc>>sd>>sc;
  int td=0,tc=0;
  td=fd+sd;
  tc=fc+sc;
  int temp=fc+sc;
  if(temp>=100){
    td+=1;
    tc=temp-100;
  }
  cout<<td<<"\n"<<tc;
}

