#include<iostream>
using namespace std;
int main()
{
  int n,temp=0,hit,cn=0;
  cin>>n;
  while(temp<n){
    cin>>hit;
    temp+=hit;
    cn+=1;
  }
  cout<<"The number of turns is "<< cn;
  
}