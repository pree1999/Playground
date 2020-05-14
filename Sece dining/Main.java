#include<iostream>
using namespace std;
int main()
{
  string door;
  int n;
  cin>>door>>n;
  if(door=="front")
  {
    if(n==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";}
  else{
    if(n==1)
      cout<<"Right Handed";
    else 
      cout<<"Left Handed";
  }
}